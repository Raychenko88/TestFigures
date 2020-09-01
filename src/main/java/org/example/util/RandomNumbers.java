package org.example.util;

import java.util.Random;

public class RandomNumbers {

    public static Integer getRandomInt(int min, int max) {
        Random random = new Random();
        return min + random.nextInt(max - min + 1);
    }

    public static Double getRandomDouble(double min, double max) {
        Random random = new Random();
        return min + (max - min) * random.nextDouble();
    }
}
