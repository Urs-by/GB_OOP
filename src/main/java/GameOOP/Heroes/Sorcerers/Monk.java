package GameOOP.Heroes.Sorcerers;

import GameOOP.Coordinates;
import GameOOP.Heroes.Magi;

public class Monk extends Magi {
//    public Monk(String type, String name, String team, Integer attack, Integer protection, Integer hp, Integer minDamage, Integer maxDamage, Integer speed, Integer x, Integer y, Integer magic) {
//        super(type, name, team, attack, protection, hp, minDamage, maxDamage, speed, x, y, magic);
//    }

    public Monk(String name, String team, Coordinates position) {
        super("Монах", name, team, 12, 7, 30, -4, -4, 5, position,1);
    }

    @Override
    public String getInfo() {
        return "M монах !";
    }
}
