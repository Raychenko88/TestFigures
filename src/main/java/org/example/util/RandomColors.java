package org.example.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomColors {

    public static String getRandomColors(){
        Random random = new Random();
        List<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("green");
        colors.add("yellow");
        colors.add("red");
        colors.add("black");
        return colors.get(random.nextInt(colors.size()));
    }
}
