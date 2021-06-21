package ex45;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    //Open the txt file
    //Copy and print all the info into the terminal first
    //before printing, replace the word "utilize" with "use"
    //After it prints correctly in terminal, make a new output txt file
    //copy new text to output file
    public static final Scanner type = new Scanner(System.in);
    public static ArrayList<String> paragraph = new ArrayList<String>( );
    public static void main(String[] args) {
        File text = new File("input\\exercise45_input.txt");
        readFile(text);
        System.out.print("What would you like the output file to be named? ");
        String path = type.nextLine();
        System.out.println(newFile(path));
    }
    public static String readFile(File text){
        try {
            Scanner input = new Scanner(text);
            while(input.hasNextLine()){
                paragraph.add(input.nextLine().replace("utilize", "use"));
            }
            /*for(int i=0; i < paragraph.size();i++){
                System.out.println(paragraph.get(i));
            }*/
        } catch(FileNotFoundException e){
            return "File not found.";
        }
        return "";
    }
    public static String newFile(String path){
        try {
            FileWriter newText = new FileWriter("src\\main\\"+path+".txt");
            PrintWriter writer = new PrintWriter(newText);
            for(int i=0;i < paragraph.size();i++){
                writer.println(paragraph.get(i));
            }
            writer.close();
            return "File has been made.";
        } catch(IOException e){
            return "File cannot be made.";
        }
    }
}
