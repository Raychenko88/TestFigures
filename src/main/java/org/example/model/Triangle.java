package org.example.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class Triangle extends Figure {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(String color, double sideA, double sideB, double sideC) {
        super.setColor(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Figure: triangle, area: %f square units, perimeter: %f" +
                " units, color: %s", getArea(), getPerimeter(), getColor()));
    }

    @Override
    public double getArea() {
        double p = (sideA + sideB + sideC) / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

}
