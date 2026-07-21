import java.util.*;
public class First{
    public static void main(String[] args) {
        HashSet<String> st=new HashSet<>();
        st.add("james");
        st.add("Scott");
        st.add("james");
        System.out.println(st); // james , Scott.
        System.out.println(st.contains("james")); // true
        System.out.println(st.size()); //2
        st.remove("james");
        System.out.println(st.contains("james")); // false
        System.out.println(st.size()); //1
        System.out.println("Mark");
        for(String s : st){
            System.out.println(s); // Mark,scott
        }
    }
}