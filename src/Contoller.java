import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;
import java.io.*;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Contoller {
    ServiseConnector serviseConnector = new ServiseConnector();

    public JTree buildTree(){
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("JsReference");
        for (String string :/*serviseConnector.getSectionsArray()*/getSections())
            root.add(new DefaultMutableTreeNode(string));
        JTree jTree = new JTree(root);

        jTree.setShowsRootHandles(true);
        jTree.setRootVisible(false);
        return jTree;
    }

    public List<String> getSections() {
        List<String> sectionList = new ArrayList<>();
        /*File mainDir = new File("JsReference");
        for (File file : Objects.requireNonNull(mainDir.listFiles()))
            sectionList.add(file.getName());*/
        try {
            sectionList= /*new DataBaseConnector().getSections()*/Arrays.asList(serviseConnector.getSectionsArray());
        } catch (RemoteException e) {
            e.printStackTrace();
        }

        return sectionList;
    }

    public List<String> getSubsections(String sectionName) {
        List<String> strings = new ArrayList<>();
        /*for (String str : getSections())
            if (str.equals(sectionName)) {
                File file = new File("JsReference\\" + sectionName);
                for (File file1 : file.listFiles()) {
                    strings.add(file1.getName());
                }
            }*/
        try {
            strings=new DataBaseConnector().getSubections(sectionName);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return strings;
    }

    public String getInfoFromSubsection(String sectionName, String subsectionName){
        /*File file = new File("JsReference\\" + sectionName + "\\" + subsectionName);
        FileInputStream fstream = new FileInputStream(file);
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
        String strLine;
        StringBuilder stringBuilder = new StringBuilder();
        while ((strLine = br.readLine()) != null) {
            stringBuilder.append(strLine + "\n");
        }*/
        try {
            return new DataBaseConnector().getSubectionData(sectionName,subsectionName);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "";
    }

    public void deleteSubsection(String sectionName, String subsectionName){
        try {
            new DataBaseConnector().deleteSubsection(sectionName,subsectionName);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void setInfoToSubsection(String sectionName, String subsectionName, String newText) throws IOException {
        /*File file = new File("JsReference\\" + sectionName + "\\" + subsectionName);
        PrintWriter printWriter = new PrintWriter(file);
        printWriter.print(newText);
        printWriter.close();*/
        String s=newText.replace("'","\\'");
       // System.out.println(s);
        try {
            new DataBaseConnector().setSubsectionData(sectionName,subsectionName,s);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addSubsection(String sectionName, String subsectionName){
        try {
            new DataBaseConnector().addNewSubsection(sectionName,subsectionName);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
