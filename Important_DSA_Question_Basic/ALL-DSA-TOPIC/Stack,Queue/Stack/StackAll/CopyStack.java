//copy contents of one stack to another in same order..
import java.util.Stack;
import java.util.Scanner;
public class CopyStack {
    public static void main(String[] args) {

        // Take stack element input from the user..

        // Scanner sc=new Scanner(System.in);
        // Stack<Integer> st=new Stack<>();
        // System.out.println("Enter the number of elements: ");
        // int n=sc.nextInt();
        // System.out.println("Enter the number of elements: ");
        // for(int i=0;i<5;i++){
        //     int x=sc.nextInt();
        //     st.push(x);
        // }

        // System.out.println(st);


        // Reverse the stack..

        // Stack<Integer> st=new Stack<>();
        // Stack<Integer> rt=new Stack<>();
        // st.push(1);
        // st.push(2);
        // st.push(3);
        // st.push(4);
        // st.push(5);
        // System.out.println(st);

        // while(st.size()>0){
        //     // int x=st.peek();
        //     // rt.push(x);
        //     // st.pop();

        //     rt.push(st.pop());
        // }
        // System.out.println(rt);


        // copy one stack element to another element..

        Stack<Integer> st=new Stack<>();
        Stack<Integer> gt=new Stack<>();
        Stack<Integer> rt=new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);

        while (st.size()>0) {
            gt.push(st.pop());
        }

        System.out.println(st);

        System.out.println(gt);

        while(gt.size()>0){
            rt.push(gt.pop());
        }

        System.out.println(rt);
    }
    
}
