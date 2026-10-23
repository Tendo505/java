import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class LoginUser extends JFrame implements ActionListener
{
    // Labels
    JLabel titleLabel   = new JLabel("Coffee and Tea System");
    JLabel userLabel    = new JLabel("Username :");
    JLabel passLabel    = new JLabel("Password :");
    JLabel messageLabel = new JLabel("");

    // Text fields
    JTextField     usernameField = new JTextField("", 15);
    JPasswordField passwordField = new JPasswordField("", 15);

    // Buttons
    JButton loginButton = new JButton("Login");
    JButton exitButton  = new JButton("Exit");

    // Panels
    JPanel p1 = new JPanel(new BorderLayout());
    JPanel p2 = new JPanel(new GridLayout(3, 2, 10, 10));
    JPanel p3 = new JPanel(new FlowLayout(FlowLayout.CENTER));

    // Font
    Font titleFont = new Font("Arial", Font.BOLD, 20);
    LoginUser()
    {
        Container con = getContentPane();
        con.setLayout(new BorderLayout());

        // p1 - title (NORTH)
        titleLabel.setFont(titleFont);
        p1.add(titleLabel, BorderLayout.CENTER);

        // p2 - form (CENTER)
        p2.add(userLabel);
        p2.add(usernameField);
        p2.add(passLabel);
        p2.add(passwordField);
        p2.add(messageLabel);

        // p3 - buttons (SOUTH)
        p3.add(loginButton);
        p3.add(exitButton);
        con.add(p1, BorderLayout.NORTH);
        con.add(p2, BorderLayout.CENTER);
        con.add(p3, BorderLayout.SOUTH);
        loginButton.addActionListener(this);
        exitButton.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        Object source = e.getSource();
        if (source == loginButton)
        {
            String user = usernameField.getText();
            String pass = passwordField.getText();
            if (user.equalsIgnoreCase("admin") && pass.equalsIgnoreCase("admin123"))
            {
                messageLabel.setText("Login Successful!");
                setVisible(false);
                StudentConfirmation sc = new StudentConfirmation();
                sc.setTitle("Student Confirmation");
                sc.setBounds(100, 100, 400, 220);
                sc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                sc.setVisible(true);
            }
            else
            {
                messageLabel.setText("Invalid Username or Password!");
                passwordField = new JPasswordField("", 15);
            }
        }
        else if (source == exitButton)
        {
            System.exit(0);
        }
    }
    public static void main(String[] args)
    {
        LoginUser app = new LoginUser();
        app.setTitle("Coffee and Tea System - Login");
        app.setBounds(100, 100, 420, 250);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}