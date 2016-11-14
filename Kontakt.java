package zad3_1;

import java.util.*;


public class Kontakt extends Strona {

    private List<String> fields = new ArrayList<>();
    private Map<Integer, List<String>> names = new HashMap<>();


    public Kontakt() {
        fields.add("Imie - ");
        fields.add("Nazwisko - ");
        fields.add("Adres - ");
        fields.add("Telefon - ");
        fields.add("E-mail - ");

        List<String> list1 = Arrays.asList("Jan", "Kowalski", "Warszawa", "123 456 789", "kowalski@gmail.com");
        List<String> list2 = Arrays.asList("Halina", "Werner", "Berlin", "666 555 444", "fuhrer69@gmail.com");
        List<String> list3 = Arrays.asList("Kali", "Ali", "Urugwaj", "666 666 666", "@@@.@.c@m");

        names.put(1, list1);
        names.put(2, list2);
        names.put(3, list3);
    }

    public String generateContent() {
        Random generator = new Random();
        int number = generator.nextInt(3) + 1;
        String contact = "";

        for (int i = 0; i < 5; i++) {
            Wset div = new Wset("div");

            Wset p = new Wset("p");
            div.addAttribute(new Style("style", "color: #FF0000"));
            p.addContent(fields.get(i));
            p.addContent(names.get(number).get(i));

            div.addContent(p.create());
            contact += div.create();
        }

        return contact;
    }

}
