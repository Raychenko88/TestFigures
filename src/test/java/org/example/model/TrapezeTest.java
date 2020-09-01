package org.example.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class TrapezeTest {

    private Trapeze trapeze = new Trapeze("red", 10, 20, 30, 40);

    @Test
    void getPerimeter() {
        assertTrue(110 == trapeze.getPerimeter());
    }

    @Test
    void getArea() {
        assertTrue(450 == trapeze.getArea());
    }
}