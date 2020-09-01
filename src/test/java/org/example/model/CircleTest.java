package org.example.model;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CircleTest {

    Circle circle = new Circle("red", 10);

    @Test
    void getArea() {
        assertTrue(314.1592653589793 == circle.getArea());
    }

    @Test
    void getPerimeter() {
        assertTrue(62.83185307179586 == circle.getPerimeter());
    }
}