package GameOOP.Heroes.Shooters;

import GameOOP.Coordinates;
import GameOOP.Heroes.Shooter;

public class Arbalester extends Shooter {

//    public Arbalester(String type, String name, String team, Integer attack, Integer protection, Integer hp, Integer minDamage, Integer maxDamage, Integer speed, Integer x, Integer y, Integer shots) {
//        super(type, name, team, attack, protection, hp, minDamage, maxDamage, speed, x, y, shots);
//    }


    public Arbalester(String type, String name, String team, Integer attack, Integer protection, Integer hp,
                      Integer minDamage, Integer maxDamage, Integer speed, Coordinates position, Integer shots) {
        super(type, name, team, attack, protection, hp, minDamage, maxDamage, speed, position, shots);
    }

    public Arbalester(String name, String team, Coordinates position) {
        super("Арбалетчик", name, team, 6, 3, 10, 4, 6, 4, position, 16);
    }

    @Override
    public String getInfo() {
        return "Я арбалетчик ->)";
    }
}
