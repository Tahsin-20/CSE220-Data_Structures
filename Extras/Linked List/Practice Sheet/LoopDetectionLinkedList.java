public class LoopDetectionLinkedList {

    // ---------------- Node Class ----------------
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // ---------------- Linked List Fields ----------------
    Node head;

    public LoopDetectionLinkedList() {
        head = null;
    }

    // ---------------- Insert at End ----------------
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // ---------------- Check if Empty ----------------
    public boolean isEmpty() {
        return head == null;
    }

    // ---------------- Display the List ----------------
    // (NOTE: Do NOT call display() if a loop exists!)
    public void display() {
        Node temp = head;
        int counter = 0;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;

            // safety break to avoid infinite loop
            if (counter++ > 50) {
                System.out.println("... Loop detected (display stopped)");
                return;
            }
        }
        System.out.println("None");
    }

    // ---------------- METHOD YOU WILL COMPLETE ----------------
    public boolean hasLoop() {
        Node tortoise=head;
        Node hare=head;

        while(hare!=null && hare.next!=null){
            tortoise=tortoise.next;
            hare=hare.next.next;

            if(hare==tortoise){
                return true;
            }
        }
        return false;
    }

    // ---------------- Example Main (Optional) ----------------
    public static void main(String[] args) {
        LoopDetectionLinkedList list = new LoopDetectionLinkedList();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        // Creating a loop manually for testing:
        // 5 -> 2
        // (You can comment this out if not needed)
        list.head.next.next.next.next.next = list.head.next;

        // display() will stop early if loop is detected
        //list.display();

        // You will implement this
        System.out.println(list.hasLoop());
    }
}