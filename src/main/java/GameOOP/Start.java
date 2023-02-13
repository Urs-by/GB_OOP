package GameOOP;

public class Start {
    public static void main(String[] args) {
        Farmer h1 = new Farmer("H1");
        Archer h2 = new Archer("A1");
        Shooter h3 = new Arbalester("A2");
        System.out.println(h1);
        Battler h4= new Pikeman("P1");
        Farmer f1 = new Farmer("Илья");
        System.out.println(h1);
        h1.rest();
        System.out.println(h2);
        h2.move();
        System.out.println(h3);
        h3.shoot();
        System.out.println(h4);
        h4.attacks();
        System.out.println(f1);
        f1.brings();
    }
}
