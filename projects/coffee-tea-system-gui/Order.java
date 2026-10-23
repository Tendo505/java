/**
 * @(#)Order.java
 *
 *
 * @author
 * @version 1.00 2026/2/15
 */

import java.util.ArrayList;

public class Order {

    //instance variables @ global variables @ attributes @ data fields
    ArrayList<MenuItem> items;
    boolean student;

    //default constructor
    public Order() {
        items = new ArrayList<MenuItem>();
        student = false;
    }

    //constructor with values to assign to instance variables
    public Order(boolean s) {
        items = new ArrayList<MenuItem>();
        student = s;
    }

    //instance methods for student
    public void setStudent(boolean s) {
        student = s;
    }

    //instance to add item
    public void addItem(MenuItem item) {
        items.add(item);
    }

    //instance to remove item
    public void removeItem(int index) {
        if (index >= 0 && index < items.size()) {
            items.remove(index);
        }
    }

    //instance to clear order
    public void clearOrder() {
        items.clear();
    }

    //instance to get item count
    public int getItemCount() {
        return items.size();
    }

    //instance to get items
    public ArrayList<MenuItem> getItems() {
        return items;
    }

    //instance to get student
    public boolean getStudent() {
        return student;
    }

    //instance to calculate subtotal
    public double calculateSubtotal() {
        double total = 0.0;
        for (int i = 0; i < items.size(); i++) {
            MenuItem item = items.get(i);
            total = total + item.getPrice();
        }
        return total;
    }

    //instance to calculate discount
    public double calculateDiscount() {
        double discount = 0.0;
        if (student == true) {
            discount = calculateSubtotal() * 0.10;
        }
        return discount;
    }

    //instance to calculate total
    public double calculateTotal() {
        return calculateSubtotal() - calculateDiscount();
    }
}