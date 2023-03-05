package GameOOP.Heroes.Battlers;

import GameOOP.Coordinates;
import GameOOP.Heroes.Battler;
import GameOOP.Human;

import java.util.ArrayList;

public class Ronin extends Battler {

//    public Ronin(String type, String name, String team, Integer attack, Integer protection, Integer hp, Integer minDamage, Integer maxDamage, Integer speed, Integer x, Integer y) {
//        super(type, name, team, attack, protection, hp, minDamage, maxDamage, speed, x, y);
//    }


    public Ronin(String type, String name, String team, Integer attack, Integer protection, Integer hp,
                 Integer minDamage, Integer maxDamage, Integer speed, Coordinates position) {
        super(type, name, team, attack, protection, hp, minDamage, maxDamage, speed, position);
    }

    public Ronin(String name, String team, Coordinates position) {
        super("Разбойник", name, team, 8, 3, 10, 2, 4, 6, position);
    }


    public void hide() {
        System.out.printf("%s %s прячется ", type, getName());
        System.out.println();
    }

    @Override
    public String getInfo() {
        return "R разбойник, ха ха ха";
    }


}
