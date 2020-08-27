package com.dmdev.oop.lesson15hw;

public class Figure {

    private String name;

    public Figure(String name) {
        this.name = name;
    }

    public void resultArea(){

        System.out.println( name + " имеет площадь" );

    }

    public String getName() {

        return name;
    }
}
