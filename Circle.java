package com.dmdev.oop.lesson15hw;

public class Circle extends Figure {


    double Radius;
    final double P = 3.14;

    public Circle(String name, double radius) {
        super(name);
        Radius = radius;
    }


    @Override
    public void resultArea() {
        System.out.println(getName() + " с вычисляемой площадью равной: " + countArea());
    }

    private double countArea() {
        return Radius * Radius * P;
    }

    public double getRadius() {
        return Radius;
    }

    public void setRadius(int radius) {
        Radius = radius;
    }


}
