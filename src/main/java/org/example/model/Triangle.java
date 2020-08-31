package org.example.model;

public class Triangle extends Figure {

    double cathetusA;
    double cathetusB;

    public String getColor() {
        return super.color;
    }

    public Triangle(String color, Double cathetusA, Double cathetusB) {
        super(color);
        this.cathetusA = cathetusA;
        this.cathetusB = cathetusB;
    }

    public Double getHypotenuse(){
        return Math.sqrt(Math.pow(cathetusA, 2) + Math.pow(cathetusB, 2));
    }

    @Override
   public double getArea() {
        return (cathetusA * cathetusB) / 2;
    }

    @Override
    public String toString() {
        return "Figure: triangle, area: " + getArea() + " square units, hypotenuse: "
                + getHypotenuse() + " units, color: " + getColor();
    }
}
