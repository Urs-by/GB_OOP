package GameOOP;

public abstract class Battler extends Human {


    public Battler(String type, String name, Integer attack, Integer protection, Integer hp, Integer minDamage, Integer maxDamage, Integer speed) {
        super(type, name, attack, protection, hp, minDamage, maxDamage, speed);

    }

    public Battler(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return super.toString() + '}';
    }

//    public void attacks() {
//        System.out.printf("%s %s аттакует", type, getName());
//        System.out.println();
//    }

}
