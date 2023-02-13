package GameOOP;

public class Witch extends Magi{
    public Witch(String name_id, Integer hp, Integer damage, Integer stamina, Integer heal, Integer spoil) {
        super(name_id, hp, damage, stamina, heal, spoil);
    }

    public Witch(String name) {
        super(name);
        super.spoil =10;
    }
    @Override
    public String toString() {
        return "Witch{" +
                "name_id='" + name_id + '\'' +
                ", hp=" + hp +
                ", damage=" + damage +
                ", stamina=" + stamina +
                ", heal=" + heal +
                ", spoil=" + spoil +
                '}';
    }
}
