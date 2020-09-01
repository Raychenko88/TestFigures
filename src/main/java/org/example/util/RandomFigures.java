package org.example.util;

import org.example.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomFigures {

    public static Figure getRandomFigure() {
        Random random = new Random();
        int index = random.nextInt(4);
        switch (index) {
            case 0:
                return getCircle();
            case 1:
                return getSquare();
            case 2:
                return getTrapeze();
            case 3:
                return getTriangle();
        }
        return null;
    }

    public static List<Figure> getRandomListFigures() {
        int size = RandomNumbers.getRandomInt(1, 100);
        List<Figure> figures = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            Figure figure = getRandomFigure();
            if (figure != null) {
                figures.add(figure);
            }
        }
        return figures;
    }

    private static Triangle getTriangle() {
        return new Triangle(RandomColors.getRandomColors(), RandomNumbers.getRandomDouble(1, 50),
                RandomNumbers.getRandomDouble(1, 50), RandomNumbers.getRandomDouble(1, 50));
    }

    private static Circle getCircle() {
        return new Circle(RandomColors.getRandomColors(), RandomNumbers.getRandomDouble(1, 50));
    }

    private static Square getSquare() {
        return new Square(RandomColors.getRandomColors(), RandomNumbers.getRandomDouble(1, 50));
    }

    private static Trapeze getTrapeze() {
        return new Trapeze(RandomColors.getRandomColors(), RandomNumbers.getRandomDouble(1, 50),
                RandomNumbers.getRandomDouble(1, 50), RandomNumbers.getRandomDouble(1, 50), RandomNumbers.getRandomDouble(1, 50));
    }
}
