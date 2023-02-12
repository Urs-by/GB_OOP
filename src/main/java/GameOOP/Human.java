package GameOOP;

public class Human {
    protected String name_id;
    protected Integer hp = 10;
    protected Integer damage = 0;
    protected Integer stamina = 5;


    public Human(String name_id, Integer hp, Integer damage, Integer stamina) {
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
        System.out.printf("Игрок %s бежит", getName_id());

    }

    public void move() {
        System.out.printf("Игрок %s идет", getName_id());
    }

    public void rest() {
        System.out.printf("Игрок %s отдыхает", getName_id());
    }


    @Override
    public String toString() {
        return "Human{" +
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
