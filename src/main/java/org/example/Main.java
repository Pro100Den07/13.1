package org.example;

// Створення базового інтерфейсу для геометричних фігур
interface GeometricShape {
    double calculateArea();
}

// Клас для кола
class Circle implements GeometricShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Клас для трикутника
class Triangle implements GeometricShape {
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

// Клас для квадрата
class Square implements GeometricShape {
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double calculateArea() {
        return sideLength * sideLength;
    }
}

public class Main {
    public static void main(String[] args) {
        GeometricShape[] shapes = {new Circle(5), new Triangle(3, 4), new Square(2)};
        double totalArea = calculateTotalArea(shapes);
        System.out.println("Сумарна площа всіх фігур у масиві: " + totalArea);
    }

    // Метод для обчислення сумарної площі всіх фігур у масиві
    public static double calculateTotalArea(GeometricShape[] shapes) {
        double totalArea = 0;
        for (GeometricShape shape : shapes) {
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }
}
