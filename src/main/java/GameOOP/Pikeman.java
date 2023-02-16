package GameOOP;

public class Pikeman extends Battler {

//    public Pikeman(String type, String name_id, Integer hp, Integer damage, Integer stamina, Boolean weapon, Boolean armor) {
//        super(type, name_id, hp, damage, stamina, weapon, armor);
//    }

    public Pikeman(String name_id) {
        super("Копейщик", name_id, 10,5,9,true,true);
    }
}

