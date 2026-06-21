public class RearrangeOddEvenDLL {

    // ============================
    // Doubly Linked List Node
    // ============================
    class Node {
        int elem;
        Node next;
        Node prev;

        public Node(int elem) {
            this.elem = elem;
            this.next = null;
            this.prev = null;
        }
    }

    // ==================================
    // Custom Doubly Linked List Class
    // ==================================
    class DoublyList {
        Node head;
        Node tail;

        public DoublyList() {
            head = null;
            tail = null;
        }

        // Insert at end (helpful for building list)
        public void insertLast(int elem) {
            Node newNode = new Node(elem);
            if (head == null) {
                head = newNode;
                tail = newNode;
                return;
            }
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        // Print forward (optional for testing)
        public void printList() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.elem);
                if (temp.next != null) System.out.print(" ⇄ ");
                temp = temp.next;
            }
            System.out.println();
        }

        // ================================
        // METHOD YOU WILL COMPLETE
        // ================================
        public void rearrangeOddEven() {
            // YOU WILL COMPLETE THIS PART
        }
    }

    // ============================
    // MAIN for Testing
    // ============================
    public static void main(String[] args) {
        RearrangeOddEvenDLL obj = new RearrangeOddEvenDLL();

        DoublyList dl = obj.new DoublyList();

        dl.insertLast(5);
        dl.insertLast(2);
        dl.insertLast(8);
        dl.insertLast(1);
        dl.insertLast(4);
        dl.insertLast(7);

        System.out.println("Before rearranging:");
        dl.printList();

        dl.rearrangeOddEven();

        System.out.println("After rearranging:");
        dl.printList();
    }
}