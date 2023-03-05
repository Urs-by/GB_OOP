package GameOOP.Heroes;

import GameOOP.Coordinates;
import GameOOP.Human;

import java.util.ArrayList;

public abstract class Shooter extends Human {
    Integer shots;

    public Shooter(String type, String name, String team, Integer attack, Integer protection, Integer hp,
                   Integer minDamage, Integer maxDamage, Integer speed, Coordinates position, Integer shots) {
        super(type, name, team, attack, protection, hp, minDamage, maxDamage, speed, position);
        this.shots = shots;
    }

    public Shooter(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", shots=" + shots +
                '}';
    }

    public int findFarmer(ArrayList<Human> team) {
        for (int i = 0; i < team.size(); i++) {
            if (team.get(i).getType().contains("Крестьянин") && team.get(i).getState().contains("Жив")) {
                team.get(i).setState("Занят");
//                System.out.printf("Крестьянин %s ", team.get(i));
//                System.out.println();
                return i;
            }
        }
        return -1;
    }


    @Override
    public void step(ArrayList<Human> team1, ArrayList<Human> team2) {
        if (this.shots > 0 && this.state.contains("Жив")) {
            // поиск индекса ближайшего врага
            int indexEnemy = super.getNearEnemyIndex(team2);
            if (indexEnemy == -1) {
//                System.out.println("Все противники мертвы");
                return;
            } else {
                // вычисляем расстояние до врага

                Double distanceToEnemy = position.getDistance(team2.get(indexEnemy).position);
//                shoot();
                attac(team2, indexEnemy);

                ;
                // расчет урона
//                float damage = (team2.get(indexEnemy).getProtection() - attack > 0) ? minDamage :
//                        (team2.get(indexEnemy).getProtection() - attack < 0) ? maxDamage : (minDamage + maxDamage) / 2;
//
//                // в зависимости от расстояния отнимаем жизнь
//                if (distanceToEnemy < 5) {
//                    team2.get(indexEnemy).setHp(team2.get(indexEnemy).getHp() - damage);
//                    if (team2.get(indexEnemy).getHp() < 0) {
//                        team2.get(indexEnemy).setState("Мертв");
//                    }
//                } else {
//                    team2.get(indexEnemy).setHp(team2.get(indexEnemy).getHp() - damage * 0.5f);
//                    if (team2.get(indexEnemy).getHp() <= 0) {
//                        team2.get(indexEnemy).setState("Мертв");
////


                // поиск своего крестьянина
                if (findFarmer(team1) == -1) shots -= 1;

            }
        }
    }

    public void shoot() {
        System.out.printf("%s %s из команды %s стреляет, количество стрел %d", type, getName(), getTeam(), getShots());
        System.out.println();
    }

    public Integer getShots() {
        return shots;
    }

    public void setShots(Integer shots) {
        this.shots = shots;
    }
}
