package GameOOP;

public class Magi extends Human {
    protected Integer heal = 5;
    protected Integer spoil = 5;

    public Magi(String type, String name_id, Integer hp, Integer damage, Integer stamina, Integer heal, Integer spoil) {
        super(type, name_id, hp, damage, stamina);
        this.heal = heal;
        this.spoil = spoil;
    }

    public Magi(String name) {
        super.name_id = name;
        super.type = "Волхв";
    }

    public void heal() {
        System.out.printf("%s %s исцеляет", type, getName_id());
        System.out.println();
    }

    public void spoil() {
        System.out.printf("%s %s колдует", type, getName_id());
        System.out.println();
    }

    @Override
    public String toString() {
        return type + "{" +
                "name_id='" + name_id + '\'' +
                ", hp=" + hp +
                ", damage=" + damage +
                ", stamina=" + stamina +
                ", heal=" + heal +
                ", spoil=" + spoil +
                '}';
    }

    public Integer getHeal() {
        return heal;
    }

    public void setHeal(Integer heal) {
        this.heal = heal;
    }

    public Integer getSpoil() {
        return spoil;
    }

    public void setSpoil(Integer spoil) {
        this.spoil = spoil;
    }
}
