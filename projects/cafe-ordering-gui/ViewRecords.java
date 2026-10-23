//import package
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class ViewRecords {

    public static void main(String[] args) {
        showRecords();
    }

    public static void showRecords() {
        final JFrame frame = new JFrame("View Records");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 500);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("VIEW ALL RECORDS", JLabel.CENTER);
        JTextArea textArea = new JTextArea();
        JButton backBtn = new JButton("Back");

        JPanel titlePanel = new JPanel();
        titlePanel.setBackground(Color.BLUE);
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("Sans", Font.BOLD, 14));
        titlePanel.add(titleLabel);

        textArea.setEditable(false);
        textArea.setBackground(new Color(15, 23, 42));
        textArea.setForeground(Color.WHITE);
        textArea.setFont(new Font("Courier", Font.PLAIN, 11));

        StringBuffer records = new StringBuffer();
        try {
            BufferedReader br = new BufferedReader(new FileReader("orders.txt"));
            String line;
            int count = 1;

            line = br.readLine();
            while (line != null) {
                String[] data = line.split(",");

                if (data.length >= 6) {
                    records.append("Order No. ").append(count).append("\n");
                    records.append("Order ID: ").append(data[0]).append("\n");
                    records.append("Printing Type: ").append(data[1]).append("\n");
                    records.append("Paper Size: ").append(data[2]).append("\n");
                    records.append("Pages: ").append(data[3]).append("\n");
                    records.append("Quantity: ").append(data[4]).append("\n");
                    records.append("Total Price: RM ").append(data[5]).append("\n");
                    records.append("=========================================\n\n");
                    count++;
                }
                line = br.readLine();
            }
            br.close();

            if (records.length() == 0) {
                records.append("No records found yet.");
            }
        } catch (IOException e) {
            records.append("No records found yet.");
        }

        textArea.setText(records.toString());
        JScrollPane scrollPane = new JScrollPane(textArea);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.setBackground(Color.BLACK);
        backBtn.setBackground(new Color(59, 130, 246));
        backBtn.setForeground(Color.WHITE);
        buttonPanel.add(backBtn);

        backBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                MainMenu.showMainMenu();
            }
        });

        frame.add(titlePanel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}