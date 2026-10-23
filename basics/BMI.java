import javax.swing.JOptionPane;

public class VolumeOfSphere {
    public static void main(String[] args) {

        // declare variables
        String radiusInput;
        double radius, totalVolume;
        final double PI = 3.142;

        // ask user to input radius
        radiusInput = JOptionPane.showInputDialog(null, "Enter radius:");

        // convert String to double
        radius = Double.parseDouble(radiusInput);

        // calculate volume of sphere: (4/3) × π × r³
        totalVolume = (4 / 3) * PI * radius * radius * radius;

        // display result
        JOptionPane.showMessageDialog(
                null,
                "Your Total Volume is: " + String.format("%.2f", totalVolume)
        );
    }
}
