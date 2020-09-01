package org.example;


import org.example.model.*;
import org.example.util.RandomFigures;
import org.example.util.RandomNumbers;

import java.util.List;

public class App {

    public static void main(String[] args) {
        List<Figure> figures = RandomFigures.getRandomListFigures(RandomNumbers.getRandomInt(1, 100));
        for (Figure figure : figures) {
            System.out.println(figure);
        }
    }
}
