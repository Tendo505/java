import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to choose calculation type
        System.out.println("==== Circle Calculator ====");
        System.out.println("1. Calculate Area");
        System.out.println("2. Calculate Perimeter");
        System.out.print("Enter your choice (1 or 2): ");
        
        int choice = scanner.nextInt();
        
        // Prompt for radius
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        
        // Validate radius
        if (radius < 0) {
            System.out.println("Error: Radius cannot be negative!");
            scanner.close();
            return;
        }
        
        // Calculate and display result based on choice
        if (choice == 1) {
            double area = Math.PI * radius * radius;
            System.out.println("\n---- Result ----");
            System.out.println("Area of circle with radius " + radius + " = " + area);
        } else if (choice == 2) {
            double perimeter = 2 * Math.PI * radius;
            System.out.println("\n---- Result ----");
            System.out.println("Perimeter of circle with radius " + radius + " = " + perimeter);
        } else {
            System.out.println("Error: Invalid choice! Please enter 1 or 2.");
        }
        
        scanner.close();
    }
}
