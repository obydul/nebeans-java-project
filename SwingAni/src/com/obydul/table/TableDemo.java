package com.obydul.table;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TableDemo extends JFrame {

    private Container c;
    private JLabel label;
    private Font font;
    private JTable table;
    private JScrollPane pane;

    private String[] cols = {"ID", "Name", "GPA"};
    private String[][] rows = {
        {"101", "Obydul", "4.00"},
        {"102", "Islam", "4.10"},
        {"103", "Obayed", "4.20"},
        {"104", "Baidul", "4.30"},
        {"105", "ABC", "4.50"}
    };

    TableDemo() {
        initComponent();
    }

    public void initComponent() {
        c = this.getContentPane();
        c.setLayout(null);
        font = new Font("Arial", Font.BOLD, 18);

        label = new JLabel("Student Details");
        label.setBounds(150, 20, 200, 50);
        label.setFont(font);
        c.add(label);

        table = new JTable(rows, cols);
        table.setSelectionBackground(Color.lightGray);
        //table.setEnabled(false);

        pane = new JScrollPane(table);
        pane.setBounds(50, 80, 400, 150);
        c.add(pane);

    }

    public static void main(String[] args) {
        TableDemo tm = new TableDemo();
        tm.setVisible(true);
        tm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tm.setBounds(500, 100, 500, 500);
        tm.setTitle("Table Demo");
    }

}
