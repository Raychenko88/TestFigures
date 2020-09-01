package org.example.model;

import lombok.Data;

@Data
public abstract class Figure {

    private String color;

    public abstract void draw();

    public abstract double getArea();

    public abstract double getPerimeter();
}