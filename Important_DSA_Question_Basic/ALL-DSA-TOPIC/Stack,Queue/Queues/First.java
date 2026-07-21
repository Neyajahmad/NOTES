// Queue --> FIFO --> from one side element push and from one side element is remove..

import java.util.LinkedList;
import java.util.Queue;

public class First{
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>(); // by ll implimented queue..
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        // q.remove();
        // q.poll(); // also use for remove element...
        System.out.println(q);
        System.out.println(q.isEmpty());
        System.out.println(q.element()); // get top element..
        System.out.println(q.peek());
        System.out.println(q.size());
    }
}