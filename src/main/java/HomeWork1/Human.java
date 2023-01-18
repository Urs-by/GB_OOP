package HomeWork1;

import java.util.ArrayList;
import java.util.List;

public class Human {
    private String name;
    private String lastName;
    private String gender;
    private Human spouse;
    private Human father;
    private Human mother;
    private List<Human> children = new ArrayList<>();
    private List<Human> siblings = new ArrayList<>();

    public Human(String name, String lastName, String gender, Human spouse, Human father, Human mother, List<Human> children, List<Human> siblings) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.spouse = spouse;
        this.father = father;
        this.mother = mother;
    }

    public Human(String name, String lastName, String gender) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.spouse = null;
        this.father = null;
        this.mother = null;
    }

    @Override
    public String toString() {
        return String.format("имя: %s, фамилия: %s, пол: %s" +
                "{ отец: %s," +
                " мать: %s}", this.name, this.lastName, this.gender, this.father, this.mother);
    }

    public void getHumanInfo() {
        System.out.println(String.format("имя: %s, фамилия: %s, пол: %s", this.name, this.lastName, this.gender));
        System.out.println(String.format("отец: %s", this.father));
        System.out.println(String.format("мать: %s", this.mother));
        System.out.println(String.format("супруг(а): %s", this.spouse));
        System.out.println(String.format("дети: %s", this.children));
        System.out.println(String.format("братья/сестры: %s", this.siblings));
    }

    public void setSpouse(Human spouse) {
        this.spouse = spouse;
    }

    public void setChild(Human person) {
        children.add(person);
    }

    public void setSiblings(Human person) {
        siblings.add(person);
    }

    public String getName() {
        return name;
    }

    public void say(Human who, Human whom, String whatsay) {
        System.out.printf("%s, говорит: %s, %s\n", who.getName(), whom.getName(), whatsay);
    }

    public void say(Human who, Pets whom, String whatsay) {
        System.out.printf("%s, говорит: %s, %s \n", who.getName(), whom.getName(), whatsay);
    }


}
