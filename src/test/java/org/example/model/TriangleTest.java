package org.example.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class TriangleTest {

    private Triangle triangle = new Triangle("red", 10, 20, 30);

    @Test
    void getArea() {
        double a = triangle.getArea();
        assertTrue(0 == triangle.getArea());

    }

    @Test
    void getPerimeter() {
        assertTrue(60 == triangle.getPerimeter());
    }
}