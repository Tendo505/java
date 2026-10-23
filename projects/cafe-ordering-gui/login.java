import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class login extends JFrame implements ActionListener {

    JLabel titleLabel = new JLabel("LOGIN", SwingConstants.CENTER);
    JLabel passLabel = new JLabel("Enter Passcode:");
    JPasswordField passField = new JPasswordField(15);
    JButton loginBtn = new JButton("Login");
    JButton exitBtn = new JButton("Exit");
    JLabel messageLabel = new JLabel(" ", SwingConstants.CENTER);

    // Set your passcode here
    String validPasscode = "1234";

    login() {
        Container con = getContentPane();
        con.setLayout(new BorderLayout());
        con.setBackground(new Color(0, 255, 255));

        // Title panel
        JPanel titlePanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 16));
        titlePanel.setBackground(new Color(0, 255, 255));
        titleLabel.setFont(new Font("SansSerif", Font.BOLD, 18));
        titlePanel.add(titleLabel);

        // Form panel
        JPanel formPanel = new JPanel(new GridLayout(2, 1, 0, 15));
        formPanel.setBackground(new Color(0, 255, 255));

        // Passcode panel
        JPanel passPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 0));
        passPanel.setBackground(new Color(0, 255, 255));
        passLabel.setFont(new Font("SansSerif", Font.PLAIN, 14));
        passField.setPreferredSize(new Dimension(150, 25));
        passPanel.add(passLabel);
        passPanel.add(passField);

        formPanel.add(passPanel);
        formPanel.add(messageLabel);

        // Button panel
        JPanel btnPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 0));
        btnPanel.setBackground(new Color(0, 255, 255));
        loginBtn.setBackground(Color.GREEN);
        loginBtn.setForeground(Color.BLACK);
        exitBtn.setBackground(Color.RED);
        exitBtn.setForeground(Color.WHITE);
        btnPanel.add(loginBtn);
        btnPanel.add(exitBtn);

        // Wrap to center and add spacing
        JPanel centerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 60, 20));
        centerPanel.setBackground(new Color(0, 255, 255));
        centerPanel.add(formPanel);

        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 60, 10));
        bottomPanel.setBackground(new Color(0, 255, 255));
        bottomPanel.add(btnPanel);

        con.add(titlePanel, BorderLayout.NORTH);
        con.add(centerPanel, BorderLayout.CENTER);
        con.add(bottomPanel, BorderLayout.SOUTH);

        loginBtn.addActionListener(this);
        exitBtn.addActionListener(this);

        setTitle("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 340);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginBtn) {
            String passcode = new String(passField.getPassword());

            if (passcode.equals(validPasscode)) {
                messageLabel.setText("Access Granted!");
                messageLabel.setForeground(Color.GREEN);

                // Close login and open main menu
                this.dispose();
                MainMenu.showMainMenu();
            } else {
                messageLabel.setText("Wrong Passcode!");
                messageLabel.setForeground(Color.RED);
                passField.setText("");
            }
        } else if (e.getSource() == exitBtn) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new login();
    }
}