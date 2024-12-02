
import java.util.HashMap;

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
    }
}
