package GameOOP;

public class Witch extends Magi{
    public Witch(String type,String name_id, Integer hp, Integer damage, Integer stamina, Integer heal, Integer spoil) {
        super(type,name_id, hp, damage, stamina, heal, spoil);
    }

    public Witch(String name) {
        super(name);
        super.type = "Колдун";
        super.spoil =10;
    }

}
