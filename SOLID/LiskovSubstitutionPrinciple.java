package SOLID;

/**
 * L - Liskov Substitution Principle (LSP)
 *
 * Concept:
 * Objects of a superclass shall be replaceable with objects of its subclasses 
 * without breaking the application logic or expectations.
 * 
 * If class B is subclass of class A, then we should be able to replace A with B
 * without disrupting the behavior of our program.
 */

// ==========================================
// WRONG IMPLEMENTATION (Violating LSP)
// ==========================================
/*
 * A Square mathematically IS-A Rectangle. But in programming, inheriting Square from Rectangle
 * is a bad idea.
 * If a client expects a Rectangle and changes its width, it expects the height
 * to remain unchanged. The Square class overrides this behavior to keep sides equal,
 * altering the expected behavior of a Rectangle and breaking the client's expectations.
 */
class RectangleWrong {
    protected int width;
    protected int height;

    public void setWidth(int width) { this.width = width; }
    public void setHeight(int height) { this.height = height; }
    public int getArea() { return width * height; }
}

class SquareWrong extends RectangleWrong {
    // To maintain a square, changing one side must change both.
    @Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width;
    }

    @Override
    public void setHeight(int height) {
        this.width = height;
        this.height = height;
    }
}

// ==========================================
// CORRECT IMPLEMENTATION (Adhering to LSP)
// ==========================================
/*
 * Instead of making Square inherit from Rectangle (which leads to behavioral problems),
 * they should both inherit from a common abstract concept (Shape) if needed.
 * This way, neither pretends to be the other, and clients don't mistakenly use a Square
 * when they expect the independent width/height behaviors of a Rectangle.
 */

interface Shape {
    int getArea();
}

class Rectangle implements Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(int width) { this.width = width; }
    public void setHeight(int height) { this.height = height; }

    @Override
    public int getArea() {
        return width * height;
    }
}

class Square implements Shape {
    private int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }

    public void setSideLength(int sideLength) { this.sideLength = sideLength; }

    @Override
    public int getArea() {
        return sideLength * sideLength;
    }
}

public class LiskovSubstitutionPrinciple {
    public static void main(String[] args) {
        // DEMONSTRATING THE FLAW IN WRONG IMPLEMENTATION
        RectangleWrong rect = new SquareWrong(); // Upcasting
        rect.setWidth(5);
        rect.setHeight(10);
        
        // A client expects the Area to be 5 * 10 = 50.
        // But because it's actually a SquareWrong under the hood, 
        // setting height to 10 also set width to 10. Area = 10 * 10 = 100 !
        System.out.println("Expected Rectangle Area: 50, but got: " + rect.getArea() + " (LSP VIOLATED!)");
        
        // ============================================
        
        // CORRECT USAGE
        Shape shape1 = new Rectangle(5, 10);
        Shape shape2 = new Square(5);
        System.out.println("Correct Rectangle Area: " + shape1.getArea());
        System.out.println("Correct Square Area: " + shape2.getArea());
    }
}
