package com.obydul.menu;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class MyMenu extends JFrame implements ActionListener {
    
    private ImageIcon cutIcon, newIcon;
    private Container c;
    private JMenuBar menubar;
    private JMenu file, edit, help;
    private JMenuItem newItem, openItem, exitItem, cutItem, copyItem, pasteItem, selectAllItem, aboutItem, updateItem;
    
    MyMenu() {
        initComponent();
    }
    
    public void initComponent() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);
        
        cutIcon = new ImageIcon("src/images/cut.png");
        newIcon = new ImageIcon("src/images/new.png");
        
        menubar = new JMenuBar();
        this.setJMenuBar(menubar);
        
        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");
        menubar.add(file);
        menubar.add(edit);
        menubar.add(help);
        
        newItem = new JMenuItem("New");
        newItem.setIcon(newIcon);
        newItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        openItem = new JMenuItem("Open");
        exitItem = new JMenuItem("Exit");
        cutItem = new JMenuItem("Cut");
        cutItem.setIcon(cutIcon);
        copyItem = new JMenuItem("Copy");
        pasteItem = new JMenuItem("Paste");
        selectAllItem = new JMenuItem("Select All");
        aboutItem = new JMenuItem("About");
        updateItem = new JMenuItem("Update Software");
        
        file.add(newItem);
        file.addSeparator();
        file.add(openItem);
        file.add(exitItem);
        
        edit.add(cutItem);
        edit.addSeparator();
        edit.add(copyItem);
        edit.addSeparator();
        edit.add(pasteItem);
        edit.addSeparator();
        edit.add(selectAllItem);
        
        help.add(aboutItem);
        help.add(updateItem);
        
        newItem.addActionListener(this);
        exitItem.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == newItem) {
            JFrame newFrame = new JFrame();
            newFrame.setVisible(true);
            newFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            newFrame.setBounds(300, 100, 250, 250);
            newFrame.setTitle("New Frame");
            
        } else if (e.getSource() == exitItem) {
            System.exit(0);
        }
    }
    
    public static void main(String[] args) {
        MyMenu mm = new MyMenu();
        mm.setVisible(true);
        mm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mm.setBounds(400, 50, 600, 600);
        mm.setTitle("My Menu");
    }
    
}
