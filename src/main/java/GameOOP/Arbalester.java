package GameOOP;

public class Arbalester extends Shooter{


    public Arbalester(String name_id, Integer hp, Integer damage, Integer stamina, Integer sharpshooting, Integer rapidity, Integer range, Integer arrows) {
        super(name_id, hp, damage, stamina, sharpshooting, rapidity, range, arrows);
        super.rapidity = 5;
        super.range = 10;
    }

    public Arbalester(String name) {
        super(name);
        super.rapidity = 5;
        super.range = 10;

    }
}
