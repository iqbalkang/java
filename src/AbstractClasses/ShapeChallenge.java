package AbstractClasses;

public class ShapeChallenge {

    public static void main(String[] args) {

        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(10, 5);

        circle.print();
        rectangle.print();

    }

}

//* SHAPE CLASS
abstract class Shape {

    abstract double perimeter();
    abstract double area();

}
//* CIRCLE CLASS
class Circle extends Shape {
    double radius;
    float PI = 3.14f;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double perimeter() {
        return 2 * PI * radius;
    }

    @Override
    double area() {
        return PI * (radius * radius);
    }

    public void print() {
        System.out.println("Area = " + area() + ", Perimeter = " + perimeter());
    }

}

//* RECTANGLE CLASS
class Rectangle extends Shape {
    double length;
    double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double perimeter() {
        return 2 * (length + breadth);
    }

    @Override
    double area() {
        return length * breadth;
    }

    public void print() {
        System.out.println("Area = " + area() + ", Perimeter = " + perimeter());
    }
}




