package GameOOP.Heroes;

public class Archer extends Shooter {


    public Archer(String name, String team, Integer x, Integer y) {
        super("Лучник", name, team, 12, 1, 15, 8, 10, 9, x, y, 32);
    }

    @Override
    public String getInfo() {
        return "Я лучник-снайпер -)";
    }
}
