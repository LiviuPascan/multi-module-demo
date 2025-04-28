package com.springliviu.shapes;


/**
 * Общий интерфейс для фигур.
 */
public interface Shape {
    /** Имя фигуры */
    String name();
    /** Площадь фигуры */
    double area();
}

// ==== ФАЙЛ: src/main/java/com/example/shapes/Circle.java ====
package com.example.shapes;

/** Круг */
public class Circle implements Shape {
    private final double radius;
    public Circle(double radius) { this.radius = radius; }

    @Override
    public String name() { return "Circle"; }

    @Override
    public double area() { return Math.PI * radius * radius; }
}

// ==== ФАЙЛ: src/main/java/com/example/shapes/Square.java ====
package com.example.shapes;

/** Квадрат */
public class Square implements Shape {
    private final double side;
    public Square(double side) { this.side = side; }

    @Override
    public String name() { return "Square"; }

    @Override
    public double area() { return side * side; }
}

// ==== ФАЙЛ: src/main/java/com/example/demo/Demo.java ====
package com.example.demo;

import com.example.shapes.*;
        import java.util.*;

/**
 * Демонстрация полиморфизма Shape.
 */
public class Demo {
    public static void main(String[] args) {
        List<Shape> shapes = List.of(new Circle(2.5), new Square(3.0));
        for (Shape s : shapes) {
            System.out.printf("%s area = %.2f%n", s.name(), s.area());
        }
    }
}
