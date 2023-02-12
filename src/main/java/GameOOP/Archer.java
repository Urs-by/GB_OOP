package GameOOP;

public class Archer extends Shooter{
    public Archer(String name_id, Integer hp, Integer damage, Integer stamina, Integer sharpshooting, Integer rapidity, Integer range, Integer arrows) {
        super(name_id, hp, damage, stamina, sharpshooting, rapidity, range, arrows);
        super.rapidity = 10;
        super.range = 5;
    }

    public Archer(String name) {
        super(name);
        super.rapidity = 10;
        super.range = 5;

    }

}
