package SOLID;

/**
 * O - Open/Closed Principle (OCP)
 *
 * Concept:
 * Software entities (classes, modules, functions, etc.) should be 
 * open for extension, but closed for modification.
 * 
 * This means you should be able to add new functionality without modifying existing code.
 */

// ==========================================
// WRONG IMPLEMENTATION (Violating OCP)
// ==========================================
/*
 * In this wrong design, if we want to add a new shape (e.g., Triangle), 
 * we have to modify the AreaCalculatorWrong class to add another if/else or switch case. 
 * This tightly couples the calculator to every specific shape, requiring modification
 * of an existing class every time a new shape is introduced.
 */
class RectangleWrong {
    public double length;
    public double width;
}

class CircleWrong {
    public double radius;
}

class AreaCalculatorWrong {
    public double calculateArea(Object shape) {
        if (shape instanceof RectangleWrong) {
            RectangleWrong r = (RectangleWrong) shape;
            return r.length * r.width;
        } else if (shape instanceof CircleWrong) {
            CircleWrong c = (CircleWrong) shape;
            return Math.PI * c.radius * c.radius;
        }
        return 0; // If a Triangle is added, we MUST modify this class!
    }
}

// ==========================================
// CORRECT IMPLEMENTATION (Adhering to OCP)
// ==========================================
/*
 * We define a common abstraction (Interface).
 * To add a new shape, we just create a new class implementing the interface.
 * We NEVER have to touch AreaCalculator or existing shape classes again!
 * This is open for extension (adding Triangle) but closed for modification.
 */

interface Shape {
    double calculateArea();
}

class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// NEW SHAPE added later: Notice we don't need to modify AreaCalculator!
class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

class AreaCalculator {
    public double calculateTotalArea(Shape[] shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.calculateArea(); // Polymorphism takes care of the specific logic
        }
        return totalArea;
    }
}

public class OpenClosedPrinciple {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Rectangle(5, 4),
            new Circle(3),
            new Triangle(4, 5) // Easily extended!
        };
        
        AreaCalculator calculator = new AreaCalculator();
        System.out.println("Total Area: " + calculator.calculateTotalArea(shapes));
    }
}
