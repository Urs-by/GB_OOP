package GameOOP.Heroes;

import GameOOP.Coordinates;
import GameOOP.Human;

import java.util.ArrayList;
import java.util.Comparator;

public abstract class Magi extends Human {
    Integer magic;

    public Magi(String type, String name, String team, Integer attack, Integer protection, Integer hp,
                Integer minDamage, Integer maxDamage, Integer speed, Coordinates position, Integer magic) {
        super(type, name, team, attack, protection, hp, minDamage, maxDamage, speed, position);
        this.magic = magic;
    }
//    public Magi(String type, String name, String team, Integer attack, Integer protection, Integer hp, Integer minDamage, Integer maxDamage, Integer speed, Integer x, Integer y, Integer magic) {
//        super(type, name, team, attack, protection, hp, minDamage, maxDamage, speed, x, y);
//        this.magic = magic;
//    }

    public Magi(String name) {
        super(name);
    }

    public void heal() {
        System.out.printf("%s %s из команды %s  исцеляет", type, getName(), getTeam());
        System.out.println();
    }

    public void spoil() {
        System.out.printf("%s %s колдует", type, getName());
        System.out.println();
    }

    @Override
    public String toString() {
        return super.toString() +
                ", magic=" + magic +
                '}';
    }

    public int findPatient(ArrayList<Human> team) {
        int index = -1;
        float minHp = 100;
        for (int i = 0; i < team.size(); i++) {
            if (!team.get(i).getState().contains("Мертв") & team.get(i).getHp() < minHp) {
                index = i;
                minHp = team.get(i).getHp();
            }
        }
        return index;
    }

    @Override
    public void step(ArrayList<Human> team1, ArrayList<Human> team2) {
        int indexPatient = findPatient(team1);
        if (indexPatient != -1 && getNearEnemyIndex(team2)!=-1) {
            heal();
            team1.get(indexPatient).setHp(team1.get(indexPatient).getHp() - minDamage);
            team1.get(indexPatient).setState("Жив");
            System.out.println(team1.get(indexPatient));
        } else {
            System.out.println(" Лечить никого не надо, победа!");
            return;
        }
    }
}
