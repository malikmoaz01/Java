import javax.swing.*;

class Shape {
    protected double area;
    protected double volume;

    public Shape() {
        area = 0.0;
        volume = 0.0;
    }

    public Shape(double area, double volume) {
        this.area = area;
        this.volume = volume;
    }

    public Shape(Shape other) {
        this.area = other.area;
        this.volume = other.volume;
    }

    public void getInput() {
        // Simulated input
        area = Double.parseDouble(JOptionPane.showInputDialog("Enter area:"));
        volume = Double.parseDouble(JOptionPane.showInputDialog("Enter volume:"));
    }

    @Override
    public String toString() {
        return "Area: " + area + ", Volume: " + volume;
    }
}

class Square extends Shape {
    private double width;
    private double length;
    private double height;

    public Square() {
        super();
        width = 0.0;
        length = 0.0;
        height = 0.0;
    }

    @Override
    public void getInput() {
        width = Double.parseDouble(JOptionPane.showInputDialog("Enter width:"));
        length = Double.parseDouble(JOptionPane.showInputDialog("Enter length:"));
        height = Double.parseDouble(JOptionPane.showInputDialog("Enter height:"));
        
        // Calculate area and volume
        area = width * length;
        volume = area * height;
    }

    @Override
    public String toString() {
        return "Width: " + width + ", Length: " + length + ", Height: " + height + ", " + super.toString();
    }
}

class Sphere extends Shape {
    private double radius;
    private final double Pi = 3.14;

    public Sphere() {
        super();
        radius = 0.0;
    }

    @Override
    public void getInput() {
        radius = Double.parseDouble(JOptionPane.showInputDialog("Enter radius:"));
        
        // Calculate area and volume
        area = 4 * Pi * radius * radius;
        volume = (4/3) * Pi * radius * radius * radius;
    }

    @Override
    public String toString() {
        return "Radius: " + radius + ", " + super.toString();
    }
}

public class Task2 {
    public static void main(String[] args) {
        Square square = new Square();
        square.getInput();
        System.out.println("Square: " + square.toString());

        Sphere sphere = new Sphere();
        sphere.getInput();
        System.out.println("Sphere: " + sphere.toString());

    }
}
