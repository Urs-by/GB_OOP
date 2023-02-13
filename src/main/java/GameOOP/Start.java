package GameOOP;

public class Start {
    public static void main(String[] args) {
        Human h1 = new Human("H1");
        System.out.println(h1);
        h1.run();
        h1.move();
        h1.rest();
        Shooter s1 = new Shooter("S1");
        System.out.println(s1);
        Shooter s2 = new Archer("A1");
        System.out.println(s2);
        s2.rest();
        Shooter s3 = new Arbalester("A2");
        System.out.println(s3);
        s3.shoot();
        Battler b1= new Battler("B1");
        System.out.println(b1);
        Battler b2 = new Pikeman("В2");
        System.out.println(b2);
        b2.attacks();
        Ronin b3 = new Ronin("В3");
        System.out.println(b3);
        b3.hide();
        Human m1 = new Magi("M1");
        System.out.println(m1);
        Magi m2 = new Monk("M2");
        System.out.println(m2);
        m2.heal();
        Magi m3 = new Witch("M3");
        System.out.println(m3);
        m3.spoil();
        Farmer f1 = new Farmer("F1");
        System.out.println(f1);    f1.brings();
        f1.prepares();
    }

}
