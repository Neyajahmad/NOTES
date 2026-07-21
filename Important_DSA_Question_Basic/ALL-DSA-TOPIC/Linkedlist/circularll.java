public class circularll {
    
    // Custom Node class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    class CircularLinkedList {

        Node head = null;
        Node tail = null;

        // Insert at end
        void insertEnd(int val) {
            Node newNode = new Node(val);

            if (head == null) {
                head = newNode;
                tail = newNode;
                tail.next = head;  // circular link
            } else {
                tail.next = newNode;
                tail = newNode;
                tail.next = head;   // maintain circular link
            }
        }

        // Insert at start
        void insertStart(int val) {
            Node newNode = new Node(val);

            if (head == null) {
                head = tail = newNode;
                tail.next = head;
            } else {
                newNode.next = head;
                head = newNode;
                tail.next = head;  // maintain circular link
            }
        }

        // Delete first node
        void deleteStart() {
            if (head == null) return;

            if (head == tail) { // only one node
                head = tail = null;
            } else {
                head = head.next;
                tail.next = head;  // keep circular link intact
            }
        }

        // Display list
        void display() {
            if (head == null) {
                System.out.println("List is empty");
                return;
            }

            Node temp = head;
            do {
                System.out.print(temp.data + " → ");
                temp = temp.next;
            } while (temp != head);

            System.out.println("(back to head)");
        }
    }

    // MAIN METHOD
    public static void main(String[] args) {

        circularll outer = new circularll();
        CircularLinkedList cll = outer.new CircularLinkedList();

        cll.insertEnd(10);
        cll.insertEnd(20);
        cll.insertEnd(30);
        cll.insertStart(5);

        cll.display(); 
        cll.deleteStart();
        cll.display();
    }
}
