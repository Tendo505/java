import javax.swing.JOptionPane;

public class Question3Style {
    public static void main(String[] args) {
        String Number1In, Number2In, Number3In;
        int Sum;
        double Average;
        int Product;
        int Min, Max;
        
        Number1In = JOptionPane.showInputDialog(null, "Enter first integer:");
        Number2In = JOptionPane.showInputDialog(null, "Enter second integer:");
        Number3In = JOptionPane.showInputDialog(null, "Enter third integer:");
        
        int Number1 = Integer.parseInt(Number1In);
        int Number2 = Integer.parseInt(Number2In);
        int Number3 = Integer.parseInt(Number3In);
        
        Sum = Number1 + Number2 + Number3;
        Average = Sum / 3.0;
        Product = Number1 * Number2 * Number3;
        
        Min = Number1;
        if(Number2 < Min){
            Min = Number2;
        }
        if(Number3 < Min){
            Min = Number3;
        }
        
        Max = Number1;
        if(Number2 > Max){
            Max = Number2;
        }
        if(Number3 > Max){
            Max = Number3;
        }
        
        JOptionPane.showMessageDialog(null, 
            "Sum: " + Sum + 
            "\nAverage: " + Average + 
            "\nProduct: " + Product + 
            "\nMinimum: " + Min + 
            "\nMaximum: " + Max);
        
        System.out.println("Sum: " + Sum + 
            "\nAverage: " + Average + 
            "\nProduct: " + Product + 
            "\nMinimum: " + Min + 
            "\nMaximum: " + Max);
    }
}