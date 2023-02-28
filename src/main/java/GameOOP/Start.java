package GameOOP;

import GameOOP.Heroes.*;
import GameOOP.Heroes.Sorcerers.Monk;
import GameOOP.Heroes.Sorcerers.Witch;
import GameOOP.Heroes.Shooters.Archer;
import GameOOP.Heroes.Shooters.Arbalester;
import GameOOP.Heroes.Battlers.Pikeman;
import GameOOP.Heroes.Battlers.Ronin;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {


        ArrayList<Human> team1 = new ArrayList<>();
//        System.out.println("Team1: ");

        // Создание команды белых
        for (int i = 0; i < 5; i++) {
            String className = getClassTeam1();
            Human hero = heroesUnit(className, "черные", new Coordinates(0, i+1) {});
            team1.add(hero);
//            System.out.printf("%s ", hero.getInfo());
//            System.out.println(hero.getName());
//            System.out.println(hero);

        }

        System.out.println();
        ArrayList<Human> team2 = new ArrayList<>();
//        System.out.println("Team2: ");
        // создание команды черных
        for (int i = 0; i < 5; i++) {
            String className = getClassTeam2();
            Human hero = heroesUnit(className, "белые", new Coordinates(10, i+1) { });
            team2.add(hero);
//            System.out.printf("%s ", hero.getInfo());
//            System.out.println(hero.getName());
            //System.out.println(hero);
        }

        // список всех игроков
        ArrayList<Human> allTeam = new ArrayList<>(team1);
        for (int i = 0; i < team2.size() ; i++) {
            allTeam.add(team2.get(i));
        }

         // сортировка всех игроков по скорости
        allTeam.sort(new Comparator<Human>() {
            @Override
            public int compare(Human o1, Human o2) {
                if (o2.getSpeed() == o1.getSpeed()) {

                    return (int) (o1.getHp() - o2.getHp());
                }
                return o2.getSpeed() - o1.getSpeed();
            }
        });
        System.out.println("Игроки по скорости:");
        for (int i = 0; i < allTeam.size(); i++) {
            System.out.println(allTeam.get(i));
        }

        System.out.println();

        while (true) {

            Scanner scan = new Scanner(System.in);
            scan.nextLine();
            for (Human human : allTeam) {
                if (team1.contains(human)) {
                    human.step(team1, team2);
                    if (dead(team2)){
                        System.out.printf("Команда %s, победила!", team1.get(0).getTeam());
                        break;
                    }
                }
                else{
                    human.step(team2, team1);
                    if (dead(team1)){
                        System.out.printf("Команда %s, победила!", team2.get(0).getTeam());
                        break;
                    }
                }
            }
        }
    }

    // проверка на состояния команды
    private static boolean dead (ArrayList<Human> team){

        for (int i = 0; i < team.size(); i++) {
            if(!team.get(i).getState().contains("Мертв")) return false;
        }
        return true;
    }



    private static String getNamesHero() {
        String nameHero = String.valueOf(Names_hero.values()[new Random().nextInt(Names_hero.values().length)]);
        return nameHero;
    }

    private static String getClassHero() {
        String nameClas = String.valueOf(HeroClasses.values()[new Random().nextInt(HeroClasses.values().length)]);
        return nameClas;
    }

    private static String getClassTeam1() {
        String nameClas = String.valueOf(Team1.values()[new Random().nextInt(Team1.values().length)]);
        return nameClas;
    }

    private static String getClassTeam2() {
        String nameClas = String.valueOf(Team2.values()[new Random().nextInt(Team2.values().length)]);
        return nameClas;
    }

    public static Human heroesUnit(String nameClas, String team, Coordinates position) {

        if (nameClas.equals("Archer")) {
            return new Archer(getNamesHero(), team, position);
        } else if (nameClas.equals("Arbalester")) {
            return new Arbalester(getNamesHero(), team, position);
        } else if (nameClas.equals("Monk")) {
            return new Monk(getNamesHero(), team, position);
        } else if (nameClas.equals("Witch")) {
            return new Witch(getNamesHero(), team, position);
        } else if (nameClas.equals("Pikeman")) {
            return new Pikeman(getNamesHero(), team, position);
        } else if (nameClas.equals("Ronin")) {
            return new Ronin(getNamesHero(), team, position);
        } else if (nameClas.equals("Farmer")) {
            return new Farmer(getNamesHero(), team, position);
        }
        return null;
    }
}



