package org.example.model;

public class Square extends Figure {

    double side;

    public Square(String color, Double side) {
        super(color);
        this.side = side;
    }

    public String getColor() {
        return super.color;
    }

    public Double getPerimeter(){
        return side * 4;
    }


    @Override
   public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Figure: square, area: " + getArea() + " square units, perimeter: "
                + getPerimeter() + " units, color: " + getColor();
    }
}
