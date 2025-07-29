abstract class Shape {

    abstract void area();
}
class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void area() {
        System.out.println("Rectangle Area: " + (this.length * this.width));
    }
}
class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    @Override
    void area() {
        System.out.println("Triangle Area: " + (0.5 * this.base * this.height));
    }
}
class Square extends Shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    void area() {
        System.out.println("Square Area: " + (this.side * this.side));
    }
}
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void area() {
        System.out.println("Circle Area: " + (Math.PI * this.radius * this.radius));
    }
}
public class Shapes {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(26.0, 15.0);
        r.area();

        Triangle t = new Triangle(26.0, 15.0);
        t.area();

        Square s = new Square(15.0);
        s.area();

        Circle c = new Circle(15.0);
        c.area();
    }
}


