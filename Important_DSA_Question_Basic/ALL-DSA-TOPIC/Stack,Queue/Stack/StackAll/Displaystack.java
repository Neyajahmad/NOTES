// display element from the stack...


import java.util.Stack;

public class Displaystack {
    // by using recurssion

    public static void displayRev(Stack<Integer> st){
        if(st.isEmpty()) return;
        int top=st.pop();
        System.out.print(top+" ");
        displayRev(st);
        st.push(top);
    }

    public static void display(Stack<Integer> st){
        if(st.size()==0) return;
        int top=st.pop();
        display(st);
        System.out.print(top+" ");
        st.push(top);
    }



    public static void main(String[] args) {
        //By using 2 stack
        // Stack<Integer> st=new Stack<>();
        // Stack<Integer> rt=new Stack<>();
        // st.push(1);
        // st.push(2);
        // st.push(3);
        // st.push(4);
        // st.push(5);

        // while (st.size()>0) {
        //     rt.push(st.pop());
        // }

        // while (rt.size()>0) {
        //     int x=rt.pop();
        //     System.out.print(x+" ");
        //     st.push(x);
        // }



        // By using array...

        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);


        // By using array...

        // int n=st.size();
        // int arr[]=new int[n];

        // for(int i=n-1;i>=0;i--){
        //     arr[i]=st.pop();
        // }

        // for(int i=0;i<n;i++){
        //     System.out.print(arr[i]+" ");
        //     st.push(arr[i]);
        // }


        // By using recursion...

        displayRev(st);
        System.out.println();
        display(st);




    } 
}
