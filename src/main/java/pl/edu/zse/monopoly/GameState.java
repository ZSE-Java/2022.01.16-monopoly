package pl.edu.zse.monopoly;

import pl.edu.zse.monopoly.fields.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class GameState {
    private final List<Field> fields = generateFields();
    private final List<Player> players = generatePlayers();

    private final static GameState instance = new GameState();

    private GameState() {
    }

    public static GameState getInstance() {
        return instance;
    }

    private List<Player> generatePlayers() {
        try {
            List<Player> result = new ArrayList<>();
            System.out.println("Wpisz liczbe graczy:");
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));

            int playersNo = Integer.parseInt(reader.readLine());

            for (int i = 0; i < playersNo; i++) {
                Player player = new Player();
                switch (i) {
                    case 0:
                        player.setColor(Player.Color.BLACK);
                        break;
                    case 1:
                        player.setColor(Player.Color.YELLOW);
                        break;
                    case 2:
                        player.setColor(Player.Color.RED);
                        break;
                    case 3:
                        player.setColor(Player.Color.BLUE);
                        break;
                }

                result.add(player);
            }
            return result;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    private List<Field> generateFields() {
        List<Field> fields = new ArrayList<>();

        fields.add(new Start());
        fields.add(new Property(Field.Family.BROWN, "Brown 1"));
        fields.add(new CommunityChest());
        fields.add(new Property(Field.Family.BROWN, "Brown 2"));
        fields.add(new Payment(200, "Tax 1"));
        fields.add(new Property(Field.Family.RAILROAD, "Rail 1"));
        fields.add(new Property(Field.Family.SKY_BLUE, "Sky 1"));
        fields.add(new Chance());
        fields.add(new Property(Field.Family.SKY_BLUE, "Sky 2"));
        fields.add(new Property(Field.Family.SKY_BLUE, "Sky 3"));
        fields.add(new JailVisit());
        fields.add(new Property(Field.Family.MAGENTA, "Pink 1"));
        fields.add(new Property(Field.Family.FACILITY, "Electricity"));
        fields.add(new Property(Field.Family.MAGENTA, "Pink 2"));
        fields.add(new Property(Field.Family.MAGENTA, "Pink 3"));
        fields.add(new Property(Field.Family.RAILROAD, "Rail 2"));
        fields.add(new Property(Field.Family.ORANGE, "Orange 1"));
        fields.add(new CommunityChest());
        fields.add(new Property(Field.Family.ORANGE, "Orange 2"));
        fields.add(new Property(Field.Family.ORANGE, "Orange 3"));
        fields.add(new Parking());
        fields.add(new Property(Field.Family.RED, "Red 1"));
        fields.add(new Chance());
        fields.add(new Property(Field.Family.RED, "Red 2"));
        fields.add(new Property(Field.Family.RED, "Red 3"));
        fields.add(new Property(Field.Family.RAILROAD, "Rail 3"));
        fields.add(new Property(Field.Family.YELLOW, "Yellow 1"));
        fields.add(new Property(Field.Family.YELLOW, "Yellow 2"));
        fields.add(new Property(Field.Family.FACILITY, "Marvin"));
        fields.add(new Property(Field.Family.YELLOW, "Yellow 3"));
        fields.add(new Jail());
        fields.add(new Property(Field.Family.GREEN, "Green 1"));
        fields.add(new Property(Field.Family.GREEN, "Green 2"));
        fields.add(new CommunityChest());
        fields.add(new Property(Field.Family.GREEN, "Green 3"));
        fields.add(new Property(Field.Family.RAILROAD, "Rail 4"));
        fields.add(new Chance());
        fields.add(new Property(Field.Family.BLUE, "Blue 1"));
        fields.add(new Payment(100, "Tax 2"));
        fields.add(new Property(Field.Family.BLUE, "Blue 2"));

        return fields;
    }

    public List<Field> getFields() {
        return fields;
    }

    public List<Player> getPlayers() {
        return players;
    }
}
