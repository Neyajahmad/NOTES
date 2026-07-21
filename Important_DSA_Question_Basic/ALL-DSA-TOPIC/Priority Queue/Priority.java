import java.util.*;
public class Priority{


    private static class Student{

        String name;
        Integer rollNo;
        Integer marks;
        String dob;
    }

    //MAKE A COMPARATOR FOR STUDENT CLASS

    private static class  StudentComparator implements Comparator<Student> {
        //overriding

       public int compare (Student s1, Student s2){
            if(s1.marks>s2.marks){
                return 1;
            }

            else if(s1.marks<s2.marks){
                return -1;
            }
            else{
                //    return 0; // agar marks same hoga to random print hoga but ham yai chahate h ki agar marks same ho to fir roll number kai basis mai print ho details. fir niche wala logic iss basis mai likha hua hai.

                if(s1.rollNo>s2.rollNo){
                    return 1;
                }

                else  if(s1.rollNo>s2.rollNo){
                    return -1;
                }
                else{
                    return 0;
                }
              
            }
        }
    }


    public static void main(String[] args) {
        
        // PriorityQueue<Integer> pq=new PriorityQueue<>(); //Min heap
        PriorityQueue<Integer> pq2=new PriorityQueue<>(Comparator.reverseOrder()); //Max heap

        //Insertion..
        // pq.add(10);
        // pq.add(4);
        // pq.add(3);
        // pq.add(1);

         //Insertion..
        pq2.add(10);
        pq2.add(4);
        pq2.add(3);
        pq2.add(1);
        
        // pq.remove(); // remove top element (1)
        // pq.remove(); // remove top element (3)
        // System.out.println(pq.remove()); // remove top element (4) and also print 4
        // System.out.println(pq.peek()); // print 10


        // System.out.println(pq2.peek()); // max heap.




        // CUSTUM PRIORITY QUEUE

        PriorityQueue<Student> studentPriorityQueue =new PriorityQueue<>(new StudentComparator()); //min heap
        Student neyaj=new Student();
        neyaj.name="NEYAJ AHMAD";
        neyaj.rollNo=1;
        neyaj.dob="25-4-2004";
        neyaj.marks=91;

        // 96 jada hai to swap nhi hoga kam marks wala ko top mai rakh diya to ab print neyaj hoga.
        //min heap bydefault hota hai to minimum ko top mai rakh dai gai.
         Student sohaib=new Student();
        sohaib.name="Sohaib Ahmad";
        sohaib.rollNo=12;
        sohaib.dob="25-4-2005";
        sohaib.marks=9;

        studentPriorityQueue.add(neyaj);
        studentPriorityQueue.add(sohaib);

        System.out.println(studentPriorityQueue.peek().name);

    }
}

// time complexity 

// add/Insert :--> O(logN)
// remove / delete :---> O(logN)
// peek :--> O(1)

// benifit of priority queue is we have retrive the min/max in O(1) time

// jab bhe koi aisa condition aye particular time pai minimum or maximum chahiye or wus mai
// kabhe kuch add ho sakata hai kabhe bhe remove ho skata hai or tab bhe wus mai max and min chahiye to tab priority queue lagane ka time aa gaya hai.