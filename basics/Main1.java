import java.util.Scanner;

public class Main1 {
            public static void main (String[] args) {
                //This is a single line commment
        /* This is a multiline comment */
                //For to ask User to Enter Input
        Scanner scanner= new Scanner(System.in);

        System.out.print("Enter your name:");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Hello "+ name);
        System.out.print("your age is: " + age);

        scanner.close();
//Untuk New line
        System.out.println();
        System.out.println();
        //NL
   System.out.println("I like Pizza!");
   System.out.println("I like Pizza and its really good");
   System.out.println("Im a pizza");
    int year = 2025;
    System.out.println("The year is " + year);

    boolean forStudent = false;
    boolean isSale = true;

    String nama = "amirul harith";

    }
}
