import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;

public class JavaLoginInterface {

    public static void main(String[] args) {

        // Create Frame
        final JFrame frame = new JFrame(null, "Cafe Login");
        frame.setSize(350, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Title Label
        JLabel titleLabel = new JLabel("Cafe Login System");
        titleLabel.setBounds(90, 10, 200, 30);
        frame.add(titleLabel);

        // Username Label
        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(40, 60, 80, 25);
        frame.add(userLabel);

        // Username TextField
        final JTextField userText = new JTextField();
        userText.setBounds(120, 60, 150, 25);
        frame.add(userText);

        // Password Label
        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(40, 100, 80, 25);
        frame.add(passLabel);

        // Password Field
        final JPasswordField passText = new JPasswordField();
        passText.setBounds(120, 100, 150, 25);
        frame.add(passText);

        // Login Button
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(120, 140, 80, 30);
        frame.add(loginButton);

        // Button Action
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String username = userText.getText();
                String password = String.valueOf(passText.getPassword());

                if (username.equals("admin") && password.equals("1234")) {
                    JOptionPane.showMessageDialog(frame, "Login Successful!");
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid Username or Password");
                }
            }
        });

        // Show Frame
        frame.setVisible(true);
    }
}
