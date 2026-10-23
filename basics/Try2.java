import java.util.Scanner;
public class Try2 {
    public static void main (String [] args) {

        Scanner scanner = new Scanner(System.in);

        //Variable Declaration
        int age = 0;
        String name = "";
        double tax = 0.00;

        //Input User00
        System.out.print("Enter Your Name: ");
        name = scanner.nextLine();

        System.out.print("Enter Your Age: ");
        age = scanner.nextInt();

        System.out.print("Enter Your Tax: ");
        tax = scanner.nextInt();

        //close Scanner
        scanner.close();

        //Output
        System.out.println("Hello " + name);
        System.out.println("This is your tax " + tax);

    }
}
