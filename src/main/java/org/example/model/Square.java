package org.example.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class Square extends Figure {

    private double side;

    public Square(String color, double side) {
        super.setColor(color);
        this.side = side;
    }

    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Figure: square, area: %f square units, perimeter: %f" +
                " units, color: %s", getArea(), getPerimeter(), getColor()));
    }

    @Override
    public double getArea() {
        return side * side;
    }

}
