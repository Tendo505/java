/*
 * @(#)AgeGroup.java
 *
 * Age Group Classifier
 *
 * @author 
 * @version 1.00 2025/12/26
 */

import javax.swing.JOptionPane;

public class AgeGroup {

    public static void main(String[] args) {

        //declare variable
        String ageInput;
        int age;
        String category;

        //ask user for age
        ageInput = JOptionPane.showInputDialog(null, 
            "Enter your age in years:");
        age = Integer.parseInt(ageInput);

        //if else statement
        if (age < 1) {
            category = "Hello baby";
        } else if (age >= 1 && age <= 4) {
            category = "You are a toddler";
        } else if (age >= 5 && age <= 15) {
            category = "You are a child";
        } else if (age >= 16 && age <= 21) {
            category = "You are an adolescent";
        } else if (age >= 22 && age <= 55) {
            category = "You have earn your right to vote";
        } else {
            category = "Respectful senior citizen";
        }

        //display
        JOptionPane.showMessageDialog(null, 
            "Age: " + age + " years\n" + 
            "Category: " + category);
    }
}