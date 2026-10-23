/**
 * @(#)RestaurantSystem.java
 *
 *
 * @author 
 * @version 1.00 2025/12/22
 */

import javax.swing.JOptionPane;
public class RestaurantSystem  {
  	public static void main (String[] args) {
    	
    		
    		//declare variable
    		String Meal;
    		final double tax = 0.0675;
    		final double tip = 0.2;
    		double TotalBill,TipAmount, meal;
    		
           //ask input (string)
           Meal = JOptionPane.showInputDialog(null, "Charge of The Meal : ");
        
 
           //conv string to int
            meal= Double.parseDouble(Meal);
           
           //calculate
           TotalBill = (meal / tax); 
           TipAmount = TotalBill * tip;
           
           //Display
           JOptionPane.showMessageDialog(null,"Meal Charge" + meal + "Your tax amount is: " + tax + "Your tip amount is: " + tip + "Your total bill is : " + TotalBill);
           
    }    }
    