/**
 * @(#)MainMenu.java
 *
 * @author
 * @version 1.00 2026/5/17
 */

//import package
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainMenu extends JFrame implements ActionListener {

    //label
    JLabel title = new JLabel(" MAIN MENU ", SwingConstants.CENTER);

    //buttons
    JButton btn1 = new JButton("1. Register Customer");
    JButton btn2 = new JButton("2. Start Printing Order");
    JButton btn3 = new JButton("3. Calculate Price");
    JButton btn4 = new JButton("4. View Records");
    JButton btn5 = new JButton("5. Exit");

    MainMenu() {
        Container con = getContentPane();
        con.setLayout(new BorderLayout());
        con.setBackground(new Color(0, 255, 255));

        //title
        JPanel titlePanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 16));
        titlePanel.setBackground(new Color(0, 255, 255));
        title.setFont(new Font("SansSerif", Font.BOLD, 18));
        titlePanel.add(title);

        //button
        JPanel btnPanel = new JPanel(new GridLayout(5, 1, 0, 10));
        btnPanel.setBackground(new Color(0, 255, 255));
        btnPanel.add(btn1);
        btnPanel.add(btn2);
        btnPanel.add(btn3);
        btnPanel.add(btn4);
        btnPanel.add(btn5);

        // Wrap to center and add spacing around
        JPanel centerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 60, 16));
        centerPanel.setBackground(new Color(0, 255, 255));
        centerPanel.add(btnPanel);

        con.add(titlePanel,  BorderLayout.NORTH);
        con.add(centerPanel, BorderLayout.CENTER);

        //add action listener
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
    }

    public static void main(String[] args) {
        showMainMenu();
    }

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == btn1) {
            setVisible(false);
            RegisterCustomer.showRegister();
        }
        else if (source == btn2) {
            setVisible(false);
            PrintOrder.showOrder();
        }
        else if (source == btn3) {
            setVisible(false);
            CalculatePrice.showPrice();
        }
        else if (source == btn4) {
            setVisible(false);
            ViewRecords.showRecords();
        }
        else if (source == btn5) {
            System.exit(0);
        }
    }

    public static void showMainMenu() {
        MainMenu frame = new MainMenu();
        frame.setTitle("Printing Management System");
        frame.setSize(400, 340);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}