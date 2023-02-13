package GameOOP;

public class Battler extends Human {
    protected Boolean weapon;
    protected Boolean armor;

    public void attacks() {
        System.out.printf("%s %s аттакует", type, getName_id());
        System.out.println();
    }

    public Battler(String type, String name_id, Integer hp, Integer damage, Integer stamina, Boolean weapon, Boolean armor) {
        super(type, name_id, hp, damage, stamina);
        this.weapon = weapon;
        this.armor = armor;
    }

    public Battler(String name_id) {
        super(name_id);
        super.type = "Боец";
    }

    @Override
    public String toString() {
        return type + "{" +
                "name_id='" + name_id + '\'' +
                ", hp=" + hp +
                ", damage=" + damage +
                ", stamina=" + stamina +
                ", weapon=" + weapon +
                ", armor=" + armor +
                '}';
    }

    public Boolean getWeapon() {
        return weapon;
    }


    public void setWeapon(Boolean weapon) {
        this.weapon = weapon;
    }

    public Boolean getArmor() {
        return armor;
    }

    public void setArmor(Boolean armor) {
        this.armor = armor;
    }
}
