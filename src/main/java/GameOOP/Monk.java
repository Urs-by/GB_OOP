package GameOOP;

public class Monk extends Magi {
    public Monk(String type, String name, Integer attack, Integer protection, Integer hp, Integer minDamage, Integer maxDamage, Integer speed, Integer magic) {
        super(type, name, attack, protection, hp, minDamage, maxDamage, speed, magic);
    }

    public Monk(String name) {
        super("Монах", name, 12,7,30,-4,-4,5,1);
    }

    @Override
    public String getInfo() {
        return "Я монах !";
    }
}
