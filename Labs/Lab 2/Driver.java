import java.util.Scanner;

class Health {
    private String name;
    private double weight;
    private double height;
    private double bmi;
    public Health(String name, double weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.bmi = calculateBMI(weight, height);
    }
    private double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }
    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public double getBMI() {
        return bmi;
    }
}

class IndexOccupiedException extends Exception {
    public IndexOccupiedException(String message) {
        super(message);
    }
}

class IndexException extends Exception {
    public IndexException(String message) {
        super(message);
    }
}

public class Driver {
    private Health[] h;

    public Driver(int size) {
        h = new Health[size];
    }

    public void save(String name, double weight, double height, int index) throws IndexOccupiedException {
        if (h[index] != null) {
            throw new IndexOccupiedException("Index " + index + " is already occupied.");
        }
        h[index] = new Health(name, weight, height);
    }
    public void retrieve(int index) throws IndexException {
        if (index < 0 || index >= h.length || h[index] == null) {
            throw new IndexException("Invalid index or no data at index " + index);
        }
        Health person = h[index];
        System.out.println("Name: " + person.getName());
        System.out.println("Weight: " + person.getWeight() + " kg");
        System.out.println("Height: " + person.getHeight() + " m");
        System.out.println("BMI: " + person.getBMI());
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many Person do u want : ");
        int N = scanner.nextInt();
        try {
            if (N < 0) {
                throw new NegativeArraySizeException("Negative number are not allowed.");
            }
            Driver driver = new Driver(N);
            int choice;
            do {
                System.out.println("\nMenu:");
                System.out.println("1. Add");
                System.out.println("2. Print");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Enter name: ");
                        String name = scanner.next();
                        System.out.print("Enter weight : ");
                        double weight = scanner.nextDouble();
                        System.out.print("Enter height : ");
                        double height = scanner.nextDouble();
                        System.out.print("Enter index no : ");
                        int index = scanner.nextInt();
                        try {
                            driver.save(name, weight, height, index);
                            System.out.println("Data saved At index " + index);
                        } catch (IndexOccupiedException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 2:
                        System.out.print("Enter index to retrieve: ");
                        int retrieveIndex = scanner.nextInt();
                        try {
                            driver.retrieve(retrieveIndex);
                        } catch (IndexException e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 3:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter again.");
                }
            } while (choice != 3);
        } catch (NegativeArraySizeException e) {
            System.out.println(e.getMessage());
        }
    }
}