package GameOOP;

public class Shooter extends Human {
    protected Integer sharpshooting = 5;
    protected Integer rapidity;
    protected Integer range;
    protected Integer arrows = 25;

    public Shooter(String name_id, Integer hp, Integer damage, Integer stamina, Integer sharpshooting, Integer rapidity, Integer range, Integer arrows) {
        super(name_id, hp, damage, stamina);
        this.sharpshooting = sharpshooting;
        this.rapidity = rapidity;
        this.range = range;
        this.arrows = arrows;
    }

    public Shooter(String name) {
        super.name_id = name;
    }

    public void shoot() {
        System.out.printf("Стрелок %s стреляет", getName_id());
        System.out.println();
    }

    @Override
    public String toString() {
        return "Shooter{" +
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

    public Integer getSharpshooting() {
        return sharpshooting;
    }

    public void setSharpshooting(Integer sharpshooting) {
        this.sharpshooting = sharpshooting;
    }

    public Integer getRapidity() {
        return rapidity;
    }

    public void setRapidity() {
        this.rapidity = rapidity;
    }

    public Integer getRange() {
        return range;
    }

    public void setRange(Integer range) {
        this.range = range;
    }
}
