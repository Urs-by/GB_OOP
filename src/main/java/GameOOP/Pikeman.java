package GameOOP;

public class Pikeman extends Battler {

    public Pikeman(String type, String name, String team, Integer attack, Integer protection, Integer hp, Integer minDamage, Integer maxDamage, Integer speed, Integer x, Integer y) {
        super(type, name, team, attack, protection, hp, minDamage, maxDamage, speed, x, y);
    }

    public Pikeman(String name, String team, Integer x, Integer y) {
        super("Копейщик", name, team, 4, 5, 10, 1, 3, 4, x, y);
    }

    @Override
    public String getInfo() {
        return "Я копейщик ->";
    }
}

