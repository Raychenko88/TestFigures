package org.example.model;


public abstract class Figure {

    String color;

    Figure(String color) {
        this.color = color;
    }


    void draw(Figure figure) {

    }

    String showColor(Figure figure) {
        return figure.color;
    }

    abstract double getArea();
}
