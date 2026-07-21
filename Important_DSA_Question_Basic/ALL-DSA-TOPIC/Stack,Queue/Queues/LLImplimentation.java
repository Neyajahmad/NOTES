public class LLImplimentation {
   static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }

    public static class QueueLL{
        Node head=null;
        Node tail=null;
        int size=0;

      public  void add(int x){
            Node temp=new Node(x);
            if(size==0){
                head=tail=temp;
            }
            else{
                tail.next=temp;
                tail=temp;
            }
            size++;
        }

        public int remove(){
            if(size==0){
                System.out.println("Queue is empty..");
                return -1;
            }
                int a=head.val;
                head=head.next;
                size--;
                return a;
        }

        public int peek(){
            if(size==0){
                System.out.println("Queue is empty..");
                return -1;
            }
            return head.val;
        }

        public void display(){
            if(size==0) System.out.println("Queue is empty..");
            Node temp=head;
            while (temp!=null) {
                System.out.print(temp.val+" ");
                temp=temp.next;  
            }
            System.out.println();
        }

        public boolean isEmpty(){
            if(size==0){
                return true;
            }
            return false;
        }
    }

   
    public static void main(String[] args) {
        QueueLL a=new QueueLL();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.display();
        a.remove();
        System.out.println(a.size);
        a.display();
    } 
}
