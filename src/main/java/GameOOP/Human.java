package GameOOP;

import java.util.ArrayList;

public abstract class Human  implements HumanInterface  {
    protected String type, name, team;
    protected int attack, protection,  minDamage, maxDamage, speed;
    protected float hp;
    public Coordinates position ;



    public Human(String type, String name, String team, int attack, int protection, int hp,
                 int minDamage, int maxDamage, int speed, Coordinates position) {
        this.type = type;
        this.name = name;
        this.team = team;
        this.attack = attack;
        this.protection = protection;
        this.hp = hp;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.speed = speed;
        this.position = position;
    }


    public Human(String name) {
        this.name = name;
//        this.x = 0;
//        this.y = 0;
    }


    public Human() {
    }



    @Override
    public String toString() {
        return type + "{" +
                "name = '" + name + '\'' +
                ", team = " + team +
                ", attack = " + attack +
                ", protection = " + protection +
                ", hp = " + hp +
                ", minDamage = " + minDamage +
                ", maxDamage = " + maxDamage +
                ", speed = " + speed +
                ", x = " + position.posX+
                ", y = " + position.posY;
    }


    @Override
    public String getInfo() {
        return "Я человек ";
    }

    public int getNearEnemyIndex(ArrayList<Human>team){
        int index =0;
        double min = 1000;
        for (int i = 0; i < team.size(); i++) {
            if (min > position.getDistance(team.get(i).position)) {
                if (team.get(i).hp > 0) {
                    min = position.getDistance(team.get(i).position);
                    index = i;
                }
            }
        }
        return index;
    }


    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public Integer getProtection() {
        return protection;
    }

    public void setProtection(Integer protection) {
        this.protection = protection;
    }

    public float getHp() {
        return hp;
    }

    public void setHp(float hp) {
        this.hp = hp;
    }

    public Integer getMinDamage() {
        return minDamage;
    }

    public void setMinDamage(Integer minDamage) {
        this.minDamage = minDamage;
    }

    public Integer getMaxDamage() {
        return maxDamage;
    }

    public void setMaxDamage(Integer maxDamage) {
        this.maxDamage = maxDamage;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }
}
