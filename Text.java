package zad3_1;


public class Text extends Creater {

    private String text;

    public Text(String text) {
        this.text = text;
    }

    public String create() {
        return text
                .replace("<", "&lt;")
                .replace(">", "&gt;")
                .replace("&", "&amp;")
                .replace("\"", "&quot;");
    }

}
