package GameOOP.Heroes;

import GameOOP.Coordinates;
import GameOOP.Human;

import java.util.ArrayList;

public abstract class Battler extends Human {
    public Battler(String type, String name, String team, Integer attack, Integer protection, Integer hp,
                   Integer minDamage, Integer maxDamage, Integer speed, Coordinates position) {
        super(type, name, team, attack, protection, hp, minDamage, maxDamage, speed, position);
    }


    public Battler(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return super.toString() + '}';
    }


    public int goLeft(int enemyPosY) {
        if (position.getPosY() < enemyPosY) return 1;
        else return -1;
    }

//    public int goUp(int enemyPosX) {
//        if (position.getPosX() < enemyPosX) return 1;
//        else return -1;
//    }

    public boolean freeForvard(ArrayList<Human> team, int step) {
        for (int i = 0; i < team.size(); i++) {
            if ((position.getPosY() + step) == team.get(i).position.getPosY() && position.getPosX() == team.get(i).position.getPosX())
                return false;
        }
        return true;
    }

    public boolean freeUp(ArrayList<Human> team, int step) {
        for (int i = 0; i < team.size(); i++) {
            if (position.getPosY() == team.get(i).position.getPosY() && (position.getPosX() + step) == team.get(i).position.getPosX())
                return false;
        }
        return true;
    }
//
//    }


    @Override
    public void step(ArrayList<Human> team1, ArrayList<Human> team2) {
        // поиск ближайшего противник
        int nearEnemyIndex = getNearEnemyIndex(team2);

        if (nearEnemyIndex==-1) return;
        else {

            // поиск по горизонтали координаты противника
            int enemyPosY = team2.get(nearEnemyIndex).position.getPosY();

            // определение направления движения
            int horizontStep = goLeft(enemyPosY);

            // определение дистанции до врага
            Double distanceToEnemy = position.getDistance(team2.get(nearEnemyIndex).position);

            // если дистанция меньше 2х, атака
            if (distanceToEnemy <= 2) {
                // атака
                attac(team2, nearEnemyIndex);

                //  иначе если впереди никого нет, передвигаемся на 1 шаг
            } else {
                if (!state.contains("Мертв") && freeForvard(team1, horizontStep)) {
                    position.setPosY(position.getPosY() + horizontStep);

                    // если сверху никого нет и не граница поля поднимаемся на шаг наверх
                } else if (!state.contains("Мертв") && freeUp(team1, 1) && position.getPosX() != 1) {
                    position.setPosX(position.getPosX() + 1);
                    // если внизу никого нет и не граница поля опускаемся на шаг вниз
                } else if (!state.contains("Мертв") && freeUp(team1, -1) && position.getPosX() != 10) {
                    position.setPosX(position.getPosX() - 1);
                    // в противном случае пропускаем ход
                } else return;
            }
        }
    }

}
