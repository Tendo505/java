/**
 * @(#)RadiusOfSphereCalculation.java
 *
 *
 * @author 
 * @version 1.00 2025/12/22
 */

import javax.swing.JOptionPane;
public class RadiusOfSphereCalculation {
   public static void main (String [] args){
   	
   	//declare variable
   	String radius1;
   	double radius, volume, area;
    final double PI = 3.142;
   		
   		//ask user input
   		radius1 = JOptionPane.showInputDialog(null, "Enter Radius:");
   		
   		//convert string to double
   	radius = Double.parseDouble(radius1);
   	
   	//calculation
   	area = 4*PI * radius * radius;
    volume = 4/3 * PI * radius * radius * radius;
    
    //display
    JOptionPane.showMessageDialog (null, "Your Area is: " + area + "Your Radius is: " + radius);
   		
   	
   }
   
    }
    
    