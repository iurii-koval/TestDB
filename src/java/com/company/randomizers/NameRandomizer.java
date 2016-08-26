package com.company.randomizers;

import static com.company.randomizers.NumberRandomizer.getRandomNumberInRange;

public class NameRandomizer {
    
    private static char[] consonant = {'q','w','r','t','p','s','d','f','g','h','j','k','l','z','x','c','v','b','n','m','y'};
    private static char[] vowels = {'e','u','i','o','a'};
    
    public static String generateName(int minNameLenth, int maxNameLenth) {
        int nameLength = getNameLength(minNameLenth, maxNameLenth);
        boolean consonantLetter = 0 == getRandomNumberInRange(0, 1);
        StringBuilder name = new StringBuilder();
        for(int i=0; i<nameLength; i++) {
            name.append(consonantLetter ? getRandomConsonant() : getRandomVowel());
            consonantLetter = !consonantLetter;                 
        }
        return new String(name);
    }
            
    private static int getNameLength(int minLength, int maxLength) {
        return getRandomNumberInRange(minLength, maxLength);
    }
    
    private static char getRandomConsonant() {
        return consonant[getRandomNumberInRange(0, consonant.length-1)];
    }

    private static char getRandomVowel() {
        return vowels[getRandomNumberInRange(0, vowels.length-1)];
    }
    
}
