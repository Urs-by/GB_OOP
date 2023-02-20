package GameOOP;

public abstract class Shooter extends Human {
    Integer shots;

    public Shooter(String type, String name, Integer attack, Integer protection, Integer hp, Integer minDamage, Integer maxDamage, Integer speed, Integer shots) {
        super(type, name, attack, protection, hp, minDamage, maxDamage, speed);
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

    //    public Shooter(String name) {
//        super.name_id = name;
//        super.type = "Стрелок";
//    }

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
