package com.dmdev.oop.lesson15hw;

public class Triangle extends Figure {

    int SizeA;
    int SizeB;


    public Triangle(String name, int sizeA, int sizeB) {
        super(name);
        SizeA = sizeA;
        SizeB = sizeB;
    }

    @Override
    public void resultArea() {
        System.out.println(getName() + " с площадью " + countArea());
    }

    private int countArea() {
        return (SizeA * SizeB) / 2;
    }


    public int getSizeA() {
        return SizeA;
    }

    public int getSizeB() {
        return SizeB;
    }


    public void setSizeA(int sizeA) {
        SizeA = sizeA;
    }

    public void setSizeB(int sizeB) {
        SizeB = sizeB;
    }




}
