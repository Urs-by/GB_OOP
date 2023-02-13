package GameOOP;

public class Monk extends Magi{
    public Monk(String name_id, Integer hp, Integer damage, Integer stamina, Integer heal, Integer spoil) {
        super(name_id, hp, damage, stamina, heal, spoil);
    }

    public Monk(String name) {
        super(name);
        super.heal = 10;
    }
    @Override
    public String toString() {
        return "Monk{" +
                "name_id='" + name_id + '\'' +
                ", hp=" + hp +
                ", damage=" + damage +
                ", stamina=" + stamina +
                ", heal=" + heal +
                ", spoil=" + spoil +
                '}';
    }
}
