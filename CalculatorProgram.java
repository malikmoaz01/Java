import javax.swing.JOptionPane;

public class CalculatorProgram {
    private double result;

    public CalculatorProgram() {
        this.result = 0;
    }

    public CalculatorProgram(double initialValue) {
        setResult(initialValue);
    }

    public void setResult(double newValue) {
        if (newValue >= 0) {
            this.result = newValue;
        } else {
            showError("Value cannot be negative");
            System.exit(0);
        }
    }

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public double factorial(double n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public boolean isPerfect(double number) {
        if (number <= 0) {
            showError("Number should be a positive integer for a perfect number check.");
            System.exit(0);
        }

        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    public void displayMenu() {
        while (true) {
            String menu = "Menu:\n" +
                          "1. Power function\n" +
                          "2. Factorial function\n" +
                          "3. Check if a number is perfect\n" +
                          "4. Exit";

            int choice = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (choice) {
                case 1:
                    showPowerGUI();
                    break;
                case 2:
                    showFactorialGUI();
                    break;
                case 3:
                    showPerfectGUI();
                    break;
                case 4:
                    return;
                default:
                    showError("Invalid choice. Please choose again.");
            }
        }
    }

    private void showPowerGUI() {
        double base = getInput("Enter the base:");
        double exponent = getInput("Enter the exponent:");
        displayResult(power(base, exponent));
    }

    private void showFactorialGUI() {
        double n = getInput("Enter a non-negative integer for factorial:");
        displayResult(factorial(n));
    }

    private void showPerfectGUI() {
        double number = getInput("Enter a positive integer to check for perfection:");
        displayResult(isPerfect(number) ? 1 : 0); 
    }

    private double getInput(String message) {
        String input = JOptionPane.showInputDialog(message);
        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException e) {
            showError("Invalid input. Please enter a valid number.");
            return getInput(message);
        }
    }

        private void displayResult(double result) {
            String message;
            if (result == 1) {
                message = "Number is perfect";
            } else {
                message = "Number is not perfect";
            }
            JOptionPane.showMessageDialog(null, message);
        }

    private void showError(String message) {
        JOptionPane.showMessageDialog(null, "Error: " + message);
    }

    public static void main(String[] args) {
        CalculatorProgram calculator = new CalculatorProgram();
        calculator.displayMenu();
    }
}