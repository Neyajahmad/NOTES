// interface queue :--> 

import java.util.*;

public class Queue {

    static void PriorityqueueExample(){
        // PriorityQueue<Integer> pq=new PriorityQueue<>(); // min pq
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder()); // max pq
        pq.add(10);
        pq.add(5);
        pq.add(7);
        System.out.println(pq.peek()); // 5 - the smallest elt has the highest priority queue.
        System.out.println(pq); // Gurantee - topmost priority elt will be processed first..
        System.out.println(pq.poll()); //5
        System.out.println(pq); //7
    }

    static void DequeExamples(){
        Deque<Integer> dq= new ArrayDeque<>();
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addLast(3);
        dq.addLast(4);
        System.out.println(dq); //2 1 3 4
        System.out.println(dq.pollFirst()); //2
        System.out.println(dq.pollLast()); //4
        System.out.println(dq); // 1 3
    }

    static void  QueueExamples(){
        LinkedList<Integer> q=new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        System.out.println(q.peek()); // 1
        System.out.println(q.poll()); // 1 -->will also remove
        System.out.println(q.peek()); // 2
        System.out.println(q.isEmpty()); // false
        System.out.println(q.size()); //2
        System.out.println(q);
      
    }
    public static void main(String[] args) {
        // QueueExamples();
        // PriorityqueueExample();
        DequeExamples();
    }
    
}
