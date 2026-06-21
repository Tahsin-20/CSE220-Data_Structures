// File: ReverseDLL.java

public class ReverseDLL {

    class DoublyNode {
        int data;
        DoublyNode next;
        DoublyNode prev;

        public DoublyNode(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    DoublyNode head; // dummy head

    public ReverseDLL() {
        head = new DoublyNode(-1);   // dummy head node
        head.next = head;            // circular
        head.prev = head;
    }

    // Create the DLL (skipping dummy)
    public void createDLL(int[] arr) {
        DoublyNode tail = head;
        for (int val : arr) {
            DoublyNode newNode = new DoublyNode(val);
            newNode.prev = tail;
            newNode.next = head;
            tail.next = newNode;
            head.prev = newNode;
            tail = newNode;
        }
    }

    // 1-based index (skip dummy)
    public DoublyNode nodeAt(int idx) {
        DoublyNode curr = head.next;
        int count = 1;
        while (curr != head && count < idx) {
            curr = curr.next;
            count++;
        }
        if (curr == head) return null;
        return curr;
    }

    // Print DLL
    public void printDLL() {
        DoublyNode curr = head.next;
        while (curr != head) {
            System.out.print(curr.data);
            if (curr.next != head) System.out.print(" ⇄ ");
            curr = curr.next;
        }
        System.out.println();
    }

    // =====================================
    // YOU WILL IMPLEMENT THIS METHOD
    // =====================================
    public DoublyNode reverseDLLBetweenTwoPositions(int m, int n) {
        int count=1;
        DoublyNode start=head.next;
        while(count<m){
            start=start.next;
            count++;
        }
        DoublyNode end=start;
        while(count<n){
            end=end.next;
            count++;
        }
        DoublyNode before1=start.prev;
        DoublyNode before2=end.next;

        DoublyNode newhead=reverse(start, end);
        before1.next=newhead;
        newhead.prev=before1;
        start.next=before2;
        before2.prev=start;
        return head;
    }

    public DoublyNode reverse(DoublyNode start, DoublyNode end){
        DoublyNode stop=end.next;
        DoublyNode curr=start;
        while(curr!=stop){
            DoublyNode next=curr.next;
            curr.next=curr.prev;
            curr.prev=next;

            curr=next;
        }
        return end;
    }

    // Test main
    public static void main(String[] args) {
        ReverseDLL dll = new ReverseDLL();
        int[] arr = {10, 40, 30, 20, 50};

        dll.createDLL(arr);

        System.out.print("Original: ");
        dll.printDLL();

        dll.reverseDLLBetweenTwoPositions(2, 4);

        System.out.print("Modified: ");
        dll.printDLL();
    }
}