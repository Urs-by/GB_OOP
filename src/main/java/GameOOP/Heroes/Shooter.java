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

    public int findFarmer(ArrayList<Human> team){
        int index = 0;
        for (int i = 0; i < team.size(); i++) {
            if (team.get(i).getType().equals("Крестьянин") | team.get(i).getHp() > 0) {

                    return i;
            }
        }
        return -1;
    }


    @Override
    public void step(ArrayList<Human> team1, ArrayList<Human>team2) {
        if (this.shots > 0 && this.hp > 0){
            // поиск индекса ближайшего врага
            int indexEnemy = super.getNearEnemyIndex(team2);
            shoot();

            // вычисляем расстояние до врага
            System.out.printf("Жертва, %s", team2.get(indexEnemy));
            System.out.println();
            Double distanceToEnemy = position.getDistance(team2.get(indexEnemy).position);

            // расчет урона
            float damage = (team2.get(indexEnemy).getProtection() - attack > 0) ? minDamage :
                    (team2.get(indexEnemy).getProtection() - attack < 0) ? maxDamage : (minDamage+maxDamage)/2;

            // в зависимости от расстояния отнимаем жизнь
            if (distanceToEnemy < 5){

                team2.get(indexEnemy).setHp(team2.get(indexEnemy).getHp() - damage);
                System.out.printf("Урон %f, осталось НР = %f",damage, team2.get(indexEnemy).getHp());
                System.out.println();
            } else{


                team2.get(indexEnemy).setHp(team2.get(indexEnemy).getHp() - damage*0.5f);
                System.out.printf("Урон %f, осталось НР = %f",damage*0.5f, team2.get(indexEnemy).getHp());
                System.out.println();
            }
            ;
            if (findFarmer(team1) == -1){
                this.shots -=1;
            }
        }
    }

    public void shoot() {
        System.out.printf("%s %s стреляет", type, getName());
        System.out.println();
    }

    public Integer getShots() {
        return shots;
    }

    public void setShots(Integer shots) {
        this.shots = shots;
    }
}
