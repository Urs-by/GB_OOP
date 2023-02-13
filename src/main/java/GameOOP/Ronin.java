package GameOOP;

public class Ronin extends Battler{

    public Ronin(String name_id, Integer hp, Integer damage, Integer stamina, Boolean weapon, Boolean armor) {
        super(name_id, hp, damage, stamina, weapon, armor);
    }

    public Ronin(String name_id) {
        super(name_id);
        super.weapon = false;
        super.armor = false;
    }
    @Override
    public String toString() {
        return "Ronin{" +
                "name_id='" + name_id + '\'' +
                ", hp=" + hp +
                ", damage=" + damage +
                ", stamina=" + stamina +
                ", weapon=" + weapon +
                ", armor=" + armor +
                '}';
    }
}
