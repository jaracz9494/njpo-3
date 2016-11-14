package zad3_1;

public abstract class Strona {

    private String generateHeader() {
        String doctype = "<!DOCTYPE html>\n";
        String html = "<html lang=\"en\">\n";
        Wset head = new Wset("head");
        head.addContent("<meta charset=\"UTF-8\">\n");
        head.addContent(new Wset("title", "GENERATE PAGE").create());
        head.addContent("\n<link rel=\"stylesheet\" href=\"styles/style.css\">\n");
        return doctype + html + head.create();
    }

    public String getPage() {
        return generateHeader() + "<body>" + generateContent() + "</body></html>";
    }

    public abstract String generateContent();

}
