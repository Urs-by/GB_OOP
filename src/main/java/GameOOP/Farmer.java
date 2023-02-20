package GameOOP;

public class Farmer extends Human {
    private Integer delivery;

    public Farmer(String type, String name, String team, Integer attack, Integer protection, Integer hp, Integer minDamage, Integer maxDamage, Integer speed, Integer x, Integer y, Integer delivery) {
        super(type, name, team, attack, protection, hp, minDamage, maxDamage, speed, x, y);
        this.delivery = delivery;
    }

    public Farmer(String name, String team, Integer x, Integer y) {
        super("Крестьянин", name, team, 1, 1, 1, 1, 1, 3, x, y);
        this.delivery = 1;
    }

    @Override
    public String getInfo() {
        return ("Я крестьянин :(");
    }

    @Override
    public String toString() {
        return super.toString() + ", delivery=" + delivery + '}';
    }

//    public void prepares() {
//        System.out.printf("%s %s заготавливает продукты", type, getName());
//        System.out.println();
//    }
//
//    public void brings() {
//        System.out.printf("%s %s подносит оружие ", type, getName());
//        System.out.println();
//    }

}
