package zad3_1;


public class Style {

    private String pocz;
    private String kon;

    public Style(String pocz, String kon) {
        this.pocz = pocz;
        this.kon = kon;
    }

    public String toString() {
        return pocz + "=\"" + kon + "\"";
    }

}
