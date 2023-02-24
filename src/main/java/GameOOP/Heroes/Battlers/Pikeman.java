package GameOOP.Heroes.Battlers;

import GameOOP.Coordinates;
import GameOOP.Heroes.Battler;
import GameOOP.Human;

import java.util.ArrayList;

public class Pikeman extends Battler {
    public Pikeman(String type, String name, String team, Integer attack, Integer protection, Integer hp,
                   Integer minDamage, Integer maxDamage, Integer speed, Coordinates position) {
        super(type, name, team, attack, protection, hp, minDamage, maxDamage, speed, position);
    }
//    public Pikeman(String type, String name, String team, Integer attack, Integer protection, Integer hp, Integer minDamage, Integer maxDamage, Integer speed, Integer x, Integer y) {
//        super(type, name, team, attack, protection, hp, minDamage, maxDamage, speed, x, y);
//    }

    public Pikeman(String name, String team, Coordinates position) {
        super("Копейщик", name, team, 4, 5, 10, 1, 3, 4, position );
    }

    @Override
    public String getInfo() {
        return "Я копейщик ->";
    }


}

