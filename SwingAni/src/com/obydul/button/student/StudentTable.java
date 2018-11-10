package com.obydul.button.student;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class StudentTable extends JFrame implements ActionListener {

    private JTable table;
    private JScrollPane scroll;
    private DefaultTableModel model;
    private Container c;
    private JLabel titleLabel, fnLabel, lnLabel, phoneLabel, gpaLabel;
    private JTextField fnTf, lnTf, phoneTf, gpaTf;
    private JButton addButton, updateButton, deleteButton, clearButton;

    private String[] columns = {"First Name", "Last Name", "Phone No", "GPA"};
    private String[] rows = new String[4];

    StudentTable() {
        initComponent();
    }

    public void initComponent() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.pink);

        Font font = new Font("Arial", Font.BOLD, 16);

        titleLabel = new JLabel("Student Registration");
        titleLabel.setFont(font);
        titleLabel.setBounds(140, 10, 250, 50);
        c.add(titleLabel);

        fnLabel = new JLabel("First Name");
        fnLabel.setBounds(10, 80, 140, 30);
        fnLabel.setFont(font);
        c.add(fnLabel);

        fnTf = new JTextField();
        fnTf.setBounds(110, 80, 200, 30);
        fnTf.setFont(font);
        c.add(fnTf);

        addButton = new JButton("Add");
        addButton.setBounds(400, 80, 100, 30);
        addButton.setFont(font);
        c.add(addButton);

        lnLabel = new JLabel("Last Name");
        lnLabel.setBounds(10, 120, 140, 30);
        lnLabel.setFont(font);
        c.add(lnLabel);

        lnTf = new JTextField();
        lnTf.setBounds(110, 120, 200, 30);
        lnTf.setFont(font);
        c.add(lnTf);

        updateButton = new JButton("Update");
        updateButton.setBounds(400, 120, 100, 30);
        updateButton.setFont(font);
        c.add(updateButton);

        phoneLabel = new JLabel("Phone");
        phoneLabel.setBounds(10, 160, 140, 30);
        phoneLabel.setFont(font);
        c.add(phoneLabel);

        phoneTf = new JTextField();
        phoneTf.setBounds(110, 160, 200, 30);
        phoneTf.setFont(font);
        c.add(phoneTf);

        deleteButton = new JButton("Delete");
        deleteButton.setBounds(400, 160, 100, 30);
        deleteButton.setFont(font);
        c.add(deleteButton);

        gpaLabel = new JLabel("GPA");
        gpaLabel.setBounds(10, 200, 140, 30);
        gpaLabel.setFont(font);
        c.add(gpaLabel);

        gpaTf = new JTextField();
        gpaTf.setBounds(110, 200, 200, 30);
        gpaTf.setFont(font);
        c.add(gpaTf);

        clearButton = new JButton("Clear");
        clearButton.setBounds(400, 200, 100, 30);
        clearButton.setFont(font);
        c.add(clearButton);

        table = new JTable();

        model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        table.setModel(model);
        table.setFont(font);
        table.setSelectionBackground(Color.green);
        table.setBackground(Color.white);
        table.setRowHeight(30);

        scroll = new JScrollPane(table);
        scroll.setBounds(10, 260, 700, 265);
        c.add(scroll);

        addButton.addActionListener(this);
        updateButton.addActionListener(this);
        deleteButton.addActionListener(this);
        clearButton.addActionListener(this);
        table.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int numOfRow = table.getSelectedRow();
                String f_name = model.getValueAt(numOfRow, 0).toString();
                String l_name = model.getValueAt(numOfRow, 1).toString();
                String phone = model.getValueAt(numOfRow, 2).toString();
                String gpa = model.getValueAt(numOfRow, 3).toString();

                fnTf.setText(f_name);
                lnTf.setText(l_name);
                phoneTf.setText(phone);
                gpaTf.setText(gpa);
            }
        });

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            rows[0] = fnTf.getText();
            rows[1] = lnTf.getText();
            rows[2] = phoneTf.getText();
            rows[3] = gpaTf.getText();
            model.addRow(rows);

        } else if (e.getSource() == clearButton) {
            fnTf.setText("");
            lnTf.setText("");
            phoneTf.setText("");
            gpaTf.setText("");
        } else if (e.getSource() == deleteButton) {
            int numberofRow = table.getSelectedRow();
            if (numberofRow >= 0) {
                model.removeRow(numberofRow);
            } else {
                JOptionPane.showMessageDialog(null, "no row has been selecte or no row exists");
            }
        } else if (e.getSource() == updateButton) {
            int numOfRows = table.getSelectedRow();
            String firstName = fnTf.getText();
            String lastName = lnTf.getText();
            String phone = phoneTf.getText();
            String gpa = gpaTf.getText();
            
            model.setValueAt(firstName, numOfRows, 0);
            model.setValueAt(lastName, numOfRows, 1);
            model.setValueAt(phone, numOfRows, 2);
            model.setValueAt(gpa, numOfRows, 3);
        }
    }

    public static void main(String[] args) {
        StudentTable st = new StudentTable();
        st.setVisible(true);
        st.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        st.setBounds(400, 100, 750, 600);
        st.setTitle("Student Information");
    }

}
