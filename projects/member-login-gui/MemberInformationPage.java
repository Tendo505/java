import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MemberInformationPage extends JFrame {
    private JTextField nameField;
    private JTextField phoneField;
    private JRadioButton maleRadio;
    private JRadioButton femaleRadio;
    private ButtonGroup genderGroup;
    private JButton submitButton;

    public MemberInformationPage() {
        setTitle("Member Information");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        // Title Label
        JLabel titleLabel = new JLabel("Member Information");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setBounds(90, 20, 250, 30);
        add(titleLabel);

        // Name Label and TextField
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 70, 100, 25);
        add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(150, 70, 200, 25);
        add(nameField);

        // Phone Number Label and TextField
        JLabel phoneLabel = new JLabel("Phone Number:");
        phoneLabel.setBounds(50, 110, 100, 25);
        add(phoneLabel);

        phoneField = new JTextField();
        phoneField.setBounds(150, 110, 200, 25);
        add(phoneField);

        // Gender Label
        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(50, 150, 100, 25);
        add(genderLabel);

        // Radio Buttons for Gender
        maleRadio = new JRadioButton("Male");
        maleRadio.setBounds(150, 150, 80, 25);
        add(maleRadio);

        femaleRadio = new JRadioButton("Female");
        femaleRadio.setBounds(240, 150, 100, 25);
        add(femaleRadio);

        // Button Group to ensure only one radio button is selected
        genderGroup = new ButtonGroup();
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);

        // Submit Button
        submitButton = new JButton("Submit");
        submitButton.setBounds(150, 200, 100, 30);
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String phone = phoneField.getText();
                String gender = "";

                if (maleRadio.isSelected()) {
                    gender = "Male";
                } else if (femaleRadio.isSelected()) {
                    gender = "Female";
                }

                // Validation
                if (name.isEmpty() || phone.isEmpty() || gender.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill in all fields!", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    // Display the information
                    String message = "Name: " + name + "\nPhone: " + phone + "\nGender: " + gender;
                    JOptionPane.showMessageDialog(null, message, "Member Information Submitted", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        add(submitButton);
    }
}
