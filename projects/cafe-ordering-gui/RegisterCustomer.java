/**
 * @(#)RegisterCustomer.java
 *
 * @author
 * @version 1.00 2026/5/17
 */

//import package
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class RegisterCustomer extends JFrame implements ActionListener {

    //labels
    JLabel title     = new JLabel(" Register Customer Data ", SwingConstants.CENTER);
    JLabel CustName  = new JLabel("Customer Name  :");
    JLabel CustPh    = new JLabel("Customer Phone :");
    JLabel OrId      = new JLabel("Order ID       :");
    JLabel DateLabel = new JLabel("Date           :");
    JLabel TimeLabel = new JLabel("Time           :");
    JLabel msgLabel  = new JLabel(" ", SwingConstants.CENTER);

    //text fields
    JTextField tfName  = new JTextField(20);
    JTextField tfPhone = new JTextField(20);
    JTextField tfId    = new JTextField(20);
    JTextField tfDate  = new JTextField(20);
    JTextField tfTime  = new JTextField(20);

    //buttons
    JButton svBtn   = new JButton("Save");
    JButton backBtn = new JButton("Back");

    RegisterCustomer() {
        Container con = getContentPane();
        con.setLayout(new BorderLayout());
        con.setBackground(new Color(0, 255, 255));

        //title
        JPanel titlePanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 12));
        titlePanel.setBackground(new Color(0, 255, 255));
        title.setFont(new Font("SansSerif", Font.BOLD, 15));
        titlePanel.add(title);

        //form
        JPanel formPanel = new JPanel(new GridLayout(5, 2, 10, 10));
        formPanel.setBackground(new Color(0, 255, 255));
        formPanel.add(CustName);  formPanel.add(tfName);
        formPanel.add(CustPh);    formPanel.add(tfPhone);
        formPanel.add(OrId);      formPanel.add(tfId);
        formPanel.add(DateLabel); formPanel.add(tfDate);
        formPanel.add(TimeLabel); formPanel.add(tfTime);

        //spacing
        JPanel spacing = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        spacing.setBackground(new Color(0, 255, 255));
        spacing.add(formPanel);

        //button
        JPanel btnPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 12));
        btnPanel.setBackground(new Color(0, 255, 255));
        btnPanel.add(svBtn);
        btnPanel.add(backBtn);
        btnPanel.add(msgLabel);

        con.add(titlePanel, BorderLayout.NORTH);
        con.add(spacing, BorderLayout.CENTER);
        con.add(btnPanel, BorderLayout.SOUTH);

        //add action listener
        svBtn.addActionListener(this);
        backBtn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        //save button
        if (source == svBtn) {
            try {
                String name    = tfName.getText();
                String phone   = tfPhone.getText();
                String orderId = tfId.getText();
                String date    = tfDate.getText();
                String time    = tfTime.getText();

                if (name.length() == 0) {
                    throw new IllegalArgumentException("Customer name cannot be empty.");
                }
                if (phone.length() == 0) {
                    throw new IllegalArgumentException("Phone number cannot be empty.");
                }
                if (orderId.length() == 0) {
                    throw new IllegalArgumentException("Order ID cannot be empty.");
                }
                if (date.length() == 0) {
                    throw new IllegalArgumentException("Date cannot be empty.");
                }
                if (time.length() == 0) {
                    throw new IllegalArgumentException("Time cannot be empty.");
                }

                //write data to the file
                BufferedWriter bw = new BufferedWriter(new FileWriter("RegisteredCustomers.txt", true));
                bw.write(name + "," + phone + "," + orderId + "," + date + "," + time);
                bw.newLine();
                bw.close();

                msgLabel.setText("Saved successfully.");

            } catch (IllegalArgumentException ex) {
                msgLabel.setText("Input Error: " + ex.getMessage());
            } catch (Exception ex) {
                msgLabel.setText("Unexpected error: " + ex.getMessage());
            }
        }
        //back button
        else if (source == backBtn) {
            setVisible(false);
            MainMenu.showMainMenu();
        }
    }

    public static void showRegister() {
        RegisterCustomer frame = new RegisterCustomer();
        frame.setTitle("Customer Registration");
        frame.setSize(500, 320);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}