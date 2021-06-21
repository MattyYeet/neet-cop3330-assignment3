package ex41;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //open the file "exercise41_input.txt" file
        File text = new File("input\\exercise41_input.txt");
        System.out.println(newFile(text));
    }
    public static String newFile(File text){
        ArrayList<String> names = new ArrayList<String>( );
        try {
            Scanner file = new Scanner(text);
            //make a loop to read the names
            // don't hardcode 7 but until the end of the file
            while(file.hasNextLine()){
                //store the names in an array so it can be printed for later use
                names.add(file.nextLine());
                //sort the names in alphabetical order by last name
                Collections.sort(names);
            }
            file.close();
            //make a new file called "exercise41_output.txt"
            File newText = new File("src\\main\\exercise41_ouput.txt");

            try{
                //FileWriter newText = new FileWriter("exercise41_output.txt");
                PrintWriter writer = new PrintWriter(newText);
                writer.println("Total of "+names.size()+" names");
                writer.println("-----------------");
                for(int i=0;i < names.size();i++){
                    writer.println(names.get(i));
                }
                writer.close();
                return "New file has been made and names have been sorted.";
                /*if(newText.createNewFile()){
                    System.out.println("File has been made.");
                }*/
            } catch(IOException e){
                System.out.println("I broke, my bad.");
            }
            //print the names into the new file using a loop

        } catch (FileNotFoundException e){

            return "File was not found.";
        }
        return "I broke, my bad.";
    }
}
