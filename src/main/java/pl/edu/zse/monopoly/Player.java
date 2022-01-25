package pl.edu.zse.monopoly;

public class Player {
    private int money = 1500;
    private Color color;
    private int position = 0;
    private int pause = 0;
    //TODO karty użytkowe które posiada gracz
    private boolean active = true;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getPause() {
        return pause;
    }

    public void setPause(int pause) {
        this.pause = pause;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public enum Color {
        GREEN,
        BLUE,
        RED,
        YELLOW,
        BLACK,
        ORANGE
    }
}
