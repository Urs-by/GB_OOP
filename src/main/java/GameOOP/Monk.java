package GameOOP;

public class Monk extends Magi {
    public Monk(String type, String name_id, Integer hp, Integer damage, Integer stamina, Integer heal, Integer spoil) {
        super(type, name_id, hp, damage, stamina, heal, spoil);
    }

    public Monk(String name_id) {
        super("Монах", name_id, 10, 5, 10, 10, 7);
    }

    @Override
    public String getInfo() {
        return "Я монах !";
    }
}
