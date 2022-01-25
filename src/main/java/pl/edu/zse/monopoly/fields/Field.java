package pl.edu.zse.monopoly.fields;

import pl.edu.zse.monopoly.Player;
import pl.edu.zse.monopoly.actions.Action;

import java.util.ArrayList;
import java.util.List;

public abstract class Field {

    private List<Action> actions = new ArrayList<>();
    protected String name;
    protected Family family = Family.NONE;

    public List<Action> getActions() {
        return actions;
    }

    public String getName() {
        return name;
    }

    public void setActions(List<Action> actions) {
        this.actions = actions;
    }

    public enum Family {
        RAILROAD,
        BROWN,
        SKY_BLUE,
        MAGENTA,
        ORANGE,
        RED,
        YELLOW,
        GREEN,
        BLUE,
        FACILITY,
        NONE
    }
}
