// advantages of stack implimentation using Linklist..
/*
 1. ulimited size..
  disadvantage --> display element of LL.. take 0(n) time complixity.. but in array take 0(1).
 */

public class ImplimentationLL {
    public static class Node{ // user defined data type..
        Node next;
        int val;
        Node(int val){
            this.val=val;
        }
    }

    public static class  LLstack{ // user defined data structure..
     Node head=null;
     private int size=0;
     
     void push(int x){
        Node temp=new Node(x);
        temp.next=head;
        head=temp;
        size++;
     }

     int pop(){
        if(head==null){
            System.out.print("Stack is empty"); 
            return -1;
        }
        int x=head.val;
        head =head.next;
        size--;
        return x;
     }

     int peek(){
        if(head==null){
            System.out.println("Stack is empty");
            return -1;
        }
        return head.val;
     }

     void displayRec(Node h){
        if(h==null) return;
        displayRec(h.next);
        System.out.print(h.val+" ");
     }
     void display(){
        displayRec(head);
     }

     void displayRev(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
     }

     int size(){
        return size;
     }

     boolean isEmpty(){
        if (size==0) {
            return true;
        }
        return false;
     }




    }
    public static void main(String[] args) {

    LLstack st=new LLstack();
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
    // st.pop();
    System.out.println(st.size);

    st.display();
        
    }
    
}
