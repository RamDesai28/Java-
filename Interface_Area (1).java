// Define the Shape interface with the area() method
interface Shape {
    double area();
}

// Create a Rectangle class that implements the Shape interface
class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
}

// Create a Triangle class that implements the Shape interface
class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }
}

public class interfaceArea {
    public static void main(String[] args) {
        // Create a rectangle and calculate its area
        Rectangle rectangle = new Rectangle(5.0, 4.0);
        double rectangleArea = rectangle.area();
        System.out.println("Area of the Rectangle: " + rectangleArea);

        // Create a triangle and calculate its area
        Triangle triangle = new Triangle(6.0, 8.0);
        double triangleArea = triangle.area();
        System.out.println("Area of the Triangle: " + triangleArea);
    }
}

