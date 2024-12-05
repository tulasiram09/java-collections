
import java.util.HashMap;
import java.util.Set;

public class MyhashMap {
    public static void main(String[] args) {
        // Syntax : HashMap <Key,Value> VariableName = new HashMap<>();
        HashMap <Integer,String> h1 = new HashMap<>();
        System.out.println(h1);
        h1.put(1,"One");
        h1.put(2,"Two");
        h1.put(3,"Three");
        h1.put(4,"Four");
        System.out.println(h1);
        h1.put(05,"Five"); // appends to the hashMap with key value pair
        System.out.println(h1);
        String Number1 = h1.get(2); // get the value associated with key 2
        System.out.println(Number1);
        System.out.println(h1.get(67)); 
        System.out.println(h1.containsKey(5)); // Returns True of False checking the map if key is present or not
        System.out.println(h1.containsKey(89));
        Set <Integer> keys = h1.keySet();
        System.out.println(keys);
        h1.remove(2); // removes a key:value pair from the map
        System.out.println(h1);
    }
}
