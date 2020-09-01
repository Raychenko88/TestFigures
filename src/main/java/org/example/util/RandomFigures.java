package org.example.util;

import org.example.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomFigures {

    public static Figure getRandomFigure() {
        Random random = new Random();
        List<Figure> figures = new ArrayList<>();
        figures.add(new Triangle(RandomColors.getRandomColors(), RandomNumbers.getRandomDouble(1, 20)
                , RandomNumbers.getRandomDouble(1, 20)));
        figures.add(new Circle(RandomColors.getRandomColors(), RandomNumbers.getRandomDouble(1, 20)));
        figures.add(new Square(RandomColors.getRandomColors(), RandomNumbers.getRandomDouble(1, 20)));
        figures.add(new Trapeze(RandomColors.getRandomColors(), RandomNumbers.getRandomDouble(1, 20)
                , RandomNumbers.getRandomDouble(1, 20)
                , RandomNumbers.getRandomDouble(1, 20)
                , RandomNumbers.getRandomDouble(1, 20)));
        return figures.get(random.nextInt(figures.size()));
    }

    public static List<Figure> getRandomListFigures(Integer size){
        List<Figure> figures = new ArrayList<>();
        for (int i = 0; i < size; i++){
            figures.add(getRandomFigure());
        }
        return figures;
    }
}
