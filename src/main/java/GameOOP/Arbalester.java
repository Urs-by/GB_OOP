package GameOOP;

public class Arbalester extends Shooter {


    public Arbalester(String type, String name, Integer attack, Integer protection, Integer hp, Integer minDamage, Integer maxDamage, Integer speed, Integer shots) {
        super(type, name, attack, protection, hp, minDamage, maxDamage, speed, shots);
    }

    public Arbalester(String name) {
        super("Арбалетчик",name, 6, 3, 10, 2, 3, 4, 16);
    }

    @Override
    public String getInfo() {
        return "Я арбалетчик ->)";
    }
}
