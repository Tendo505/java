/*
 * @(#)PackageDiscount.java
 *
 * Package Discount Calculator
 *
 * @author 
 * @version 1.00 2025/12/26
 */

import javax.swing.JOptionPane;

public class PackageDiscount {

    public static void main(String[] args) {

        //declare variable
        String quantityInput;
        int quantity;
        double packagePrice = 99.0;
        double subtotal, discountRate, discountAmount, totalAfterDiscount;

        //ask user for quantity
        quantityInput = JOptionPane.showInputDialog(null, 
            "Enter the number of packages purchased:");
        quantity = Integer.parseInt(quantityInput);

        //calculate subtotal
        subtotal = quantity * packagePrice;

        //determine discount rate based on quantity
        if (quantity >= 1 && quantity <= 9) {
            discountRate = 0.10;
        } else if (quantity >= 10 && quantity <= 19) {
            discountRate = 0.20;
        } else if (quantity >= 20 && quantity <= 49) {
            discountRate = 0.30;
        } else if (quantity >= 50 && quantity <= 99) {
            discountRate = 0.40;
        } else {
            discountRate = 0.50;
        }

        //calculation
        discountAmount = subtotal * discountRate;
        totalAfterDiscount = subtotal - discountAmount;

        //display
        JOptionPane.showMessageDialog(null, 
            "Package Price: RM" + packagePrice + "\n" + 
            "Quantity: " + quantity + "\n" + 
            "Subtotal: RM" + subtotal + "\n\n" +
            "Discount Rate: " + (discountRate * 100) + "%" + "\n" + 
            "Discount Amount: RM" + discountAmount + "\n\n" + 
            "Total After Discount: RM" + totalAfterDiscount);
    }
}