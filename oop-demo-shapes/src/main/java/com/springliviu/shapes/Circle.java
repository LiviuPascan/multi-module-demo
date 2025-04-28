package com.springliviu.shapes;

/** Круг */
public class Circle implements Shape {
    private final double radius;
    public Circle(double radius) { this.radius = radius; }

    @Override
    public String name() { return "Circle"; }

    @Override
    public double area() { return Math.PI * radius * radius; }
}

