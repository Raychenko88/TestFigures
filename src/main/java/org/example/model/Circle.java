package org.example.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class Circle extends Figure {

    private double radius;

    public Circle(String color, double radius) {
        setColor(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Figure: circle, area: %f square units, circumference: %f" +
                " units, color: %s", getArea(), getPerimeter(), getColor()));
    }

    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }

}
