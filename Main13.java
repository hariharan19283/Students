import java.util.*;
 
public class Main13 {
   
    public static void main(String[] args)
    {
        List<String> names = new LinkedList<>();
        names.add("student");
        names.add("name");
        names.add("location");
         ListIterator<String> listIterator
            = names.listIterator();
         System.out.println("Forward Direction Iteration:");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        System.out.println("Backward Direction Iteration:");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}