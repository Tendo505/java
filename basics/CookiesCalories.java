import javax.swing.JOptionPane;

public class CookiesCalories {
    public static void main(String[] args) {

        // declare variables
        String Cookies;
        final int cookieCal = 300;
        final int cookieServ = 10;

        int cookiesEaten;
        int totalCalories;

        // ask user input
        Cookies = JOptionPane.showInputDialog(null,"Enter number of cookies you ate:");

        // convert string to int
        cookiesEaten = Integer.parseInt(Cookies);

        // calculate calories
        int caloriesPerCookie = cookieCal/cookieServ;
        totalCalories = cookiesEaten * caloriesPerCookie;

        // display
        JOptionPane.showMessageDialog(null,"Total Calories Consumed is: " + totalCalories
        );
    }
}
