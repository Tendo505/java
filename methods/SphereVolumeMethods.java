/**
 * @(#)SphereVolumeMethods.java
 *
 *
 * @author
 * @version 1.00 2026/01/05
 */

import javax.swing.JOptionPane;

public class SphereVolumeMethods {
    //main method
    public static void main(String[] args) {
        //declare variable
        String radiusInput;
        double radius;
        
        //ask user for radius
        radiusInput = JOptionPane.showInputDialog(null, "Enter the radius of the sphere:");
        radius = Double.parseDouble(radiusInput);
        
        //invoke method and display result
        double volume = sphereVolume(radius);
        JOptionPane.showMessageDialog(null, "The volume of the sphere with radius " + radius + " is: " + volume);
    }
    
    //method to calculate and return the volume of a sphere
    public static double sphereVolume(double radius) {
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        return volume;
    }
}