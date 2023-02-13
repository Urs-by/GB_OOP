package GameOOP;

public class Pikeman extends Battler{
    public Pikeman(String name_id, Integer hp, Integer damage, Integer stamina, Boolean weapon, Boolean armor) {
        super(name_id, hp, damage, stamina, weapon, armor);
    }

    public Pikeman(String name_id) {
        super(name_id);
        super.weapon = true;
        super.armor = true;
    }

    @Override
    public String toString() {
        return "Pikeman{" +
                "name_id='" + name_id + '\'' +
                ", hp=" + hp +
                ", damage=" + damage +
                ", stamina=" + stamina +
                ", weapon=" + weapon +
                ", armor=" + armor +
                '}';
    }
}

