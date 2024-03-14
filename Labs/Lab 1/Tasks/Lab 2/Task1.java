import java.util.Scanner;

class Student implements Cloneable {
    private int rollno;
    private String name;
    private String email;
    private String address;

    // Default constructor
    public Student() {
        this.rollno = 0;
        this.name = "";
        this.email = "";
        this.address = "";
    }

    // Parameterized constructor
    public Student(int rollno, String name, String email, String address) {
        this.rollno = rollno;
        this.name = name;
        this.email = email;
        this.address = address;
    }

    // Copy constructor (using object cloning)
    public Student(Student other) {
        this.rollno = other.rollno;
        this.name = other.name;
        this.email = other.email;
        this.address = other.address;
    }

    // Getter and Setter methods
    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Method to input data
    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Roll No:");
        this.rollno = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter Name:");
        this.name = scanner.nextLine();
        System.out.println("Enter Email:");
        this.email = scanner.nextLine();
        System.out.println("Enter Address:");
        this.address = scanner.nextLine();
    }

    // Method to display data
    public void showData() {
        System.out.println("Roll No: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Address: " + address);
    }

    // Overriding clone method for deep cloning
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class Task1 {
    public static void main(String[] args) {
        Student[] students = new Student[5];

        // Demonstrate capabilities
        for (int i = 0; i < 2; i++) {
            students[i] = new Student();
            System.out.println("Enter data for student " + (i + 1) + ":");
            students[i].inputData();
        }

        System.out.println("\nDisplaying student information:");
        for (int i = 0; i < 2; i++) {
            System.out.println("\nStudent " + (i + 1) + " information:");
            students[i].showData();
        }

        // Demonstrate copy constructor
        try {
            Student copiedStudent = new Student(students[0]);
            System.out.println("\nCopied Student information:");
            copiedStudent.showData();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
