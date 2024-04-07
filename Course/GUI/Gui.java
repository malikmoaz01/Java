import javax.swing.JOptionPane;

public class Gui {
    public static void main(String[] args) {
        String weightInput = JOptionPane.showInputDialog("Enter your weight in kilograms:");
        double weight = Double.parseDouble(weightInput);
        String heightInput = JOptionPane.showInputDialog("Enter your height in meters:");
        double height = Double.parseDouble(heightInput);
        double bmi = calculateBMI(weight, height);

        JOptionPane.showMessageDialog(null, "Your BMI is: " + bmi);
    }
    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }
}
