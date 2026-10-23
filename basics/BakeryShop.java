import javax.swing.JOptionPane;

public class BakeryShop {

    public static void main(String[] args) {

        // Item prices
        double strawberryCakePrice = 5.50;
        double miniPizzaPrice = 8.55;
        double chocolateCakePrice = 7.15;

        // Welcome & price list
        JOptionPane.showMessageDialog(null,
                "Welcome to Bakery Shop!\n\n"
                        + "Price List:\n"
                        + "Strawberry Cake : RM 5.50\n"
                        + "Mini Pizza      : RM 8.55\n"
                        + "Chocolate Cake  : RM 7.15");
        //close


        // Ask user for quantity
        String strawberryInput = JOptionPane.showInputDialog(
                "Enter number of Strawberry Cakes:");
        int strawberryQty = Integer.parseInt(strawberryInput);

        String pizzaInput = JOptionPane.showInputDialog(
                "Enter number of Mini Pizzas:");
        int miniPizzaQty = Integer.parseInt(pizzaInput);

        String chocolateInput = JOptionPane.showInputDialog(
                "Enter number of Chocolate Cakes:");
        int chocolateCakeQty = Integer.parseInt(chocolateInput);

        // Calculate total price
        double totalPrice = (strawberryQty * strawberryCakePrice)
                + (miniPizzaQty * miniPizzaPrice)
                + (chocolateCakeQty * chocolateCakePrice);

        // Calculate discount (15%)
        double discount = totalPrice * 0.15;

        // Calculate net price
        double netPrice = totalPrice - discount;

        // Display bill summary
        JOptionPane.showMessageDialog(null,
                "----- BILL SUMMARY -----\n"
                        + "Total Price   : RM " + String.format("%.2f", totalPrice) + "\n"
                        + "Discount 15%  : RM " + String.format("%.2f", discount) + "\n"
                        + "Net Price     : RM " + String.format("%.2f", netPrice));

        System.exit(0);
    }
}
