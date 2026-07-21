// Insert element into the stack...

import java.util.*;
public class Insertindex {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        Stack<Integer> temp=new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println(st);

        int idx=2;
        int value=100;

        while (st.size()>idx) {
            temp.push(st.pop());
        }

        st.push(value);

        while (temp.size()>0) {
            st.push(temp.pop());
        }

        System.out.println(st);
    }
}
