import javax.swing.JOptionPane;

public class test {
    public static void main(String[] args) {

        // Declare variables
        String UltimateHawaiianQty, ClassicChickenQty, SeafoodDelightQty;
        int ultimateHawaiian, classicChicken, seafoodDelight;
        int totalUnit;

        final double ultimateHawaiianPrice = 25.50;
        final double classicChickenPrice = 23.75;
        final double seafoodDelightPrice = 27.60;

        // ask user
        UltimateHawaiianQty = JOptionPane.showInputDialog
                (null, "How many Ultimate Hawaiian:");

        ClassicChickenQty = JOptionPane.showInputDialog
                (null, "How many Classic Chicken:");

        SeafoodDelightQty = JOptionPane.showInputDialog
                (null, "How many Seafood Delight:");

        // convert string to integer
        ultimateHawaiian = Integer.parseInt(UltimateHawaiianQty);
        classicChicken = Integer.parseInt(ClassicChickenQty);
        seafoodDelight = Integer.parseInt(SeafoodDelightQty);

        // calculate total unit
        totalUnit = ultimateHawaiian + classicChicken + seafoodDelight;

        // total price
        double totalPrice =
                (ultimateHawaiian * ultimateHawaiianPrice) +
                        (classicChicken * classicChickenPrice) +
                        (seafoodDelight * seafoodDelightPrice);

        //discount
        double discount = 0.0;
        if (totalUnit > 5) {
            discount = totalPrice * 0.10;
            JOptionPane.showMessageDialog(null, "You got a 10% Discount");
        }

        //ask if student
       String student = JOptionPane.showInputDialog ("Are You a Student?: 1 ");
        //conv string to int
        int Student = Integer.parseInt(student);

        if (Student == 1 ) {
            JOptionPane.showMessageDialog (null, "You get a 30% Discount");
            //calculate discount
            discount = totalPrice * 0.30;
        }


        // Display result
            JOptionPane.showMessageDialog(null,
                "Total Unit   : " + totalUnit +
                        "\nTotal Price  : RM " + totalPrice +
                        "\nDiscount     : RM " + discount +
                        "\nNet Price    : RM " + netPrice);
    }
}

