package GameOOP;

public class Archer extends Shooter {


    public Archer(String name) {
        super("Лучник", name, 12, 1, 15, 8, 10, 9, 32);
    }

    @Override
    public String getInfo() {
        return "Я лучник-снайпер -)";
    }
}
