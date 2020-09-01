package org.example.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SquareTest {

    Square square = new Square("red", 10);

    @Test
    void getPerimeter() {
        assertTrue(40 == square.getPerimeter());
    }

    @Test
    void getArea() {
        assertTrue(100 == square.getArea());
    }
}