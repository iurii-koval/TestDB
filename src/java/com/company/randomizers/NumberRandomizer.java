package com.company.randomizers;

import java.util.Random;

public final class NumberRandomizer {
    
    public static int getRandomNumberInRange(int min, int max) {
        Random random = new Random();
        int floor = max - min + 1;
        return  random.nextInt(floor) + min;
    }
    
}
