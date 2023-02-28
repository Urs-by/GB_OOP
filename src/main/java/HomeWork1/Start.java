package HomeWork1;

public class Start {
    public static void main(String[] args) {


        Human h1 = new Human("Адам", "Первый", "м");
        Human h2 = new Human("Ева", "Вторая", "ж", h1, null, null, null, null);
        Human h3 = new Human("Каин", "Адамов", "м", null, h1, h2, null, null);
        Human h4 = new Human("Авель", "Адамов", "м", null, h1, h2, null, null);


        h1.setSpouse(h2);
        h1.setChild(h3);
        h1.setChild(h4);
        h2.setChild(h3);
        h2.setChild(h4);
        h3.setSiblings(h4);
        h3.getHumanInfo();


        Pets dog = new Pets("Бим", "собака", h4);
        Pets cat = new Pets("Мурка", "котик", h3);


        System.out.println();
        h3.say(h3, dog, "Ко мне!");
        dog.voice(dog.getType());
        h4.say(h4,cat,"Кис-кис");
        cat.voice(cat.getType());
        h2.say(h2,h1,"кусни яблоко");
        h2.say(h1,h2,"а точно ничего страшного не случится?");
    }
}
