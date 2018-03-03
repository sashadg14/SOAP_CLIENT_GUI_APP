import servise_connectors.SOAPServiseConnector;
import servise_connectors.ServiseConnectorInterphace;
import servise_connectors.ThriftServiseConnector;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.util.List;

public class Contoller {
   // private ServiseConnectorInterphace serviseConnector = new SOAPServiseConnector();
    private ServiseConnectorInterphace serviseConnector = new ThriftServiseConnector();

    public JTree buildTree(){
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("JsReference");
        for (String string :/*serviseConnector.getSectionsArray()*/getSections())
            root.add(new DefaultMutableTreeNode(string));
        JTree jTree = new JTree(root);

        jTree.setShowsRootHandles(true);
        jTree.setRootVisible(false);
        return jTree;
    }

    private List<String> getSections() {
        return serviseConnector.getSectionsArray();
    }

    public List<String> getSubsections(String sectionName) {
        return serviseConnector.getSubsections(sectionName);
    }

    public String getInfoFromSubsection(String sectionName, String subsectionName){
        return serviseConnector.getSubsectionInfo(sectionName,subsectionName);
    }

    public void deleteSubsection(String sectionName, String subsectionName){
            serviseConnector.deleteSubsection(sectionName,subsectionName);
    }

    public void setInfoToSubsection(String sectionName, String subsectionName, String newText){
       serviseConnector.setInfoInSubsection(sectionName,subsectionName,newText);
    }

    public void addSubsection(String sectionName, String subsectionName){
        serviseConnector.addSubsection(sectionName,subsectionName);
    }

    public void addSection(String sectionName){
        serviseConnector.addSection(sectionName);
    }

}
