package HomeWork1;

public class Human {
    private String name;
    private String lastName;
    private String gender;
    private Human mother;
    private Human father;
    private Human children;
    private Human sister;
    private Human brother;

    public Human(String name, String lastName, String gender, Human mother, Human father, Human children , Human sister, Human brother ) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.sister = sister;
        this.brother = brother;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public Human getMother() {
        return mother;
    }

    public Human getFather() {
        return father;
    }

    public Human getChildren() {
        return children;
    }

    public Human getSister() {
        return sister;
    }
    public Human getBrother() {
        return brother;

    }

}
