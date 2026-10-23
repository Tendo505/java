/**
 * @(#)MenuItem.java
 *
 *
 * @author
 * @version 1.00 2026/2/15
 */

public class MenuItem {

    //instance variables @ global variables @ attributes @ data fields
    String name;
    String category;
    double price;

    //default constructor
    public MenuItem() {
        name = "";
        category = "";
        price = 0.0;
    }

    //constructor with values to assign to instance variables
    public MenuItem(String n, String c, double p) {
        name = n;
        category = c;
        price = p;
    }

    //instance methods for name
    public void setName(String n) {
        name = n;
    }

    //instance methods for category
    public void setCategory(String c) {
        category = c;
    }

    //instance methods for price
    public void setPrice(double p) {
        price = p;
    }

    //instance to get name
    public String getName() {
        return name;
    }

    //instance to get category
    public String getCategory() {
        return category;
    }

    //instance to get price
    public double getPrice() {
        return price;
    }

    //instance to get display string
    public String getDisplayString() {
        return name + " ($" + price + ")";
    }
}