public class NthFromEndLinkedList {

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

    public NthFromEndLinkedList() {
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
    public int getNthFromEnd(int n) {
        Node slowptr=head;
        Node fastptr=head;
        int count=1;
        while(count<n){
            fastptr=fastptr.next;
            count++;
        }
        while(fastptr.next!=null){
            fastptr=fastptr.next;
            slowptr=slowptr.next;
        }
        return slowptr.data;
    }

    // ---------------- Example Main (Optional) ----------------
    public static void main(String[] args) {
        NthFromEndLinkedList list = new NthFromEndLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        list.display();

        // You will implement this:
        System.out.println(list.getNthFromEnd(5));
    }
}
