package GameOOP.Heroes;

public class Arbalester extends Shooter {

    public Arbalester(String type, String name, String team, Integer attack, Integer protection, Integer hp, Integer minDamage, Integer maxDamage, Integer speed, Integer x, Integer y, Integer shots) {
        super(type, name, team, attack, protection, hp, minDamage, maxDamage, speed, x, y, shots);
    }

    public Arbalester(String name, String team, Integer x, Integer y) {
        super("Арбалетчик", name, team, 6, 3, 10, 2, 3, 4, x, y, 16);
    }

    @Override
    public String getInfo() {
        return "Я арбалетчик ->)";
    }
}
