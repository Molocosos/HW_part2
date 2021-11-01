import java.util.*;

public class HW4 {

    public static void main(String[] args){
        HashMap<String, Integer> hashMap = new HashMap<>();
               String[] strings = {"Mercedes", "BMW", "Audi", "Toyota", "Vokswagen",
                "Opel", "Subaru", "Range Rover", "Toyota", "Vokswagen",
                "BMW", "Audi", "Toyota", "Subaru", "Subaru",
                "Audi", "Toyota", "Subaru", "Subaru", "Toyota"};

               for (String  s: strings){
                   if(hashMap.get(s) == null) {
                       hashMap.put(s, 1);
                   }
                   else {
                       hashMap.put(s, hashMap.get(s)+1);
                   }
               }

        System.out.println(hashMap);


    }
}
