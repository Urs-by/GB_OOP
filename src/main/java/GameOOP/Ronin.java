package GameOOP;

public class Ronin extends Battler {

    public Ronin(String type, String name, Integer attack, Integer protection, Integer hp, Integer minDamage, Integer maxDamage, Integer speed) {
        super(type, name, attack, protection, hp, minDamage, maxDamage, speed);
    }

    public Ronin(String name) {
        super("Разбойник", name, 8, 3, 10, 2, 4, 6);
    }

    public void hide() {
        System.out.printf("%s %s прячется ", type, getName());
        System.out.println();
    }

    @Override
    public String getInfo() {
        return "Я разбойник, ха ха ха";
    }
}
