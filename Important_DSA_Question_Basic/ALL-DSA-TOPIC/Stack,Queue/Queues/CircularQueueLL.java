public class CircularQueueLL {
    static class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }

    public static class QueueLL {
        Node head = null;
        Node tail = null;
        int size = 0;

        public void add(int x) {
            Node temp = new Node(x);
            if (size == 0) {
                head = tail = temp;
                tail.next = head; // Circular Link
            } else {
                tail.next = temp;
                tail = temp;
                tail.next = head; // Circular Link
            }
            size++;
        }

        public int remove() {
            if (size == 0) {
                System.out.println("Queue is empty..");
                return -1;
            }
            int a = head.val;
            if (size == 1) {  // If only one element is present
                head = tail = null;
            } else {
                head = head.next;
                tail.next = head; // Circular Link Update
            }
            size--;
            return a;
        }

        public int peek() {
            if (size == 0) {
                System.out.println("Queue is empty..");
                return -1;
            }
            return head.val;
        }

        public void display() {
            if (size == 0) {
                System.out.println("Queue is empty..");
                return;
            }
            Node temp = head;
            do {
                System.out.print(temp.val + " ");
                temp = temp.next;
            } while (temp != head); // Circular traversal
            System.out.println();
        }

        public boolean isEmpty() {
            return size == 0;
        }
    }

    public static void main(String[] args) {
        QueueLL q = new QueueLL();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display(); // Output: 1 2 3 4 5

        q.remove();
        System.out.println("Size: " + q.size);
        q.display(); // Output: 2 3 4 5

        q.remove();
        q.display(); // Output: 3 4 5
    }
}
