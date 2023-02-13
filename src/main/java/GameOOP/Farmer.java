package GameOOP;

public class Farmer extends Human {
    public Farmer(String type, String name_id, Integer hp, Integer damage, Integer stamina) {
        super(type, name_id, hp, damage, stamina);
    }

    public Farmer(String name_id) {
        super(name_id);
        super.type = "Крестьянин";
    }

    public void prepares() {
        System.out.printf("%s %s заготавливает продукты", type, getName_id());
        System.out.println();
    }

    public void brings() {
        System.out.printf("%s %s подносит оружие ", type, getName_id());
        System.out.println();
    }

}
