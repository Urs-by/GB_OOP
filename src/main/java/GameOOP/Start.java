package GameOOP;

import java.util.ArrayList;
import java.util.Random;

public class Start {
    public static void main(String[] args) {

//        ArrayList<Human> listHeroes = new ArrayList<>();
//
        for (int i = 0; i < 10; i++) {
            String className = getClassHero();
            Human hero = heroesUnit(className);
            System.out.printf("%s ",hero.getInfo());
            System.out.println(hero.getName_id());
            //System.out.println(hero);
        }
    }

    private static String getNamesHero() {
        String nameHero = String.valueOf(Names_hero.values()[new Random().nextInt(Names_hero.values().length )]);
        return nameHero;
    }

    private static String getClassHero() {
        String nameClas = String.valueOf(HeroClasses.values()[new Random().nextInt(HeroClasses.values().length )]);
        return nameClas;
    }

    public static Human heroesUnit ( String nameClas) {

        if (nameClas.equals("Archer")) {
            return new Archer(getNamesHero());
        } else if (nameClas.equals("Arbalester")) {
            return new Arbalester(getNamesHero());
        } else if (nameClas.equals("Monk")) {
           return new Monk(getNamesHero());
        } else if (nameClas.equals("Witch")) {
            return new Witch(getNamesHero());
        } else if (nameClas.equals("Pikeman")) {
           return new Pikeman(getNamesHero());
        } else if (nameClas.equals("Ronin")) {
            return new Ronin(getNamesHero());
        } else if (nameClas.equals("Farmer")) {
            return new Farmer(getNamesHero());

        }
        return null;
    }

}
