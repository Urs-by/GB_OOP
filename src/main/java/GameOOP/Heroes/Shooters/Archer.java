package GameOOP.Heroes.Shooters;

import GameOOP.Coordinates;
import GameOOP.Heroes.Shooter;

public class Archer extends Shooter {


    public Archer(String name, String team, Coordinates position) {
        super("Лучник", name, team, 12, 1, 15, 8, 10, 9, position, 32);
    }

    @Override
    public String getInfo() {
        return "Я лучник-снайпер -)";
    }
}
