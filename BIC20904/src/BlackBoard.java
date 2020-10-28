import java.text.DecimalFormat;

public class BlackBoard {

    static DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {

        Circle c1 = new Circle();
        System.out.println("Area of c1 with radius " + c1.radius + " is " + df.format(c1.getArea()));

        Circle c2 = new Circle(25);
        System.out.println("Area of c2 with radius " + c2.radius + " is " + df.format(c2.getArea()));

        c2.radius = 100;
        System.out.println("Area of c2 with radius " + c2.radius + " is " + df.format(c2.getArea()));

    }

}

class Circle {

    double radius;

    Circle() {
        radius = 1.0;
    }

    Circle(double r) {
        radius = r;
    }

    double getArea() {
        return radius * radius * Math.PI;
    }

}

class Rectangle {

    double length;
    double width;

    Rectangle() {
        length = 1.0;
        width = 1.0;
    }

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    double getArea() {
        return length * width;
    }

    double getPerimeter() {
        return (length + width) * 2;
    }

}
