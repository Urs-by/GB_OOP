package GameOOP;

public class Pikeman extends Battler {

    public Pikeman(String type, String name, Integer attack, Integer protection, Integer hp, Integer minDamage, Integer maxDamage, Integer speed) {
        super(type, name, attack, protection, hp, minDamage, maxDamage, speed);
    }

    public Pikeman(String name) {
        super("Копейщик", name, 4, 5, 10, 1, 3, 4);
    }

    @Override
    public String getInfo() {
        return "Я копейщик ->";
    }
}

