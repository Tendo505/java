import javax.swing.*;
import java.awt.event.*;

public class tester {

    public static void main(String[] args) {

        // Create frame
        JFrame frame = new JFrame("Click Counter");

        // Create button and label
        JButton button = new JButton("Click Me");
        final JLabel label = new JLabel("Clicks: 0");

        // Set positions
        button.setBounds(100, 80, 120, 30);
        label.setBounds(110, 40, 100, 30);

        // Counter variable
        final int[] count = {0};

        // Button click event
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                count[0]++;
                label.setText("Clicks: " + count[0]);
            }
        });

        // Add components
        frame.add(button);
        frame.add(label);

        // Frame settings
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}