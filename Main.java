package zad3_1;


import java.io.*;
import java.nio.file.Files;
import java.util.Scanner;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;


public class Main {

    private Scanner in = new Scanner(System.in);
    private static final File directory = new File("Strona1");
    private static final File pageFile = new File("Strona1/index.html");
    private static final File dirImage = new File("Strona1/images");
    private static final File dirStyle = new File("Strona1/styles");

    public static void main(String[] args) {
        Main main = new Main();
        main.program();
    }

    private void program() {
        Wyborstrony strona = WyborS();
        if (strona == null) {
            return;
        }
        Strona page = SimpleFactory.buildPage(strona);
        createDir();
        copyStyle();
        savePage(page.getPage());
        if (strona == Wyborstrony.galeria) {
            Obrazy();
        }

        //System.out.println(directory.getAbsolutePath());
    }

    private void createDir() {
        if (!directory.exists()) {
            directory.mkdir();
        } else {
            directory.delete();
            directory.mkdir();
        }
        dirImage.mkdir();
        dirStyle.mkdir();
    }

    private Wyborstrony WyborS() {
        int wybor = -1;
        
        System.out.println();
        
        while (wybor==-1) {
            
            System.out.println("1 - Galeria");
            System.out.println("2 - Strona informacyjna");
            System.out.println("3 - Strona kontaktowa");
            System.out.println("4 - Aktualności");
            System.out.print("Wybór: ");
            
            wybor = Integer.parseInt(in.nextLine());

            switch (wybor) {
                case 1:
                    return Wyborstrony.galeria;
                case 2:
                    return Wyborstrony.informacje;
                case 3:
                    return Wyborstrony.kontakt;
                case 4:
                    return Wyborstrony.wiadomosci;
                default: 
                    System.out.println();
                    System.out.println("Nie ma takiej opcji");
                    wybor=-1;
            }
        }
        return null;
    }

    private void Obrazy() {
        try {
            for(int i = 1; i <= 8; i++ ) {
                String pathImg = "res/image/" + i + ".jpg";
                String pathImgCopy = dirImage.toString() + "/" + i + ".jpg";
                Files.copy(new File(pathImg).toPath(), new File(pathImgCopy).toPath(), REPLACE_EXISTING);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    private void copyStyle() {
        try {
            String style = "res/style.css";
            String styleCopy = dirStyle.toString() + "/style.css";
            Files.copy(new File(style).toPath(), new File(styleCopy).toPath(), REPLACE_EXISTING);
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
    }

    private void savePage(String page) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(pageFile));
            bw.write(page);
            bw.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

}
