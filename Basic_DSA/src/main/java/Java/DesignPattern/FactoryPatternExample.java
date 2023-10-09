package Java.DesignPattern;

 ///providing a clear separation of concerns and flexibility for object creation.

// Shape interface
interface Shape {
    void draw();
}

// Concrete Circle class
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Concrete Rectangle class
class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

// ShapeFactory class
class ShapeFactory {
    // Factory method to create shapes
    public Shape createShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }

        if (shapeType.equalsIgnoreCase("Circle")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        }

        return null;
    }
}

public class FactoryPatternExample {
    public static void main(String[] args) {
        // Create a ShapeFactory
        ShapeFactory shapeFactory = new ShapeFactory();

        // Create Circle
        Shape circle = shapeFactory.createShape("Circle");
        circle.draw();

        // Create Rectangle
        Shape rectangle = shapeFactory.createShape("Rectangle");
        rectangle.draw();
    }
}
