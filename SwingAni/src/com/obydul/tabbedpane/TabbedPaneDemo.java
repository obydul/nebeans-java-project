package com.obydul.tabbedpane;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class TabbedPaneDemo extends JFrame {
    
    private Container c;
    private JTabbedPane tpane;
    private JPanel panel1, panel2, panel3;
    private JLabel lbl1, lbl2, lbl3;
    private ImageIcon homeIcon, helpIcon;
    
    TabbedPaneDemo() {
        initComponent();
    }
    
    public void initComponent() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);
        
        tpane = new JTabbedPane();
       // tpane.setTabPlacement(JTabbedPane.BOTTOM);
        tpane.setBounds(50, 50, 300, 300);
        c.add(tpane);
        
        homeIcon = new ImageIcon("src/images/home.jpg");
        helpIcon = new ImageIcon("src/images/help.jpg");
        
        lbl1 = new JLabel("This is Home");
        lbl2 = new JLabel("This is Edit");
        lbl3 = new JLabel("This is Help");
        
        panel1 = new JPanel();
        panel1.add(lbl1);
        panel1.setBackground(Color.red);
        panel2 = new JPanel();
        panel2.add(lbl2);
        panel2.setBackground(Color.yellow);
        panel3 = new JPanel();
        panel3.add(lbl3);
        panel3.setBackground(Color.green);
        
        tpane.addTab("Home", homeIcon, panel1, "Home panel tab");
        tpane.addTab("Edit", helpIcon, panel2, "Edit panel tab");
        tpane.addTab("Help", panel3);
    }
    
    public static void main(String[] args) {
        TabbedPaneDemo tp = new TabbedPaneDemo();
        tp.setVisible(true);
        tp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tp.setBounds(500, 100, 500, 500);
        tp.setTitle("Tabbed Pane");
    }
}
