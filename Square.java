package com.dmdev.oop.lesson15hw;

public class Square extends Figure {

    int SizeA;
    int SizeB;

    public Square(String name, int sizeA, int sizeB) {
        super(name);
        SizeA = sizeA;
        SizeB = sizeB;
    }

    @Override
    public void resultArea() {
        System.out.println(getName() + " площадь которого: " + countArea());
    }

    private int countArea() {
        return (SizeA * SizeB);
    }

    public int getSizeA() {
        return SizeA;
    }

    public void setSizeA(int sizeA) {
        SizeA = sizeA;
    }

    public int getSizeB() {
        return SizeB;
    }

    public void setSizeB(int sizeB) {
        SizeB = sizeB;
    }
}
