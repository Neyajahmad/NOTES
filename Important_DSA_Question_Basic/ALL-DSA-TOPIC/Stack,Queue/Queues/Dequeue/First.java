package Dequeue;

import java.util.Deque;
import java.util.LinkedList;

public class First {
    public static void main(String[] args) {
        Deque<Integer> temp=new LinkedList<>();
        temp.addFirst(1);
        temp.addFirst(2);
        temp.addFirst(3);
        temp.addFirst(4);
        temp.addFirst(5);
        temp.addLast(100);
        System.out.println(temp);
        temp.removeLast();
        System.out.println(temp);
        System.out.println(temp.getFirst());
        temp.remove(); // first remove... // like a normal queue..
        temp.add(5); // last add...
    }
    
}
