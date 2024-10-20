// Abstract class
abstract class Shape {
    private String shapeType;

    public Shape(String shapeType) {
        this.shapeType = shapeType;
    }

    // Abstract method
    public abstract double calculateArea();

    // Concrete method
    public void displayShapeType() {
        System.out.println("Shape Type: " + shapeType);
    }

    // Getter for shapeType
    public String getShapeType() {
        return shapeType;
    }
}

// Subclass Circle
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }
}

// Subclass Rectangle
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        super("Rectangle");
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    // Getters for width and height
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}

// Main class to run the project
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        circle.displayShapeType();
        System.out.println("Area: " + circle.calculateArea());

        rectangle.displayShapeType();
        System.out.println("Area: " + rectangle.calculateArea());
    }
}
