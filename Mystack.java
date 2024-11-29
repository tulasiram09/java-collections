import java.util.*;

public class Mystack {
    public static void main(String args[]){
        Stack <Integer> s1 = new Stack<>();
        System.out.println(s1);
        s1.push(0);
        System.out.println(s1);
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        System.out.println(s1);
        s1.pop();
        s1.pop();
        System.out.println(s1);
        System.out.println(s1.isEmpty());
        System.out.println(s1.peek());
        System.out.println(s1.size());
    }
}
