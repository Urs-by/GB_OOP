package GameOOP;

public class Monk extends Magi{
    public Monk(String type, String name_id, Integer hp, Integer damage, Integer stamina, Integer heal, Integer spoil) {
        super(type, name_id, hp, damage, stamina, heal, spoil);
    }

    public Monk(String name) {
        super(name);
        super.type ="Монах";
        super.heal = 10;
    }

}
