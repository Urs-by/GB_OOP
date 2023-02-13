package GameOOP;

public class Arbalester extends Shooter {


    public Arbalester(String type, String name_id, Integer hp, Integer damage, Integer stamina, Integer sharpshooting, Integer rapidity, Integer range, Integer arrows) {
        super(type, name_id, hp, damage, stamina, sharpshooting, rapidity, range, arrows);
    }

    public Arbalester(String name) {
        super(name);
        super.type = "Арбалетчик";
        super.rapidity = 5;
        super.range = 10;
    }


}
