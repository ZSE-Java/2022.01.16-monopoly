package pl.edu.zse.monopoly;

public class DiceResult {
    private int value1;
    private int value2;

    public DiceResult(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public DiceResult() {
    }

    public int getValue1() {
        return value1;
    }

    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public int getValue2() {
        return value2;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }

    public boolean isDouble() {
        return this.value1 == this.value2;
    }
}
