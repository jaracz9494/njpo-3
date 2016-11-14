package zad3_1;

import java.util.*;


public class Galeria extends Strona {

    private Map<String, String> image = new HashMap<>();

    public Galeria() {
        image.put("1.jpg", "obraz1");
        image.put("2.jpg", "obraz2");
        image.put("3.jpg", "obraz3");
        image.put("4.jpg", "obraz4");
        image.put("5.jpg", "obraz5");
        image.put("6.jpg", "obraz6");
        image.put("7.jpg", "obraz7");
        image.put("8.jpg", "obraz8");
    }

    public String generateContent() {
        Random generator = new Random();
        String gallery = "";

        for(int i = 0; i < 3; ++i) {
            int random = generator.nextInt(8) + 1;
            Wset div = new Wset("div");
            div.addAttribute(new Style("class", "img"));

            Wset img = new Wset("img");
            img.addAttribute(new Style("src", "images/" + random + ".jpg"));
            div.addContent(img.create());

            Wset p = new Wset("p");
            p.addAttribute(new Style("class", "desc"));
            p.addContent(image.get(random + ".jpg"));
            div.addContent(p.create());

            gallery += div.create();
        }

        return gallery;
    }

}
