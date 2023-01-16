package com.ReplaceInheritanceWithDelegation.after1;

import java.util.Random;

public class Dice {
    private final Random _random;

    public Dice() {
//        _random = new Random(314159L);
        this(314159L);
    }

    public Dice(long seed) {
        _random = new Random(seed);
    }

    public int nextInt(){
        return _random.nextInt(6) + 1;
    }

    public void setSeed(long seed) {
        _random.setSeed(seed);
    }
}
