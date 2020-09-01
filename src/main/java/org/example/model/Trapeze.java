package org.example.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class Trapeze extends Figure {

    private double baseLength1;
    private double baseLength2;
    private double side;
    private double height;

    public Trapeze(String color, double baseLength1, double baseLength2, double height, double side) {
        super.setColor(color);
        this.baseLength1 = baseLength1;
        this.baseLength2 = baseLength2;
        this.side = side;
        this.height = height;
    }

    public double getPerimeter() {
        return (baseLength1 + baseLength2 + (side * 2));
    }

    @Override
    public void draw() {
        System.out.println(String.format("Figure: trapeze, area: %f square units, perimeter: %f" +
                " units, color: %s", getArea(), getPerimeter(), getColor()));
    }

    @Override
    public double getArea() {
        return (height * (baseLength1 + baseLength2) / 2);
    }

}
