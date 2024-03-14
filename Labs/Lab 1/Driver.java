import java.util.Scanner;

interface TwoDimensionalShape {
    double getArea();
}

class Circle implements TwoDimensionalShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle with radius " + radius;
    }
}

class Square implements TwoDimensionalShape {
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }
    public double getArea() {
        return sideLength * sideLength;
    }

    @Override
    public String toString() {
        return "Square with side length " + sideLength;
    }
}

class Triangle implements TwoDimensionalShape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public String toString() {
        return "Triangle with base " + base + " and height " + height;
    }
}

public class Driver {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
	System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble(); 
	System.out.print("Enter the side length of the square: ");
        double sideLength = scanner.nextDouble(); 
	System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble(); 
	System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();
        TwoDimensionalShape[] shapes = {
                new Circle(radius),
                new Square(sideLength),
                new Triangle(base, height)
        };
        for (int i=0; i<3; i++) {
            if (shapes[i] instanceof Circle) {
                System.out.print("Area of Circle: ");
            } else if (shapes[i] instanceof Square) {
                System.out.print("Area of Square: ");
            } else if (shapes[i] instanceof Triangle) {
                System.out.print("Area of Triangle: ");
            }
            System.out.println(shapes[i].getArea());
        }
    }
}