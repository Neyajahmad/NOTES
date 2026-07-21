/*
LinkedList<Integer> list = new LinkedList<>();

common opration

list.add(10);
list.addFirst(5);
list.addLast(20);
list.removeFirst();
list.removeLast();
list.contains(20);

*/

public class Practice {


    public static class Node{
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

        //last
         public void InsertEnd(int val){
            Node temp=new Node(val);
             if(head==null){
                head=temp;
                tail=temp;
                size++;
             }
             else{
                tail.next=temp;
                tail=temp;
                size++;
             }
         }

         // first

         public void Firstinst(int val){
            Node temp=new Node(val);
            if(head==null){
                head=temp;
                tail=temp;
                size++;
            }
            else{
                temp.next=head;
                head=temp;
                size++;
            }
         }

         public void InsertIndex(int val, int indx){
            Node i=new Node(val);
            Node temp=head;

            if(head==null || indx == 0){
                Firstinst(val);
            }
            else if(size==indx){
                InsertEnd(val);
            }

            else if(indx<0 || indx>size){
                System.out.println("Wrong input");
            }
            else{
                for(int a=1;a<indx;a++){
                    temp=temp.next;
                }
                i.next=temp.next;
                temp.next=i;

                size++;
            }
         }

         public void get(int indx){
            Node temp=head;
            if(indx<0 || indx>size){
                System.out.println("Wrong input");
            }
            else if(indx==0){
                System.out.println(temp.data);
            }
            else{
                for(int i=0;i<indx;i++){
                    temp=temp.next;
                }
                System.out.println(temp.data);
            }
         }

         public void del(int indx){
            if(indx==0){
                head=head.next;
                return;
            }

            Node temp=head;
            for(int i=0;i<indx-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            if(indx==size-1){
                tail=temp;
            }
            size--;
         }

         public void display(){
        // print linklist
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
         }
     }

    public static void main(String[] args) {
        // Node a=new Node(5);
        // Node b=new Node(6);
        // a.next=b;
       

        linkedlist li=new linkedlist();
        li.Firstinst(1);
        li.Firstinst(2);
        li.InsertIndex(10,1);

        li.display();
        // System.out.println(li.size);
        System.out.println();
        li.get(0);
        System.out.println();
        li.del(2);
        li.display();

    }
    
}
