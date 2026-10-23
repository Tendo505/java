/* 
 * @(#)VolumeCalculator.java
 *
 * Volume Calculator for Different Shapes
 *
 * @author 
 * @version 1.00 2025/12/28
 */

import javax.swing.JOptionPane;

public class VolumeCalculator {

    public static void main(String[] args) {

        //declare variable
        String menuInput, input1, input2, input3;
        int choice;
        double volume;
        final double PI = 3.14159;

        //display menu
        menuInput = JOptionPane.showInputDialog(null, 
            "\t VOLUME CALCULATOR \t\n" +
            "1. Cube\n" +
            "2. Cylinder\n" +
            "3. Pyramid\n" +
            "4. Cone\n" +
            "5. Sphere\n" +
            "\t Please enter your choice: \t");
        //convert string to int
        choice = Integer.parseInt(menuInput);

        if(choice == 1) {
            //cube
            input1 = JOptionPane.showInputDialog(null, 
                "Enter the length of the cube:");
            double length = Double.parseDouble(input1);
            
            volume = length * length * length;
            
            JOptionPane.showMessageDialog(null, 
                "Volume of Cube = " + volume);
        }
        else if(choice == 2) {
            //cylinder
            input1 = JOptionPane.showInputDialog(null, 
                "Enter the radius of the cylinder:");
            double radius = Double.parseDouble(input1);
            
            input2 = JOptionPane.showInputDialog(null, 
                "Enter the height of the cylinder:");
            double height = Double.parseDouble(input2);
            
            volume = PI * radius * radius * height;
            
            JOptionPane.showMessageDialog(null, 
                "Volume of Cylinder = " + volume);
        }
        else if(choice == 3) {
            //pyramid
            input1 = JOptionPane.showInputDialog(null, 
                "Enter the length of the pyramid:");
            double length = Double.parseDouble(input1);
            
            input2 = JOptionPane.showInputDialog(null, 
                "Enter the width of the pyramid:");
            double width = Double.parseDouble(input2);
            
            input3 = JOptionPane.showInputDialog(null, 
                "Enter the height of the pyramid:");
            double height = Double.parseDouble(input3);
            
            volume = (1.0 / 3.0) * length * width * height;
            
            JOptionPane.showMessageDialog(null, 
                "Volume of Pyramid = " + volume);
        }
        else if(choice == 4) {
            //cone
            input1 = JOptionPane.showInputDialog(null, 
                "Enter the radius of the cone:");
            double radius = Double.parseDouble(input1);
            
            input2 = JOptionPane.showInputDialog(null, 
                "Enter the height of the cone:");
            double height = Double.parseDouble(input2);
            
            volume = (1.0 / 3.0) * PI * radius * radius * height;
            
            JOptionPane.showMessageDialog(null, 
                "Volume of Cone = " + volume);
        }
        else if(choice == 5) {
            //sphere
            input1 = JOptionPane.showInputDialog(null, 
                "Enter the radius of the sphere:");
            double radius = Double.parseDouble(input1);
            
            volume = (4.0 / 3.0) * PI * radius * radius * radius;
            
            JOptionPane.showMessageDialog(null, 
                "Volume of Sphere = " + volume);
        }
        else {
            JOptionPane.showMessageDialog(null, 
                "Invalid choice");
        }
    }
}