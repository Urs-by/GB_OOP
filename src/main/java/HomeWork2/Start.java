package HomeWork2;

import java.util.*;

public class Start {
    public static void main(String[] args) {
        ArrayList<String> mylist = new ArrayList<>();
        mylist.add("Школа");
        mylist.add("Университет");

        System.out.println("Создадим экземляр неизменяемого класса Immutable:");
        Immutable one = new Immutable("Вася", 35, new Date( 95,11,24),  mylist);
        System.out.println(one);
        System.out.println();

        System.out.println("Попытаемся изменить данные в неизменяемом классе:");
        one.getString().toLowerCase();
        String newString = one.getString();
        newString = "Петя";
        System.out.printf("string = %s \n",newString);

        int newNumeric = one.getNumeric();
        newNumeric = 34;
        System.out.printf("numeric = %d \n",newNumeric);

        Date newDate  = one.getDate();
        newDate.setTime(0);
        System.out.print("date = ");
        System.out.println(new Date(0));



        one.getStringList().add("Повышение квалификации");
        mylist.remove(1);
        System.out.printf("mylist = %s \n", mylist);

        System.out.println();
        System.out.println("После попытки внести изменения:");
        System.out.println(one);

    }
}

