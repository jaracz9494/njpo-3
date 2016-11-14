package zad3_1;

import java.util.*;


public class Informacje extends Strona {

    private List<String> colors = new ArrayList<>();
    private String text = "jgsf waidhia whiseg oige o wfmvcpd gjpr hej hopejhrj hoi ehjr eow jq[perpg]hfhfg ht kjfewngiw gwib igweb ghidfbguidr godfnobw -wg ogen  gjpr hej hopejhrj";

    public String generateContent() {

        Wset div = new Wset("div");

        Wset p = new Wset("p");
        p.addAttribute(new Style("style", "color: #000000"));
        for(int i = 0; i < 20; i++) {
            p.addContent(text);
        }
        div.addContent(p.create());

        return div.create();
    }

}
