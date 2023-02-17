package GameOOP;

public class Archer extends Shooter {
//    public Archer(String type, String name_id, Integer hp, Integer damage, Integer stamina, Integer sharpshooting, Integer rapidity, Integer range, Integer arrows) {
//        super(type, name_id, hp, damage, stamina, sharpshooting, rapidity, range, arrows);
//    }

    public Archer(String name_id) {
        super("Лучник", name_id, 10, 5, 7, 7, 10, 5, 25);
    }

    @Override
    public String getInfo() {
        return "Я лучник-снайпер";
    }
}
