package ex43;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        //Ask for the name of the site
        System.out.print("Site name: ");
        String nameofsite = input.nextLine();
        //Ask for the author of the site
        System.out.print("Author: ");
        String author = input.nextLine();
        //Do they want JavaScript
        System.out.print("Do you want a folder for JavaScript? ");
        String javascript = input.nextLine();
        //Do they want CSS
        System.out.print("Do you want a folder for CSS? ");
        String css = input.nextLine();
        try {
            System.out.println(createWebsite(nameofsite, author, javascript, css));
        } catch(IOException e){
            System.out.println("Somethin messed up idk.");
        }
    }
    public static String createWebsite(String name, String author, String javascript, String css) throws IOException {
        //Generate an index.html file that contains the name of the site inside the <title> tag and the author in a <meta> tag.
        String userDirec = System.getProperty("user.dir");
        boolean website = (new File(userDirec + "\\website").mkdir());

        FileWriter xml = new FileWriter(new File(userDirec + "\\website\\index.html"));
        xml.write("<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n");
        xml.write("\t<meta author=\"" + author + "\">\n");
        xml.write("\t<title>" + name + "</title>\n");
        xml.write("</head>\n<body>\n\n</body>\n</html>");
        xml.close();

        System.out.println("Created " + userDirec + "\\website\\index.html");

        if(javascript.equals("y") || javascript.equals("yes")){
            boolean javaFolder = (new File(userDirec + "\\website\\js").mkdir());
            System.out.println("Created " + userDirec + "\\website\\js");
        }
        if(css.equals("y") || css.equals("yes")){
            boolean cssFolder = (new File(userDirec + "\\website\\css").mkdir());
            System.out.println("Created " + userDirec + "\\website\\css");
        }

        return "";
    }
}
