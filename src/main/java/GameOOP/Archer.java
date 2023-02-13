package GameOOP;

public class Archer extends Shooter {
    public Archer(String type, String name_id, Integer hp, Integer damage, Integer stamina, Integer sharpshooting, Integer rapidity, Integer range, Integer arrows) {
        super(type, name_id, hp, damage, stamina, sharpshooting, rapidity, range, arrows);
    }

    public Archer(String name) {
        super(name);
        super.type = "Лучник";
        super.rapidity = 10;
        super.range = 5;
    }


}
