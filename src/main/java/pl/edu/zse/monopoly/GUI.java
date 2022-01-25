package pl.edu.zse.monopoly;

import pl.edu.zse.monopoly.fields.Field;

public class GUI {
    private final static GUI instance = new GUI();

    private GUI() {
    }

    public void printRoll(DiceResult diceResult) {
        System.out.println("Kostka 1: " + diceResult.getValue1());
        System.out.println("Kostka 2: " + diceResult.getValue2());
    }

    public void printField(Field field) {
        System.out.println("Pole:");
        System.out.println(field.getName());
    }

    public void printPlayer(int playerNo, Player player) {
        System.out.println("Gracz: " + playerNo);
        System.out.println("Kasa: " + player.getMoney());
    }

    public static GUI getInstance() {
        return instance;
    }
}
