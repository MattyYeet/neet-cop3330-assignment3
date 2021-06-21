package ex46;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCounter {
    public static String paragraph = "";
    public static String readFile(File text){
        try {
            Scanner input = new Scanner(text);
            StringBuilder paragraphBuilder = new StringBuilder();
            while(input.hasNextLine()){
                int i=0;
                paragraphBuilder.append(input.nextLine()).append("\n");
                //words.get(i).split(" ");
            }
            paragraph = paragraphBuilder.toString();
            paragraph = paragraph.replace("\n", " ");

            String[] arr = paragraph.split(" ");

            //System.out.println(paragraph);
        } catch(FileNotFoundException e){
            System.out.println("File not found.");
        }
        return paragraph;
    }

    public static String getParagraph() {
        return paragraph;
    }

    public static void setParagraph(String paragraph) {
        WordCounter.paragraph = paragraph;
    }

}
