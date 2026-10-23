/**
 * @(#)Menu.java
 *
 * Store coffee and tea items in arrays
 * @author
 * @version 1.00 2026/2/15
 */

public class Menu implements Orderable, Discountable {

    String[] coffeeNames = {"Espresso", "Americano", "Cappuccino", "Latte", "Macchiato", "Mocha"};
    double[] coffeePrices = {3.50, 3.00, 4.50, 4.50, 4.00, 5.00};

    String[] teaNames = {"Green Tea", "Black Tea", "Oolong Tea", "Chamomile Tea", "Matcha Latte", "Chai Latte"};
    double[] teaPrices = {2.50, 2.50, 3.00, 3.00, 4.50, 3.50};

    boolean isStudent = false;

    public Menu() {

    public Menu(boolean student) {
        isStudent = student;
    }

    public String getItemName() {
        return "Menu Item";
    }

    public double getPrice() {
        return 0.0;
    }

    public boolean isStudentDiscount() {
        return isStudent;
    }

    public double getDiscountPercentage() {
        // Changed from ternary to if-else for clarity
        if (isStudent) {
            return 0.10; // 10% discount for students
        } else {
            return 0.0;
        }
    }

    public double applyDiscount(double originalPrice) {
        return originalPrice * (1 - getDiscountPercentage());
    }

    public String[] getCoffeeNames() {
        return coffeeNames;
    }

    public double[] getCoffeePrices() {
        return coffeePrices;
    }

    public String[] getTeaNames() {
        return teaNames;
    }

    public double[] getTeaPrices() {
        return teaPrices;
    }

    public void setStudentStatus(boolean student) {
        isStudent = student;
    }
}
}