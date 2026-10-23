/**
 * @(#)testProgramC3V2.java
 *
 *  WHATS NEW??
 *  ADDED DO WHILE untuk continue until user tanak guna
 *
 * @author
 * @version 1.00 2026/4/28
 */

//import package
import java.util.Scanner;

public class testProgramC3V2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int repeat;

        do {
            //input user
            System.out.println("\nChoose a shape: ");
            System.out.println("1. Circle");
            System.out.println("2. Cone");
            System.out.println("3. Cylinder");
            System.out.println("4. Sphere");
            int choice = input.nextInt();

            //ask for radius
            System.out.print("Enter radius: ");
            double r = input.nextDouble();

            //if else statement for Circle
            if (choice == 1) {
                Circle c = new Circle(r);
                System.out.println("Area: " + c.getArea());

            //if else statement for Cone
            } else if (choice == 2) {
                System.out.print("Enter height: ");
                double h = input.nextDouble();
                Cone c = new Cone(r, h);
                System.out.println("Area: " + c.getArea());
                System.out.println("Volume: " + c.getVolume());

            //if else statement for Cylinder
            } else if (choice == 3) {
                System.out.print("Enter height: ");
                double h = input.nextDouble();
                Cylinder c = new Cylinder(r, h);
                System.out.println("Area: " + c.getArea());
                System.out.println("Volume: " + c.getVolume());

            //if else statement for Sphere
            } else if (choice == 4) {
                Sphere c = new Sphere(r);
                System.out.println("Area: " + c.getArea());
                System.out.println("Volume: " + c.getVolume());

            } else {
                System.out.println("Invalid choice!");
            }

            //ask user to continue
            System.out.print("\nDo you want to continue? (5 = Yes, other = No): ");
            repeat = input.nextInt();

        } while (repeat == 5);
    }
}