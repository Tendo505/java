import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class StudentConfirmation extends JFrame implements ActionListener
{
    // Labels
    JLabel questionLabel = new JLabel("Is customer a student?");
    JLabel discountLabel = new JLabel("(Students get 10% discount!)");

    // Buttons
    JButton yesButton = new JButton("Yes");
    JButton noButton  = new JButton("No");

    // Panels
    JPanel p1 = new JPanel(new GridLayout(2, 1));
    JPanel p2 = new JPanel(new FlowLayout(FlowLayout.CENTER));

    // Fonts
    Font questionFont = new Font("Arial", Font.BOLD, 18);
    Font subFont      = new Font("Arial", Font.PLAIN, 13);
    StudentConfirmation()
    {
        Container con = getContentPane();
        con.setLayout(new BorderLayout());

        // set fonts
        questionLabel.setFont(questionFont);
        discountLabel.setFont(subFont);

        // p1 - question (CENTER)
        p1.add(questionLabel);
        p1.add(discountLabel);

        // p2 - buttons (SOUTH)
        p2.add(yesButton);
        p2.add(noButton);
        con.add(p1, BorderLayout.CENTER);
        con.add(p2, BorderLayout.SOUTH);
        yesButton.addActionListener(this);
        noButton.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
        Object source = e.getSource();
        if (source == yesButton)
        {
            setVisible(false);
            MainMenu mm = new MainMenu(true);
            mm.setTitle("Coffee and Tea System");
            mm.setBounds(100, 100, 820, 550);
            mm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mm.setVisible(true);
        }
        else if (source == noButton)
        {
            setVisible(false);
            MainMenu mm = new MainMenu(false);
            mm.setTitle("Coffee and Tea System");
            mm.setBounds(100, 100, 820, 550);
            mm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mm.setVisible(true);
        }
    }
}