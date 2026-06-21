public class LinkedListRotate {

    // ---------- Node Class ----------
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // ---------- Head Pointer ----------
    private Node head;

    // ---------- Insert at End ----------
    public void insert(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // ---------- Print the List ----------
    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // ---------- Rotate Method (You will complete this) ----------
    public void rotate(int k) {
        Node fastptr=head;
        Node slowptr=head;
        int count=0;
        while(count<k){
            fastptr=fastptr.next;
            count++;
        }
        while(fastptr.next!=null){
            fastptr=fastptr.next;
            slowptr=slowptr.next;
        }
        Node newHead=slowptr.next;
        fastptr.next=head;
        slowptr.next=null;
        head=newHead;
    }

    // ---------- Main for Testing ----------
    public static void main(String[] args) {
        LinkedListRotate list = new LinkedListRotate();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        System.out.println("Before rotation:");
        list.printList();

        list.rotate(2);  // You will implement rotation

        System.out.println("After rotation:");
        list.printList();
    }
}