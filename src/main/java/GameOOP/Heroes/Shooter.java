package GameOOP;

public abstract class Shooter extends Human {
    Integer shots;

    public Shooter(String type, String name, String team, Integer attack, Integer protection, Integer hp, Integer minDamage, Integer maxDamage, Integer speed, Integer x, Integer y, Integer shots) {
        super(type, name, team, attack, protection, hp, minDamage, maxDamage, speed, x, y);
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
