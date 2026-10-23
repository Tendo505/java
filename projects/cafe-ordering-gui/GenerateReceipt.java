//import package
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class GenerateReceipt {

    public static void main(String[] args) {
        showReceipt("TEST001", "Color", "A4", 1, 1, 0.50);
    }

    public static void showReceipt(final String orderId, final String printType, final String paperSize,
                                   final int pages, final int quantity, final double totalPrice) {
        final JFrame frame = new JFrame("Generate Receipt");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 500);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("RECEIPT", JLabel.CENTER);
        final JLabel messageLabel = new JLabel(" ");
        JButton saveBtn = new JButton("Save Record");
        JButton doneBtn = new JButton("Done");

        double unitPrice = 0.0;
        if (printType.equals("Color") && paperSize.equals("A4")) {
            unitPrice = 0.50;
        } else if (printType.equals("Color") && paperSize.equals("A3")) {
            unitPrice = 1.00;
        } else if (printType.equals("Black & White") && paperSize.equals("A4")) {
            unitPrice = 0.20;
        } else if (printType.equals("Black & White") && paperSize.equals("A3")) {
            unitPrice = 0.40;
        }

        JPanel titlePanel = new JPanel();
        titlePanel.setBackground(Color.BLUE);
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        titlePanel.add(titleLabel);

        JPanel formPanel = new JPanel(new GridLayout(8, 2, 10, 10));
        formPanel.setBackground(Color.BLUE);
        formPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 10, 20));

        JLabel[] labels = new JLabel[8];
        labels[0] = new JLabel("Order ID:");
        labels[1] = new JLabel("Printing Type:");
        labels[2] = new JLabel("Paper Size:");
        labels[3] = new JLabel("Pages:");
        labels[4] = new JLabel("Quantity:");
        labels[5] = new JLabel("Unit Price:");
        labels[6] = new JLabel("Total Price:");
        labels[7] = new JLabel(" ");

        for (int i = 0; i < labels.length; i++) {
            labels[i].setForeground(Color.WHITE);
        }

        JLabel[] values = new JLabel[8];
        values[0] = new JLabel(orderId);
        values[1] = new JLabel(printType);
        values[2] = new JLabel(paperSize);
        values[3] = new JLabel(String.valueOf(pages));
        values[4] = new JLabel(String.valueOf(quantity));
        values[5] = new JLabel("RM " + String.format("%.2f", unitPrice));
        values[6] = new JLabel("RM " + String.format("%.2f", totalPrice));
        values[7] = messageLabel;

        for (int i = 0; i < values.length; i++) {
            values[i].setForeground(Color.WHITE);
        }

        values[6].setFont(new Font("Arial", Font.BOLD, 14));
        values[6].setForeground(new Color(100, 200, 0));

        for (int i = 0; i < 8; i++) {
            formPanel.add(labels[i]);
            formPanel.add(values[i]);
        }

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.setBackground(Color.BLACK);

        saveBtn.setBackground(new Color(59, 130, 246));
        saveBtn.setForeground(Color.WHITE);
        doneBtn.setBackground(new Color(59, 130, 246));
        doneBtn.setForeground(Color.WHITE);

        buttonPanel.add(saveBtn);
        buttonPanel.add(doneBtn);

        saveBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    BufferedWriter bw = new BufferedWriter(new FileWriter("orders.txt", true));
                    String record = orderId + "," + printType + "," + paperSize + "," +
                            pages + "," + quantity + "," + String.format("%.2f", totalPrice);
                    bw.write(record);
                    bw.newLine();
                    bw.close();

                    messageLabel.setText("Saved successfully!");
                    messageLabel.setForeground(new Color(100, 200, 0));
                } catch (IOException ex) {
                    messageLabel.setText("Error saving!");
                    messageLabel.setForeground(Color.RED);
                }
            }
        });

        doneBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                MainMenu.showMainMenu();
            }
        });

        frame.add(titlePanel, BorderLayout.NORTH);
        frame.add(formPanel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);
        frame.setVisible(true);
    }
}