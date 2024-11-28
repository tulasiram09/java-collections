import java.util.*;

public class MyList {
    public static void main(String args[]){
        ArrayList a1 = new ArrayList();
        a1.add("hello");
        a1.add("world");
        a1.add(10);
        a1.add(20);
        a1.add(8.29);
        /*System.out.println("iteration using index");
        for(int i=0;i<a1.size();i++){
            System.out.println(a1.get(i));
        }
        for(Void x:a1){
            System.out.println(x);
        }*/
        System.out.println(a1.contains(50));
        System.out.println(a1.contains(10));
        System.out.println(a1);
        a1.add(2,"adding");
        System.out.println(a1);
        System.out.println("setting a value at a index");
        a1.set(3,56);
        System.out.println(a1);
        System.out.println(a1.getClass().getName());
        List <Integer> l1 = List.of(1,2,3,4);
        System.out.println(l1);
        System.out.println(l1.getClass().getName());
        List <Integer> l2 = Arrays.asList(1,2,3,54,5);
        System.out.println(l2);
        System.out.println(l2.getClass().getName());

        // adding two lists
        a1.addAll(l2);
        System.out.println(a1);
        // removing a index
        a1.remove(0);
        System.out.println(a1);
        // removing by value
        a1.remove(Integer.valueOf(1));
        System.out.println(a1);
        // sorting in lists
        //Collections.sort(a1);
        //System.out.println(a1);
        // lambda functions
        // list.sort((a,b)-> a-b);
        // list.sort((a,b)-> b-a);
        
    }
}
