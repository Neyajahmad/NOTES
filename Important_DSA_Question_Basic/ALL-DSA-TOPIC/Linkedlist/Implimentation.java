

public class Implimentation {

    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static class linkedlist{
        Node head=null;
        Node tail=null;
        int size=0;

        void insertAtEnd(int val){
            
            Node temp=new Node(val);
            if(head==null){
                head=temp;
                tail=temp;
            }
            else{
                tail.next=temp;
                tail=temp;
            }
            size++;
            
        }

        void insertAtHead(int val){
           
            Node temp=new Node(val);
            if(head==null){
                // head=tail=temp;
                insertAtEnd(val);
                return;
            }
            else{
                temp.next=head;
                head=temp;
            }
            size++;
           
        }

        void insertAt(int val,int idx){
            Node t=new Node(val);
            Node temp=head;
            if (idx==0) {
                insertAtHead(val);
                return;
            }
            else if(idx==size()){
                insertAtEnd(val);
                return;
            }

            else if(idx<0 || idx>size()){
                System.out.println("Wrong input provided");
            }

            else{
                for(int i=1;i<idx;i++){
                    temp=temp.next;
                }
                t.next=temp.next;
                temp.next=t;
            }
            size++;
        }

        int getAt(int idx){ // 2->3->4->6
            Node temp=head;
            if(idx<0 || idx>size()){
                System.out.println("Wrong input provided");
            }
            for(int i=0;i<idx;i++){
                temp=temp.next;
            }
            return temp.data;
        }

        void delete(int idx){
            Node temp=head;
            if(idx==0)
            {
                head=head.next;
                size--;
                return;
            } 
           
            for(int i=0;i<idx-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            if(idx==size-1) tail=temp;
            size--;
        }

        void display(){
            Node temp=head;
            while (temp!=null) {
                System.out.print(temp.data+" ");
                temp=temp.next;  
            }
        }

        int size(){
            // int count=0;
            // Node temp=head;
            // while (temp!=null) {
            //     count++;
            //     temp=temp.next;
            // }
            // return count;
            return size;
        }


    }
    public static void main(String[] args) {
        linkedlist ll =new linkedlist();
        // ll.insertAtEnd(1);
        // ll.insertAtEnd(2);
        // ll.insertAtEnd(3);
        // ll.insertAtEnd(4);
        // ll.insertAtEnd(5);

        ll.insertAtHead(10);
        ll.insertAtEnd(20);
        ll.insertAtEnd(30);
        ll.insertAt(40,0);
        ll.insertAt(90,1);
        // ll.insertAtHead(20);
        // ll.insertAtHead(30);
        ll.delete(0);
        // System.out.println(ll.tail.data);
        ll.display();
        System.out.println();
        // System.out.println(ll.getAt(2));
        // System.out.println(ll.size);
        
    }
    
}
