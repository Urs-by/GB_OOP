package GameOOP;

public abstract class Shooter extends Human {
    Integer sharpshooting, rapidity, range, arrows;


    public Shooter(String type, String name_id, Integer hp, Integer damage, Integer stamina, Integer sharpshooting, Integer rapidity, Integer range, Integer arrows) {
        super(type,name_id, hp, damage, stamina);
        this.sharpshooting = sharpshooting;
        this.rapidity = rapidity;
        this.range = range;
        this.arrows = arrows;
    }


    public Shooter() {
        super();
    }

//    public Shooter(String name) {
//        super.name_id = name;
//        super.type = "Стрелок";
//    }

    public void shoot() {
        System.out.printf("%s %s стреляет", type, getName_id());
        System.out.println();
    }

    @Override
    public String toString() {
        return type + "{" +
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
