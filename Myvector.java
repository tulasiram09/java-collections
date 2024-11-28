import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Myvector {
    public static void main(String args[]){
        Vector <Integer> v1 = new Vector<>(5);
        System.out.println(v1);
        // the capacity of vector is always intialized with 10.
        System.out.println(v1.capacity());
        v1.add(1);
        v1.add(2);
        v1.add(3);
        v1.add(4);
        v1.add(5);
        v1.add(6);
        //
        System.out.println(v1);
        // the vector doubles it's capacity
        System.out.println(v1.capacity());
        // vector using linkedlist
        LinkedList <Integer> l1 = new LinkedList();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        System.out.println(l1);
        // Any collection can be given to vector in the place of l1
        Vector <Integer> v2 = new Vector(l1);
        System.out.println(v2);
        System.out.println(v2.size());
    }
}
