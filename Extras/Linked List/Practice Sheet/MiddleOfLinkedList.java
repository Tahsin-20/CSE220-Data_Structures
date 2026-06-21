public class MiddleOfLinkedList {

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

    public MiddleOfLinkedList() {
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
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("None");
    }

    // ---------------- METHOD YOU WILL COMPLETE ----------------
    public int getMiddle() {
        Node tortoise=head;
        Node hare=head;

        while(hare!=null && hare.next!=null){
            tortoise=tortoise.next;
            hare=hare.next.next;
        }
        return tortoise.data;
    }

    // ---------------- Example Main (Optional) ----------------
    public static void main(String[] args) {
        MiddleOfLinkedList list = new MiddleOfLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.insert(60);


        list.display();

        // You will implement this:
        System.out.println(list.getMiddle());
    }
}

