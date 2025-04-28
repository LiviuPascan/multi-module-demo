package com.springliviu.shapes;

/** Квадрат */
public class Square implements Shape {
    private final double side;
    public Square(double side) { this.side = side; }

    @Override
    public String name() { return "Square"; }

    @Override
    public double area() { return side * side; }
}