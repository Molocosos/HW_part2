import java.util.ArrayList;
import java.util.HashMap;


public class Phonebook {
    HashMap<String, ArrayList<String>> book = new HashMap<>();



    public void add(String name, String number){
        if (book.get(name) == null){
            ArrayList<String> numbers = new ArrayList<>();
           numbers.add(number);
           book.put(name, numbers);
    }
        else {
            book.get(name).add(number);
        }
    }

    public ArrayList<String> get(String name) {
        return book.get(name);
    }
}
