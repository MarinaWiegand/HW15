package com.dmdev.oop.lesson15hw;

public class CalculationArea {

    public static void main(String[] args) {

        Figure square = new Square("квадрат", 2, 3);
        Figure triangle = new Triangle("треугольник", 5, 8);
        Figure circle = new Circle("круг",3);


        resultArea(square, triangle, circle);

    }

    public static void resultArea(Figure... figures) {
        for (Figure figure : figures) {
            figure.resultArea();
        }
    }
}
