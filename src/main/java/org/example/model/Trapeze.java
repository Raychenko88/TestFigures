package org.example.model;

public class Trapeze extends Figure {

    Double baseLength1;
    Double baseLength2;
    Double side;
    Double height;

    public Trapeze(String color,  Double baseLength1,  Double baseLength2,  Double height,  Double side) {
        super(color);
        this.baseLength1 = baseLength1;
        this.baseLength2 = baseLength2;
        this.side = side;
        this.height = height;
    }

    public String getColor() {
        return super.color;
    }

    public Double getPerimeter(){
        return (baseLength1 + baseLength2 + (side * 2));
    }

    @Override
    public double getArea() {
        return (height*(baseLength1 + baseLength2)/2);
    }

    @Override
    public String toString() {
        return "Figure: trapeze, area: " + getArea() + " square units, perimeter: "
                + getPerimeter() + " units, color: " + getColor();
    }
}
