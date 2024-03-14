interface Shape {
    double PI = 3.14;
    void calculateArea();
    void calculatePerimeter();
}

class Square implements Shape {
    private double length;
    private double area;
    private double perimeter;

    public Square() {
        length = 0.0;
        area = 0.0;
        perimeter = 0.0;
    }

    public Square(double length) {
        this.length = length;
        calculateArea();
        calculatePerimeter();
    }

    public Square(Square other) {
        this.length = other.length;
        this.area = other.area;
        this.perimeter = other.perimeter;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
        calculateArea();
        calculatePerimeter();
    }

    @Override
    public void calculateArea() {
        area = length * length;
    }

    @Override
    public void calculatePerimeter() {
        perimeter = 4 * length;
    }

    @Override
    public String toString() {
        return "Square: Area - " + area + ", Perimeter - " + perimeter;
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;
    private double area;
    private double perimeter;

    public Rectangle() {
        length = 0.0;
        width = 0.0;
        area = 0.0;
        perimeter = 0.0;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        calculateArea();
        calculatePerimeter();
    }

    public Rectangle(Rectangle other) {
        this.length = other.length;
        this.width = other.width;
        this.area = other.area;
        this.perimeter = other.perimeter;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
        calculateArea();
        calculatePerimeter();
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
        calculateArea();
        calculatePerimeter();
    }

    @Override
    public void calculateArea() {
        area = length * width;
    }

    @Override
    public void calculatePerimeter() {
        perimeter = 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle: Area - " + area + ", Perimeter - " + perimeter;
    }
}

class Circle implements Shape {
    private double radius;
    private double area;
    private double perimeter;

    public Circle() {
        radius = 0.0;
        area = 0.0;
        perimeter = 0.0;
    }

    public Circle(double radius) {
        this.radius = radius;
        calculateArea();
        calculatePerimeter();
    }

    public Circle(Circle other) {
        this.radius = other.radius;
        this.area = other.area;
        this.perimeter = other.perimeter;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        calculateArea();
        calculatePerimeter();
    }

    @Override
    public void calculateArea() {
        area = PI * radius * radius;
    }

    @Override
    public void calculatePerimeter() {
        perimeter = 2 * PI * radius;
    }

    @Override
    public String toString() {
        return "Circle: Area - " + area + ", Perimeter - " + perimeter;
    }
}

public class Task1 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Square(5);
        shapes[1] = new Rectangle(4, 6);
        shapes[2] = new Circle(3);

        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }
    }
}
