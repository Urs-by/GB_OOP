package GameOOP;

public class Arbalester extends Shooter {


//    public Arbalester(String type, String name_id, Integer hp, Integer damage, Integer stamina, Integer sharpshooting, Integer rapidity, Integer range, Integer arrows) {
//        super(type, name_id, hp, damage, stamina, sharpshooting, rapidity, range, arrows);
//    }

    public Arbalester(String name_id) {
        super("Арбалетчик",name_id, 10, 5, 7, 7, 5, 10, 25);
    }

    @Override
    public String getInfo() {
        return "Я арбалетчик ->)";
    }
}
