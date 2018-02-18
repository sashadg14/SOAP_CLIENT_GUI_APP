import service.Section;

import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Contoller {
    public JTree buildTree(){
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("JsReference");
        for(String string:getSections())
        root.add(new DefaultMutableTreeNode(string));

        JTree jTree=new JTree(root);
        jTree.setShowsRootHandles(true);
        jTree.setRootVisible(false);
        return jTree;
    }

    public List<String> getSections(){
        List<String> sectionList=new ArrayList<>();
        File mainDir=new File("JsReference");
        for(File file: Objects.requireNonNull(mainDir.listFiles()))
            sectionList.add(file.getName());
        return sectionList;
    }

    public List<String> getSubsections(String sectionName){
        List<String> strings=new ArrayList<>();
        for (String str:getSections())
            if(str.equals(sectionName)){
                File file=new File("JsReference\\"+sectionName);
                for(File file1:file.listFiles()) {
                    strings.add(file1.getName());
                }
            }
        return strings;
    }

    public String getInfoFromSubsection(String sectionName,String subsectionName) throws IOException {
        File file=new File("JsReference\\"+sectionName+"\\"+subsectionName);
        FileInputStream fstream = new FileInputStream(file);
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
        String strLine;
        StringBuilder stringBuilder=new StringBuilder();
        while ((strLine = br.readLine()) != null){
            stringBuilder.append(strLine+"\n");
        }
        return stringBuilder.toString();
    }
}
