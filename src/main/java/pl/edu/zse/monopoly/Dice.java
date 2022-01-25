package pl.edu.zse.monopoly;

import java.util.Random;

public class Dice {

    private final static Dice instance = new Dice();

    private Random random = new Random();

    private Dice() {}

    public DiceResult roll() {
        return new DiceResult(this.random.nextInt(6) + 1,
                this.random.nextInt(6) + 1);
    }

    public static Dice getInstance() {
        return instance;
    }
}
