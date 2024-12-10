import java.util.*;
public class GC {
    public static void main(String[] args) {
        Map <Character,Integer> m1 = new HashMap<>();
        m1.put('A',1);
        System.out.println(m1);
        m1.remove('A');
        System.out.println(m1);
        m1 = null;
        System.gc(); // used to provoking JVM to clear the object created by m1 reference
        System.out.println(m1);
    }
}
