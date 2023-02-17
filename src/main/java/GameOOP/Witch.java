package GameOOP;

public class Witch extends Magi {
    public Witch(String type, String name_id, Integer hp, Integer damage, Integer stamina, Integer heal, Integer spoil) {
        super(type, name_id, hp, damage, stamina, heal, spoil);
    }

    public Witch(String name_id) {
        super("Колдун",name_id, 10,7,10,7,10);
    }

    @Override
    public String getInfo() {
        return ("Я колдун ");
    }
}
