package com.company;

public class Circle {
    private final double pi = Math.PI;
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void Area() {
        System.out.println("Area=> " + pi + " * ( " + radius + " * " + radius + " ) = " + (pi * (radius * radius)));
    }

    public void Circumference() {
        System.out.println("Circumference=> " + pi + " * 2 *" + radius + " = " + (pi * 2 * radius));
    }

}
