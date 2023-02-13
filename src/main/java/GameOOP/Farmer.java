package GameOOP;

public class Farmer extends Human{
    public Farmer(String name_id, Integer hp, Integer damage, Integer stamina) {
        super(name_id, hp, damage, stamina);
    }

    public Farmer(String name_id) {
        super(name_id);
    }

    public void prepares() {
        System.out.printf("Крестьянин %s заготавливает продукты", getName_id());
        System.out.println();
    }
    public void brings() {
        System.out.printf("Крестьянин %s подносит оружие ", getName_id());
        System.out.println();
    }


    @Override
    public String toString() {
        return "Fermer{" +
                "name_id='" + name_id + '\'' +
                ", hp=" + hp +
                ", damage=" + damage +
                ", stamina=" + stamina +
                '}';
    }
}
