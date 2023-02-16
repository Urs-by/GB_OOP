package GameOOP;

public class Start {
    public static void main(String[] args) {
        Archer a1 = new Archer("Artur");
        System.out.println(a1);
        Arbalester a2 = new Arbalester("VERT");
        System.out.println(a2);

        Shooter s2 = new Archer("A1");
        System.out.println(s2);
        s2.rest();
        Shooter s3 = new Arbalester("A2");
        System.out.println(s3);
        s3.shoot();

        Battler b2 = new Pikeman("В2");
        System.out.println(b2);
        b2.attacks();
        Ronin b3 = new Ronin("В3");
        System.out.println(b3);
        b3.hide();

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
