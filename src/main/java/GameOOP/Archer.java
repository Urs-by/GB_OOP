package GameOOP;

public class Archer extends Shooter{
    public Archer(String name_id, Integer hp, Integer damage, Integer stamina, Integer sharpshooting, Integer rapidity, Integer range, Integer arrows) {
        super(name_id, hp, damage, stamina, sharpshooting, rapidity, range, arrows);
    }

    public Archer(String name) {
        super(name);
        super.rapidity = 10;
        super.range = 5;
    }

    @Override
    public String toString() {
        return "Archer{" +
                "name_id='" + name_id + '\'' +
                ", hp=" + hp +
                ", damage=" + damage +
                ", stamina=" + stamina +
                ", sharpshooting=" + sharpshooting +
                ", rapidity=" + rapidity +
                ", range=" + range +
                ", arrows=" + arrows +
                '}';
    }

}
