package pl.edu.zse.monopoly.fields;

import pl.edu.zse.monopoly.Player;

public class Property extends Field {

    protected Player owner = null;

    public Property(Family family, String name) {
        this.family = family;
        this.name = name;
    }
}
