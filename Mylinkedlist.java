import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Mylinkedlist {
    public static void main(String[] args) {
        // By default, collections framework provides Java a doubly linked list
        // Creating a DLL using Java framework
        LinkedList <Integer> l1 = new LinkedList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(6);
        System.out.println(l1);
        System.out.println(l1.get(4)); //takes order of n time for searching
        l1.addFirst(90);
        System.out.println(l1);
        l1.addLast(67);
        System.out.println(l1);
        l1.remove(4);
        System.out.println(l1);
        l1.remove(Integer.valueOf(5));
        System.out.println(l1);
        //adding elements in between
        l1.add(4,54);
        System.out.println(l1);
        l1.set(1,23);
        System.out.println(l1);
        //linkedlist using Array.asList
        LinkedList <String> l2 = new LinkedList(Arrays.asList("Cat","Dog","pigeon"));
        System.out.println(l2);

        // linkedlist using LIst.of
        LinkedList <String> l3 = new LinkedList(List.of("hi","hello"));
        System.out.println(l3);
        

    }
}