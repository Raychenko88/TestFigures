package org.example.util;

import org.example.model.Color;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomColors {

    public static String getRandomColors(){
        Random random = new Random();
        List<Color> colors = Arrays.asList(Color.values());
        return colors.get(random.nextInt(colors.size())).getValue();
    }
}
