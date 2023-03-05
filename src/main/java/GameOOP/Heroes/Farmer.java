package GameOOP.Heroes;

import GameOOP.Coordinates;
import GameOOP.Human;

import java.util.ArrayList;

public class Farmer extends Human {
    private Integer delivery;

    public Farmer(String type, String name, String team, Integer attack, Integer protection, Integer hp,
                  Integer minDamage, Integer maxDamage, Integer speed, Coordinates position, Integer delivery, String state) {
        super(type, name, team, attack, protection, hp, minDamage, maxDamage, speed, position);
        this.delivery = delivery;
    }


    public Farmer(String name, String team, Coordinates position) {

        super("Крестьянин", name, team, 1, 1, 1, 1, 1, 3, position);
        this.delivery = 1;
    }


    @Override
    public String getInfo() {
        return ("F крестьянин :(");
    }


    @Override
    public void step(ArrayList<Human> team1, ArrayList<Human> team2) {
        //brings();
        if (state.contains("Занят") && hp > 0) {
            setState("Жив");
        }

    }

    @Override
    public String toString() {

        return super.toString() + ", delivery=" + delivery + '}';
    }


    public void brings() {
        System.out.printf("%s %s из команды %s подносит оружие , состояние: %s", type, getName(), getTeam(), getState());
        System.out.println();
    }

}
