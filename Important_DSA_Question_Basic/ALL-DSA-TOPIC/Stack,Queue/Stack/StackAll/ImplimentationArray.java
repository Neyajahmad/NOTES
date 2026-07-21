// Stack implimentation using Array..

// advantages of stack implimentation using array..
/*
 1.size -> for every element space taken is one block. but in linkedlist there are 2 block.
 */
public class ImplimentationArray {

    public static class Stack
    {
        private int arr[]=new int[100];
        private int idx=0;

        void push(int x){
            if(isFull()){
                System.out.println("Stack is full!");
                return;
            }
            arr[idx]=x;
            idx++;
        }

        void pop(){
            if(idx==0) {
                System.out.println("Stack is empty.");
            }
            else{
                arr[idx-1]=0;
                idx--;
            }
        }

        int peek(){
            if(idx==0){
                System.out.println("Stack is empty.");
                return -1;  
            }
            return arr[idx-1];
        }

        int size(){
            return idx;
        }

        void display(){
            for(int i=0;i<idx;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

        boolean isEmpty(){
            if(idx==0) return true;
            else return false;
        }

        boolean isFull(){
            if(idx==arr.length) return true;
            else return false;
        }
    }
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(1);
        st.push(2);
        // st.display();
        st.push(3);
        st.push(4);
       System.out.println(st.peek());
        
        st.display();

    }  
}
