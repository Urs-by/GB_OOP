package GameOOP;

import java.util.Random;

public class Start {
    public static void main(String[] args) {

        Archer a1 = new Archer(getNamesHero());
        System.out.println(a1.getInfo());

        Arbalester a2 = new Arbalester(getNamesHero());
        System.out.println(a2);

        Shooter s2 = new Archer(getNamesHero());
        System.out.println(s2);
        s2.rest();
        Shooter s3 = new Arbalester(getNamesHero());
        System.out.println(s3);
        s3.shoot();

        Battler b2 = new Pikeman(getNamesHero());
        System.out.println(b2);
        b2.attacks();
        Ronin b3 = new Ronin(getNamesHero());
        System.out.println(b3);
        b3.hide();

        Magi m2 = new Monk(getNamesHero());
        System.out.println(m2);
        m2.heal();
        Magi m3 = new Witch(getNamesHero());
        System.out.println(m3);
        m3.spoil();
        Farmer f1 = new Farmer(getNamesHero());
        System.out.println(f1);
        f1.brings();
        f1.prepares();

    }
    private static String getNamesHero(){
        String nameHero = String.valueOf(Names_hero.values()[new Random().nextInt(Names_hero.values().length - 1)]);
        return nameHero;
    }

}
