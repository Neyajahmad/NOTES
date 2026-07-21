// collect interface -->subinterface: List interface : --> Arraylist , linkedlist , stack...(classes).
import java.util.*;
public class List{
    static void ArraylistExamples(){
        // ArrayList<Integer> l =new ArrayList<>();
        LinkedList<Integer> l=new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);

        System.out.println(l); // 1 2 3
        System.out.println(l.get(1)); // 1-based indexing =>2.
        l.set(1, 10); //modify at index 1
        System.out.println(l);
        System.out.println(l.contains(10)); // true..

    }

    static void StackExamples(){
        Stack<String> st=new Stack<>();
        st.push("Neyaj");
        st.push("Ahmad");
        System.out.println(st.peek()); // Ahmad
        System.out.println(st.pop()); // Ahmad (will also remove it).
        System.out.println(st.peek()); // Neyaj
        System.out.println(st.size()); // 1
        System.out.println(st.empty()); // false

    }
    public static void main(String[] args) {
        // ArraylistExamples();
        StackExamples();
    }
}