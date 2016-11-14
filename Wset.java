package zad3_1;

import java.util.*;

public class Wset extends Creater {

    private String name;
    private String content;
    private List<Style> attributes;

    public Wset(String name) {
        this.name = name;
        this.content = "";
        attributes = new ArrayList<>();
    }

    public Wset(String name, String content) {
        this.name = name;
        this.content = content;
        attributes = new ArrayList<>();
    }

    public Wset(String name, String content, List<Style> attributes) {
        this.name = name;
        this.content = content;
        this.attributes = attributes;
    }

    public void addAttribute(Style styl) {
        this.attributes.add(styl);
    }

    public void addContent(String content) {
        this.content += content;
    }

    private String createOpenTag() {
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        sb.append(this.name);
        if (this.attributes != null || this.attributes.size() != 0) {
            for (Style attr : attributes) {
                sb.append(" ");
                sb.append(attr.toString());
            }
        }
        sb.append(">\n");
        return sb.toString();
    }

    private String createCloseTag() {
        StringBuilder sb = new StringBuilder();
        sb.append("</");
        sb.append(this.name);
        sb.append(">\n");
        return sb.toString();
    }

    public String create() {
        return createOpenTag() + content + createCloseTag();
    }

}
