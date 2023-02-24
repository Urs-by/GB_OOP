package GameOOP.Heroes;

import GameOOP.Human;

public abstract class Magi extends Human {
    Integer magic;

    public Magi(String type, String name, String team, Integer attack, Integer protection, Integer hp, Integer minDamage, Integer maxDamage, Integer speed, Integer x, Integer y, Integer magic) {
        super(type, name, team, attack, protection, hp, minDamage, maxDamage, speed, x, y);
        this.magic = magic;
    }

    public Magi(String name) {
        super(name);
    }

    public void heal() {
        System.out.printf("%s %s исцеляет", type, getName());
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
}
