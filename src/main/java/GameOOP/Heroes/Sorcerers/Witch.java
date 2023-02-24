package GameOOP.Heroes.Sorcerers;

import GameOOP.Coordinates;
import GameOOP.Heroes.Magi;

public class Witch extends Magi {
//    public Witch(String type, String name, String team, Integer attack, Integer protection, Integer hp, Integer minDamage, Integer maxDamage, Integer speed, Integer x, Integer y, Integer magic) {
//        super(type, name, team, attack, protection, hp, minDamage, maxDamage, speed, x, y, magic);
//    }

    public Witch(String name, String team, Coordinates position) {
        super("Колдун", name, team, 17, 12, 30, -5, -5, 9,position,1);
    }

    @Override
    public String getInfo() {
        return ("Я колдун !");
    }
}
