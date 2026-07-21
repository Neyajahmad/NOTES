public class First{

    public static class Node {
        int data; // value.
        Node next; // address of next node.    

        Node(int data){
            this.data=data;
        }
    } 

    public static void insertEnd(Node head,int data){
        Node temp=new Node(data);
        Node t=head;
        while(t.next!=null){
            t=t.next;
        }
        t.next=temp;
    }


    public static int countLength(Node temp){
        int count=0;
        while (temp!=null) {
            count++;
            temp=temp.next;
        }
        return count;
    }


    public static void printLinkedlistR(Node head){
        if(head==null) return;
        System.out.print(head.data+" ");
        printLinkedlistR(head.next);
    }

    public static void printLinkedlist(Node head){
        // for(int i=0;i<5;i++){
        //     System.out.print(temp.data+"->");
        //     temp=temp.next;
        // }
        Node temp=head;
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
   
    public static void main(String[] args) {

        // 5 -> 6 -> 7 -> 8 ->9.

        Node a=new Node(5);
        // a.data=5;
        Node b=new Node(6);
        Node c=new Node(7);
        Node d=new Node(8);
        Node e=new Node(9);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        // System.out.println(a.data);
        // System.out.println(a.next.data);
        // System.out.println(a.next.next.data);

        //printing linkedlist using loop..
       
        // printLinkedlist(a);
        // System.out.println();
        // printLinkedlistR(a);
        // System.out.println();
        // // length of the linklist
        // System.out.println(countLength(a));

        insertEnd(a, 80);
        printLinkedlist(a);

    }
}