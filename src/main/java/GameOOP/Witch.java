package GameOOP;

public class Witch extends Magi {
    public Witch(String type, String name, Integer attack, Integer protection, Integer hp, Integer minDamage, Integer maxDamage, Integer speed, Integer magic) {
        super(type, name, attack, protection, hp, minDamage, maxDamage, speed, magic);
    }

    public Witch(String name) {
        super("Колдун",name,17,12,30,-5,-5,9,1);
    }

    @Override
    public String getInfo() {
        return ("Я колдун !");
    }
}
