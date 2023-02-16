package GameOOP;

public abstract class Human {
    protected String type, name_id;
    protected Integer hp, damage,stamina;



    public Human(String type, String name_id, Integer hp , Integer damage, Integer stamina) {
        this.type = type;
        this.name_id = name_id;
        this.hp = hp;
        this.damage = damage;
        this.stamina = stamina;
    }


    public Human(String name_id) {
        this.name_id = name_id;
    }

    public Human() {
    }

    public void run() {
        System.out.printf("%s %s бежит", type, getName_id());
        System.out.println();

    }

    public void move() {
        System.out.printf("%s %s идет", type, getName_id());
        System.out.println();
    }

    public void rest() {
        System.out.printf("%s %s отдыхает", type, getName_id());
        System.out.println();
    }


    @Override
    public String toString() {
        return type + "{" +
                "name_id='" + name_id + '\'' +
                ", hp=" + hp +
                ", damage=" + damage +
                ", stamina=" + stamina +
                '}';
    }

    public String getName_id() {
        return name_id;
    }

    public void setName_id(String name_id) {
        this.name_id = name_id;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }

    public Integer getStamina() {
        return stamina;
    }

    public void setStamina(Integer stamina) {
        this.stamina = stamina;
    }


}
