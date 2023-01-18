package HomeWork1;

public class Pets {
    private String name;
    private String type;
    private Human ovner;

    public Pets(String name, String type, Human ovner) {
        this.name = name;
        this.type = type;
        this.ovner = ovner;
    }

    public Pets() {
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void voice(String type) {
        if (type.contains("кот")) {
            System.out.println("мяу-мяу");
        } else if (type.contains("собак")) {
            System.out.println("гав-гав");
        } else if (type.contains("птиц")) {
            System.out.println("чик-чирик");
        } else {
            System.out.println("не понятный звук");
        }
    }

    @Override
    public String toString() {
        return String.format("питомец: %s, кличка: %s, хозяин: %s", this.type, this.name, this.ovner);
    }

}
