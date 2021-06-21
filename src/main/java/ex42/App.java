package ex42;

import java.io.*;
import java.util.Scanner;

public class App {
    //This will be my main attempt although it was my second one
    //Open the txt file
    //Make a csv file to easier separate each value
    //Copy the info from the txt to the csv
    //Print out the values and add more tabs depending on how long the names are
    static File text = new File("src/main/exercise42_input.txt");
    public static void main(String[] args) {
        System.out.println(Output(text));
    }
    public static String Output(File text){
        try{
            //make a csv file
            FileWriter newText = new FileWriter("input\\exercise42_input.csv");
            PrintWriter writer = new PrintWriter(newText);
            Scanner file = new Scanner(text);
            while(file.hasNextLine()){
                writer.println(file.nextLine());
            }
            writer.close();
            //open and read the csv file
            FileReader newText2 = new FileReader("input\\exercise42_input.csv");
            BufferedReader br = new BufferedReader(newText2);
            String line = "";
            System.out.println("Last\t\tFirst\t\tSalary\n-------------------------------");
            while((line = br.readLine()) != null){
                //read and print out each value separated by commas
                String[] values = line.split(",");
                System.out.print(values[0]);
                System.out.print("\t");
                if(values[0].length() < 8){
                    System.out.print("\t");
                }
                System.out.print(values[1]);
                System.out.print("\t");
                if(values[1].length() < 4){
                    System.out.print("\t");
                }
                if(values[1].length() < 8){
                    System.out.print("\t");
                }
                System.out.println(values[2]);
            }

            //System.out.println("File has been made.");
        } catch(FileNotFoundException e){
            return "File can't be opened.";
        } catch(IOException r){
            return "File can't be opened.";
        }
        return "";
    }
}
