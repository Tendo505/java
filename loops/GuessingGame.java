/**
 * @(#)GuessingGame.java
 *
 * @author 
 * @version 1.00 2025/12/29
 */

import javax.swing.JOptionPane;

public class GuessingGame {
    public static void main(String[] args) {

        //declare variables
        String choiceInput;
        int choice;
        int secret = 7;

        //welcome user
        JOptionPane.showMessageDialog(null, "Welcome to The Guessing Game");

        //using do while loop
        do {
            choiceInput = JOptionPane.showInputDialog(
                    null, "Enter Your Number Between 1 - 10:");

            //convert string to int
            choice = Integer.parseInt(choiceInput);

            if (choice == secret) {
                JOptionPane.showMessageDialog(
                        null, "Congratulations! You did it!");
            } else if (choice < secret) {
                JOptionPane.showMessageDialog(
                        null, "Your guess is low, try again!");
            } else {
                JOptionPane.showMessageDialog(
                        null, "Your guess is high, try again!");
            }
        //keeps on loop because choice is not equal to secret
        } while (choice != secret);
    }
}
