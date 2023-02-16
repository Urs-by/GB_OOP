package GameOOP;

public class Ronin extends Battler {

    public Ronin(String type, String name_id, Integer hp, Integer damage, Integer stamina, Boolean weapon, Boolean armor) {
        super(type, name_id, hp, damage, stamina, weapon, armor);
    }

    public Ronin(String name_id) {
        super("Разбойник",name_id, 8, 3,9,false,false);
    }

    public void hide() {
        System.out.printf("%s %s прячется ", type, getName_id());
        System.out.println();
    }



}
