package GameOOP;

public class Shooter extends Human{

    protected Integer sharpshooting;
    protected Integer rapidity;
    protected Integer range;

    public Shooter(String name_id, Integer sharpshooting, Integer rapidity, Integer range) {
        super(name_id);
        this.sharpshooting = sharpshooting;
        this.rapidity = rapidity;
        this.range = range;
    }

    public Shooter(String name) {
        super.name_id =name;
        this.sharpshooting = 5;
        this.rapidity = 5;
        this.range = 5;
    }
    public void shoot() {
        System.out.printf("Игрок %s стреляет", getName_id());
        System.out.println();
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

    public void setRapidity(Integer rapidity) {
        this.rapidity = rapidity;
    }

    public Integer getRange() {
        return range;
    }

    public void setRange(Integer range) {
        this.range = range;
    }
}
