import java.util.*;
public class reverseStack {

    public static void Reverse(Stack<Integer> st){
        if(st.size()==1) return;
        int x=st.pop();
        Reverse(st);
        pushAtBottom(x,st);
    }

    public static void pushAtBottom(int x,Stack<Integer> st){
        Stack<Integer> temp=new Stack<>();
        while (!st.isEmpty()) {
            temp.push(st.pop());
        }
        st.push(x);
        while (!temp.isEmpty()) {
            st.push(temp.pop());
        }


        //using recursion...
        // if(st.size()==0){
        //     st.push(x);
        //     return;
        // }
        // int top=st.pop();
        // pushAtBottom(x, st);
        // st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(st);

        // Stack<Integer> rt=new Stack<>();
        // while (st.size()>0) {
        //     rt.push(st.pop());
        // }

        // Stack<Integer> temp=new Stack<>();
        // while (rt.size()>0) {
        //     temp.push(rt.pop());
        // }

        // while (temp.size()>0) {
        //     st.push(temp.pop());
        // }

        System.out.println("Reverse order: ");
        System.out.println();
        Reverse(st);
        System.out.println(st);

    }
    
}
