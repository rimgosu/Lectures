package javaStudysSelf;

abstract class Shape {
    public abstract double calculateArea();

    public void display() {
        System.out.println("This is a shape.");
    }
}

class Rectangle extends Shape {
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

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class Main{
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 3);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        rectangle.display();

        Shape circle = new Circle(2);
        System.out.println("Circle Area: " + circle.calculateArea());
        circle.display();
    }
    
}