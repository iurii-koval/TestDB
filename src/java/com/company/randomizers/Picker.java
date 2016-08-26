package com.company.randomizers;

public final class Picker {
    
    public <T>T pickOne(T one, T two) {
        int num = NumberRandomizer.getRandomNumberInRange(0, 1);
        return num == 0 ? one : two;
    }

}
