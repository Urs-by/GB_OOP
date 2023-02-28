package HomeWork2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public final class Immutable {
    private final String string;
    private final int numeric;
    private final Date date;
    private final List<String> stringList;

    public Immutable(String string, int numeric, Date date, List<String> stringList) {
        this.string = string;
        this.numeric = numeric;
        this.date = date;
        this.stringList = new ArrayList<>(stringList);
    }

    // так как String и int являются также неизменяемыми классами,
    // то ограничить доступ достаточно только геттером
    public String getString() {
        return string;
    }

    public int getNumeric() {
        return numeric;
    }

    //класс Date ссылочный объект, поэтому необходимо для неизменности экземпляра создать клон
    public Date getDate() {
        return (Date) date.clone();
    }

    // класс List подвержен изменению элементов,
    // поэтому при обращении к нему будем возвращать новый List в гетерре и конструкторе
    public List<String> getStringList() {
        return new ArrayList<>(stringList);
    }

    @Override
    public String toString() {
        return "Immutable{" +
                "string='" + string + '\'' +
                ", numeric=" + numeric +
                ", date=" + date +
                ", stringList=" + stringList +
                '}';
    }
}
