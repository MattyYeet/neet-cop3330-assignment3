package ex44;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Formatter;

public class WebsiteMaker {
    public static final JSONParser reader = new JSONParser();
    public static String actualName = "";
        public static String make(String name) throws IOException, ParseException {
            JSONObject file = (JSONObject) reader.parse(new FileReader("input/exercise44_input.json"));
            JSONArray list = (JSONArray) file.get("products");



            for (Object subject : list){
                JSONObject json = (JSONObject) subject;
                actualName = (String) json.get("name");

                //System.out.println(name);
                if(name.equalsIgnoreCase(actualName)){
                    double price = (double) json.get("price");
                    Formatter fmt = new Formatter();
                    fmt.format("%.2f", price);
                    System.out.println("Name: " + json.get("name"));
                    System.out.println("Price: " + fmt);
                    System.out.println("Quantity: " + json.get("quantity"));
                    return "true";
                }

            }
            if(!name.equalsIgnoreCase(actualName)){
                System.out.println("Sorry, that product was not found.");
            }
            return "false";
        }
}
