/**
 * @(#)RadiusOfSphereMethods.java
 *
 *
 * @author 
 * @version 1.00 2026/1/8
 */

import javax.swing.JOptionPane;
public class RadiusOfSphere {
    public static void main (String [] args) {
        //declare variables
        String radiusIn;
        double radius,volume;

        //ask user for radius
        radiusIn = JOptionPane.showInputDialog(null, "Enter radius of sphere");
        radius = Double.parseDouble(radiusIn);

        //call method
        volume = sphereVolume(radius);

        //display volume
        JOptionPane.showMessageDialog(null, "The volume of the sphere is " + volume);


    }
    //formal parameters: radius
   public static double sphereVolume(double r) {
        double vol;
        vol = (4.0/3.0) * Math.PI * Math.pow(r, 3);
        return vol;
    }
}