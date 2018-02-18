import javafx.scene.layout.Border;

import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GUI {
    JFrame jFrame=new JFrame("JS Guide");
    JButton reloadButton=new JButton(new ImageIcon("src\\resources\\resize.png"));
    JTextArea jTextArea;
    public GUI(){
       jFrame.getContentPane().setLayout(null);
        jFrame.add(reloadButton);
        reloadButton.setBounds(0,0,40,30);
        jFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        jTextArea=createTextAreaAtScrollPane();

        createTree();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void createTree(){
        JTree jTree=new Contoller().buildTree();
        JScrollPane jScrollPane=new JScrollPane(jTree);
        jTree.addTreeSelectionListener(new TreeSelectionListener() {
            @Override
            public void valueChanged(TreeSelectionEvent e)
                {
                    TreePath parPath=e.getPath().getParentPath();
                    String selected=jTree.getLastSelectedPathComponent().toString();
                    DefaultMutableTreeNode node = (DefaultMutableTreeNode)jTree.getLastSelectedPathComponent();

                    if(parPath.toString().equals("[JsReference]")){
                        for(String s:new Contoller().getSubsections(selected))
                            node.add(new DefaultMutableTreeNode(s));
                        jTree.expandPath(e.getPath());
                    }else {
                        try {
                            jTextArea.setText(new Contoller().getInfoFromSubsection(parPath.getLastPathComponent().toString(),selected));
                        } catch (IOException e1) {
                            e1.printStackTrace();
                        }
                    }
                }
        });
        jScrollPane.setBounds(20,100,200,700);
        jFrame.getContentPane().add(jScrollPane);
    }

    private JTextArea createTextAreaAtScrollPane(){
        JTextArea jTextArea=new JTextArea();
        JScrollPane jScrollPane=new JScrollPane(jTextArea);
        jScrollPane.setBounds(300,100,1000,500);
        jFrame.add(jScrollPane);
        return jTextArea;
    }
}
