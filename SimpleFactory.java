package zad3_1;


public class SimpleFactory {

    public static Strona buildPage(Wyborstrony type) {
        Strona page = null;
        switch (type) {
            case galeria:
                page = new Galeria();
                break;
            case informacje:
                page = new Informacje();
                break;
            case kontakt:
                page = new Kontakt();
                break;
            case wiadomosci:
                page = new Wiadomosci();
                break;
            
            default:
                break;
        }
        return page;
    }

}
