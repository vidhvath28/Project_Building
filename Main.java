abstract class Shape {
    private String shapeType;

    public Shape(String shapeType) {
        this.shapeType = shapeType;
    }

    // (Abstraction)
    public abstract double calculateArea();
    public void displayShapeType() {
        System.out.println("Shape Type: " + shapeType);
    }

    //  (Encapsulation)
    public String getShapeType() {
        return shapeType;
    }
}

//  (Inheritance)
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

    public double getRadius() {
        return radius;
    }
}
class Rectangle extends Shape {
    // Encapsulated fields (private)
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

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}

public class Main {
    public static void main(String[] args) {
        // (Polymorphism through Shape reference)
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        circle.displayShapeType();
        System.out.println("Area: " + circle.calculateArea());

        rectangle.displayShapeType();
        System.out.println("Area: " + rectangle.calculateArea());
    }
}
