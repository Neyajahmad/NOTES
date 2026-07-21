public class Doublyll {

    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static class linkedlist {

        Node head = null;
        Node tail = null;
        int size = 0;

        // Insert at end
        void insertAtEnd(int val) {
            Node temp = new Node(val);

            if (head == null) {
                head = tail = temp;
            } else {
                tail.next = temp;
                temp.prev = tail;
                tail = temp;
            }
            size++;
        }

        // Insert at head
        void insertAtHead(int val) {
            if (head == null) {
                insertAtEnd(val);
                return;
            }

            Node temp = new Node(val);
            temp.next = head;
            head.prev = temp;
            head = temp;

            size++;
        }

        // Insert at a given index
        void insertAt(int val, int idx) {
            if (idx < 0 || idx > size) {
                System.out.println("Wrong input");
                return;
            }

            if (idx == 0) {
                insertAtHead(val);
                return;
            }

            if (idx == size) {
                insertAtEnd(val);
                return;
            }

            Node temp = head;
            for (int i = 1; i < idx; i++) {
                temp = temp.next;
            }

            Node newNode = new Node(val);

            newNode.next = temp.next;
            newNode.prev = temp;

            temp.next.prev = newNode;
            temp.next = newNode;

            size++;
        }

        // Get value at index
        int getAt(int idx) {
            if (idx < 0 || idx >= size) {
                throw new IndexOutOfBoundsException("Wrong input");
            }

            Node temp = head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        // Delete at index
        void delete(int idx) {
            if (idx < 0 || idx >= size) {
                System.out.println("Wrong input");
                return;
            }

            // Delete head
            if (idx == 0) {
                head = head.next;
                if (head != null) head.prev = null;
                else tail = null;
                size--;
                return;
            }

            Node temp = head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }

            // Delete tail
            if (temp == tail) {
                tail = tail.prev;
                tail.next = null;
            } else {
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
            }

            size--;
        }

        // Display list forward
        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        // Display list backward
        void displayReverse() {
            Node temp = tail;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.prev;
            }
        }

        int size() {
            return size;
        }
    }

    public static void main(String[] args) {
        linkedlist dll = new linkedlist();

        dll.insertAtHead(10);
        dll.insertAtEnd(20);
        dll.insertAtEnd(30);
        dll.insertAt(40, 0);
        dll.insertAt(90, 1);

        dll.delete(0);

        dll.display();  
        System.out.println();

        System.out.println("Reverse: ");
        dll.displayReverse();
    }
}
