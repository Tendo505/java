/* 
 * @(#)TrianglePerimeter.java
 *
 * Triangle Perimeter Calculator with Validation
 *
 * @author 
 * @version 1.00 2025/12/28
 */

import javax.swing.JOptionPane;

public class TrianglePerimeter {

    public static void main(String[] args) {

        //declare variable
        String edge1Input, edge2Input, edge3Input;
        double edge1, edge2, edge3, perimeter;
        

        //ask user for three edges
        edge1Input = JOptionPane.showInputDialog(null, 
            "Enter the first edge of the triangle:");
        edge1 = Double.parseDouble(edge1Input);

        edge2Input = JOptionPane.showInputDialog(null, 
            "Enter the second edge of the triangle:");
        edge2 = Double.parseDouble(edge2Input);

        edge3Input = JOptionPane.showInputDialog(null, 
            "Enter the third edge of the triangle:");
        edge3 = Double.parseDouble(edge3Input);
        
        //if else (valid)
        if (edge1 + edge2 > edge3 && ) {
        	//calculation
        	perimeter = edge1 + edge2 + edge3;
        	JOptionPane.showMessageDialog(null, "Valid Egde! Perimeter: "+perimeter);
        	
        }
        else{
        	JOptionPane.showMessageDialog(null, "Invalid Edge!");
        }
        
        
        
    }
}

      