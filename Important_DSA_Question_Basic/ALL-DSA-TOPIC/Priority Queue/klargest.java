//Kth largest element.
import java.util.*;
public class klargest {
    public static void main(String[] args) {
     
        // // brute force approach.
        List<Integer> a=new ArrayList<>();
        int k=3;
        a.add(3);
        a.add(1);
        a.add(2);
        a.add(9);
        a.add(5);
        // List<Integer> b=new ArrayList<>(a); //0(n)
        // b.sort(Comparator.reverseOrder()); //N(LogN)
        // System.out.println(b.get(k-1)); // o(1)


        //Better approach..  // time :-- O(nlogn) ; space :- o(k)
    //     PriorityQueue<Integer> pq=new PriorityQueue<>();

    //     for(int i=0;i<a.size();i++){
    //         if(pq.size()==k){
    //             if(pq.peek()<a.get(i)){
    //             pq.remove();
    //             pq.add(a.get(i));
    //             continue;
    //         }
    //     }
    //         pq.add(a.get(i));
    // }
    // System.out.println(pq.peek());



    //for kth smallest element
    PriorityQueue<Integer> arr=new PriorityQueue<>(Comparator.reverseOrder());

    for(int i=0;i<a.size();i++){
        if(arr.size()==k){
            if(arr.peek()>a.get(i)){
                arr.remove();
                arr.add(a.get(i));
            }
            continue;
        }
        arr.add(a.get(i));
    }

    System.out.println(arr.peek());
}
}
