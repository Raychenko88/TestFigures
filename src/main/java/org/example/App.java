package org.example;


import org.example.model.Figure;
import org.example.util.RandomFigures;

import java.util.List;

public class App {

    public static void main(String[] args) {
        List<Figure> figures = RandomFigures.getRandomListFigures();
        for (Figure figure : figures) {
            figure.draw();
        }
    }
}
