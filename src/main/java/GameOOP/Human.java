package GameOOP;

public abstract class Human implements HumanInterface {
    protected String type, name, team;
    protected Integer attack, protection, hp, minDamage, maxDamage, speed, x, y;

    public Human(String type, String name, String team, Integer attack, Integer protection, Integer hp, Integer minDamage, Integer maxDamage, Integer speed, Integer x, Integer y) {
        this.type = type;
        this.name = name;
        this.team = team;
        this.attack = attack;
        this.protection = protection;
        this.hp = hp;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.speed = speed;
        this.x = x;
        this.y = y;
    }

    public Human(String name) {
        this.name = name;
        this.x = 0;
        this.y = 0;
    }

    public Human() {
    }

//    public void run() {
//        System.out.printf("%s %s бежит", type, getName());
//        System.out.println();
//
//    }

//    public void move() {
//        System.out.printf("%s %s идет", type, getName());
//        System.out.println();
//    }
//
//    public void rest() {
//        System.out.printf("%s %s отдыхает", type, getName());
//        System.out.println();
//    }


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
                ", x = " + x+
                ", y = " + y;
    }


    @Override
    public String getInfo() {
        return "Я человек ";
    }

    @Override
    public void step() {
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
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

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
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
