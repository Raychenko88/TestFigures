package org.example.model;

public class Circle extends Figure {

    double radius;

    public Circle(String color, Double radius) {
        super(color);
        this.radius = radius;
    }

    public String getColor() {
        return super.color;
    }

    public Double getCircumference() {
        return Math.PI * 2*radius;
    }

    @Override
   public double getArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public String toString() {
        return "Figure: circle, area: " + getArea() + " square units, circumference: "
                + getCircumference() + " units, color: " + getColor();
    }
}
