import javax.swing.*;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;
import java.awt.event.ActionListener;
import java.io.IOException;

public class GUI {
    JFrame jFrame = new JFrame("JS Guide");
    JButton reloadButton = new JButton(new ImageIcon("src\\resources\\resize.png"));
    JTextArea jTextArea;
    JButton editTextButton;
    JButton addSubsectionButton;
    JButton addSectionButton;
    JButton deleteSubsectionButton;
    Contoller contoller = new Contoller();


    public GUI() {
        deleteSubsectionButton = new JButton("Удалить подраздел");
        editTextButton = new JButton("Изменить содержимое");
        addSubsectionButton = new JButton("Добавить подраздел");
        addSectionButton= new JButton("Добавить раздел");

        jFrame.getContentPane().setLayout(null);
        jFrame.add(reloadButton);
        reloadButton.setBounds(0, 0, 40, 30);
        jFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        jTextArea = createTextAreaAtScrollPane();
        reloadButton.addActionListener(e -> {
                createTree();
        });

        addSubsectionButton.setBounds(200, 0, 300, 30);
        addSubsectionButton.addActionListener(createAddSubsectionBtnActionListener());
        jFrame.add(addSubsectionButton);

        addSectionButton.setBounds(200, 50, 300, 30);
        addSectionButton.addActionListener(createAddSectionBtnActionListener());
        jFrame.add(addSectionButton);

        deleteSubsectionButton.setBounds(200, 100, 300, 30);
        deleteSubsectionButton.addActionListener(createDeleteBtnActionListener());
        jFrame.add(deleteSubsectionButton);

        editTextButton.setBounds(1000, 700, 200, 30);
        editTextButton.addActionListener(createEditBtnActionListener());
        jFrame.add(editTextButton);

        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private ActionListener createEditBtnActionListener() {
        return e -> {
            try {
                contoller.setInfoToSubsection(parPath.getLastPathComponent().toString(),selectedObj.toString(),jTextArea.getText());
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        };
    }

    private ActionListener createDeleteBtnActionListener() {
        return e -> {
            if(selectedObj!=null) {
                contoller.deleteSubsection(parPath.getLastPathComponent().toString(), selectedObj.toString());
                createTree();
            }
        };
    }

    private ActionListener createAddSubsectionBtnActionListener() {
        return e -> {
                String n=JOptionPane.showInputDialog ("Название подраздела");
                if(n!=null&&!n.equals(""))
                contoller.addSubsection(selectedSection.toString(),n);
                createTree();
        };
    }

    private ActionListener createAddSectionBtnActionListener() {
        return e -> {
                String sectionName=JOptionPane.showInputDialog ("Название раздела");
                String subSectionName=JOptionPane.showInputDialog ("Название подраздела");
                if(sectionName!=null&&!sectionName.equals("")&&subSectionName!=null&&!subSectionName.equals(""))
                contoller.addSubsection(sectionName,subSectionName);
           createTree();
        };
    }
    JTree jTree;
    JScrollPane jScrollPane;
    private void createTree(){
        if(jScrollPane!=null)
        jFrame.remove(jScrollPane);
        jTree= new Contoller().buildTree();
        jScrollPane = new JScrollPane(jTree);
        jScrollPane.setBounds(20, 100, 200, 700);
        jFrame.add(jScrollPane);
        jScrollPane.updateUI();
        jTree.addTreeSelectionListener(createTreeSelectionListener(jTree));
    }

    TreePath parPath;
    Object selectedObj;
    Object selectedSection;

    private TreeSelectionListener createTreeSelectionListener(JTree jTree) {
        return e -> {
            parPath = e.getPath().getParentPath();
            selectedObj = jTree.getLastSelectedPathComponent();
            String selected = selectedObj.toString();
            DefaultMutableTreeNode node = (DefaultMutableTreeNode) jTree.getLastSelectedPathComponent();
            if (parPath.toString().equals("[JsReference]")) {
                addSubsectionButton.setText("Добавить подраздел в " + selected);
                for (String s : new Contoller().getSubsections(selected))
                    node.add(new DefaultMutableTreeNode(s));
                jTree.expandPath(e.getPath());
                selectedObj=null;
                selectedSection=jTree.getLastSelectedPathComponent();
            } else {
                    jTextArea.setText(new Contoller().getInfoFromSubsection(parPath.getLastPathComponent().toString(), selected));
            }
        };
    }



    private JTextArea createTextAreaAtScrollPane() {
        JTextArea jTextArea = new JTextArea();
        JScrollPane jScrollPane = new JScrollPane(jTextArea);
        jScrollPane.setBounds(300, 150, 1000, 500);
        jFrame.add(jScrollPane);
        return jTextArea;
    }
}
