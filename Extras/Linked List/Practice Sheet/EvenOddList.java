public class EvenOddList {

    // ================= Node Class =================
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // =============== Insert at end (for testing) ===============
    public void insert(int value) {
        Node newNode = new Node(value);

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

    // =============== Print Linked List ===============
    public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            temp = temp.next;
            if (temp != null) System.out.print(" → ");
        }
        System.out.println(" → None");
    }

    // =============== METHOD YOU WILL WRITE ===============
    public Node segregateEvenOdd(Node head) {
        Node evenhead=null , eventail=null;
        Node oddhead=null , oddtail=null;
        Node curr=head;
        
        while(curr!=null){
            Node next=curr.next;
            curr.next=null;
            if(curr.data%2==0){
                if(evenhead==null){
                    evenhead=curr;
                    eventail=curr;
                }
                else{
                eventail.next=curr;
                eventail=eventail.next;
                }
            }
            else{
                if(oddhead==null){
                    oddhead=curr;
                    oddtail=curr;
                }
                else{
                oddtail.next=curr;
                oddtail=oddtail.next;
                }
            }
            curr=next;
        }
        eventail.next=oddhead;
        return evenhead;
    }

    // =============== Testing ===============
    public static void main(String[] args) {

        EvenOddList list = new EvenOddList();

        int[] arr = {17, 15, 8, 12, 10, 5, 4, 1, 7, 6};

        for (int x : arr) list.insert(x);

        System.out.print("Original List: ");
        list.printList(list.head);

        // call your method (must return a node)
        list.head = list.segregateEvenOdd(list.head);

        System.out.print("Modified List: ");
        list.printList(list.head);
    }
}
