package com.springliviu.shapes;

import java.util.List;
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