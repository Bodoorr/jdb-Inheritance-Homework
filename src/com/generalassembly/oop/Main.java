package com.generalassembly.oop;

public class Main {
    static void main() {
        Triangle triangle = new Triangle(1, 3, 6);
        Rectangle rectangle = new Rectangle(2, 5);
        Circle circle = new Circle(4);
        Square square = new Square(4);

        System.out.println(triangle.getCircumference());
        System.out.println(triangle.getArea());

        System.out.println(rectangle.getCircumference());
        System.out.println(rectangle.getArea());

        System.out.println(circle.getCircumference());
        System.out.println(circle.getArea());

        System.out.println(square.getCircumference());
        System.out.println(square.getArea());
    }
}
