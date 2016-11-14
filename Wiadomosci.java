package zad3_1;

import java.util.*;


public class Wiadomosci extends Strona {

    private List<String> articles = new ArrayList<>();

    public Wiadomosci() {
        String articles1 = "Aawdbdsfj ebfiw bfwi vwio jwoo cmdpcw jp wef. wehfo whfoid wlfjwpdf, we fjowe f wohf owe fo nsd";
        String articles2 = "Bbawidawvi awfkjbsjgsf waidhia whiseg oige o wfmvcpd gjpr hej hopejhrj hoi ehjr eow";
        String articles3 = "Cwhiseg oige o wfmvcpd gjpr hej hopejhrj hoi ehjr eow jq[perpg]hfhfg ht kjfewngiw gwib igweb ghidfbguidr godfnobw -wg ogen  gjpr hej hopejhrj";
        String articles4 = "Dkjbsjgsf waidhia whiseg oige o wfmvcpd gjpr hej hopejhrj hoi ehjr";
        String articles5 = "Eiw bfwi vwio jwoo cmdpcw jp wef. wehfo whfoid wlfjwpdf, we fjowe f wohf owe. gjpr hej hopejhrj hoi ewadsdaw. awjhdgiagdfiagA AIaig di wabdainasd kbadwd as af iawb. Baofhwwaof fheoa";

        articles.add(articles1);
        articles.add(articles2);
        articles.add(articles3);
        articles.add(articles4);
        articles.add(articles5);
    }

    public String generateContent() {
        Random rand = new Random();
        String content = "";
        int x = rand.nextInt(6)+3;
                
        for(int i = 0; i < x; i++) {
            int r = rand.nextInt(5);
            Wset div = new Wset("div");
            div.addAttribute(new Style("class", "img"));

            Wset p = new Wset("p");
            p.addAttribute(new Style("style", "font-family:'Courier New'"));
            p.addContent(articles.get(r));
            div.addContent(p.create());

            content += div.create();
        }
        return content;
    }

}
