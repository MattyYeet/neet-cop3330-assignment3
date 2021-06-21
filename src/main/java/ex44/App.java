package ex44;

import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.Scanner;

public class App {
    public static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws IOException, ParseException {
        //open and read the json file
        //ask what they want to find
        //loop until it matches with something in the json file
        //use an array of some sort to match the input with something in the file
        //read out the information associated with the name
        //end the file
        String name = "";
        do{
            System.out.print("What is the product name?");
            name = input.nextLine();
        }while(WebsiteMaker.make(name).equals("false"));

    }
}
