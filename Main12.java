import java.util.*;
 
public class Main12 {
    public static void main(String[] args)
        throws IllegalStateException
    {
 
        Queue<Integer> Q
            = new LinkedList<Integer>();
        Q.add(7855642);
        Q.add(35658786);
        Q.add(5278367);
        Q.add(74381793);
        System.out.println("Queue: " + Q);
        System.out.println("Queue's head: " + Q.remove());
        System.out.println("Queue's head: " + Q.remove());
    }
}