package ex46;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static ArrayList<String[]> words = new ArrayList<String[]>( );

    public static void main(String[] args) {
        //open and read the file
        //scan each word and add it to a counter for that word
        //sort the counters by frequency
        //print the results
        File text = new File("input\\exercise46_input.txt");
        System.out.println(WordCounter.readFile(text));
        System.out.println("-------------------------------------------");


    }

    public static String wordCount(String paragraph){



        return "";
    }

}
