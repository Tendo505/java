/* 
 * @(#)TheaterTicket.java
 *
 * Theater Ticket Charge Calculator
 *
 * @author 
 * @version 1.00 2025/12/26
 */

import javax.swing.JOptionPane;

public class TheaterTicket {

    public static void main(String[] args) {

        //declare variable
        String ageInput, quantityInput;
        int age, quantity;
        double chargePerTicket, totalAmount, discountAmount, finalAmount;

        //ask user for age
        ageInput = JOptionPane.showInputDialog(null, 
            "Enter the age of the person:");
        age = Integer.parseInt(ageInput);

        //ask user for quantity
        quantityInput = JOptionPane.showInputDialog(null, 
            "Enter the quantity of tickets:");
        quantity = Integer.parseInt(quantityInput);

        //determine charge per ticket based on age
        if(age > 55) {
            chargePerTicket = 10.00;
        }
        else if(age >= 21 && age <= 54) {
            chargePerTicket = 15.00;
        }
        else if(age >= 13 && age <= 20) {
            chargePerTicket = 10.00;
        }
        else if(age >= 3 && age <= 12) {
            chargePerTicket = 5.00;
        }
        else {
            chargePerTicket = 0.00;
        }

        //calculate total amount
        totalAmount = chargePerTicket * quantity;

        //apply 30% discount if total is more than RM30
        if(totalAmount > 30) {
            discountAmount = totalAmount * 0.30;
            finalAmount = totalAmount - discountAmount;

            JOptionPane.showMessageDialog(null, 
                "Age: " + age + "\n" + 
                "Quantity: " + quantity + "\n" + 
                "Charge per ticket: RM" + chargePerTicket + "\n\n" +
                "Total Amount: RM" + totalAmount + "\n" +
                "Discount (30%): RM" + discountAmount + "\n" +
                "Final Amount: RM" + finalAmount);
        }
        else {
            JOptionPane.showMessageDialog(null, 
                "Age: " + age + "\n" + 
                "Quantity: " + quantity + "\n" + 
                "Charge per ticket: RM" + chargePerTicket + "\n\n" +
                "Total Amount: RM" + totalAmount + "\n" +
                "No discount applied");
        }
    }
}