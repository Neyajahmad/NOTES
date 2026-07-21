import java.util.Stack;
public class First{
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        // System.out.println("Size is :"+st.size());
        System.out.println(st.isEmpty());
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st.isEmpty());
        st.push(5);
        st.push(6);
        // System.out.println("Top most element is: "+st.peek());
        // System.out.println("Size :"+st.size());
        // System.out.println(st);

        // print 1st element...
        // while (st.size()>1) {
        //     st.pop();
        // }
        // System.out.println(st.peek()); 


        //  // print 2nd element...
        // while (st.size()>2) {
        //     st.pop();
        // }
        // System.out.println(st.peek()); 
    }

}