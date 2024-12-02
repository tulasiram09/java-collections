
import java.util.ArrayList;

public class copyonwrite {
    public static void main(String[] args) {
       // List <String> shoppingList = new CopyOnWriteArrayList();
       // System.out.println(shoppingList);

       ArrayList <Integer> l1 = new ArrayList<>();
       l1.add(90);
       l1.add(78);
       l1.add(100);
       l1.add(343);
       l1.add(45);
       l1.add(9);
       System.out.println("Array List   "+l1);
       System.out.println("Sorting using lambda functions");
       l1.sort((a,b)->a-b); // Ascending Order
       System.out.println(l1);
       l1.sort((a,b)-> b-a);
       System.out.println(l1); // Descending Order
    }
}
