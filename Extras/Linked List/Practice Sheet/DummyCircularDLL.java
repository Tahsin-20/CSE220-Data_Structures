public class DummyCircularDLL {

    // Node class
    static class DoublyNode {
        int elem;
        DoublyNode next;
        DoublyNode prev;

        DoublyNode(int elem) {
            this.elem = elem;
        }
    }

    DoublyNode dh; // dummy head

    // Constructor - creates dummy head pointing to itself
    public DummyCircularDLL() {
        dh = new DoublyNode(-1);
        dh.next = dh;
        dh.prev = dh;
    }

    // Method to create a DLL from an array (for testing)
    public void createDLL(int[] arr) {
        DoublyNode tail = dh;
        for (int val : arr) {
            DoublyNode newNode = new DoublyNode(val);
            newNode.prev = tail;
            newNode.next = dh;
            tail.next = newNode;
            dh.prev = newNode;
            tail = newNode;
        }
    }

    // Print DLL (circular)
    public void printDLL() {
        DoublyNode temp = dh.next;
        while (temp != dh) {
            System.out.print(temp.elem);
            temp = temp.next;
            if (temp != dh) System.out.print(" ⇔ ");
        }
        System.out.println();
    }

    // Helper to get node at given position (1-based)
    public DoublyNode nodeAt(int pos) {
        DoublyNode temp = dh.next;
        int count = 1;
        while (temp != dh && count < pos) {
            temp = temp.next;
            count++;
        }
        return temp == dh ? null : temp;
    }

    // ======= YOU WILL WRITE THIS PART =======
    public void reverseDLLBetweenTwoPositions(DoublyNode head, int m, int n) {
        DoublyNode temp=head.next;
        DoublyNode startNode=null;
        DoublyNode endNode=null;
        int count=1;
        while(count<m){
            temp=temp.next;
            count++;
        }
        startNode=temp;
        while(count<n){
            temp=temp.next;
            count++;
        }
        endNode=temp;
        DoublyNode beforeStart=startNode.prev;
        DoublyNode afterEnd=endNode.next;
        DoublyNode curr=startNode;
        while(curr!=afterEnd){
            DoublyNode nextNode=curr.next;
            curr.next=curr.prev;
            curr.prev=nextNode;
            curr=nextNode;
        }
        beforeStart.next=endNode;
        endNode.prev=beforeStart;
        startNode.next=afterEnd;
        afterEnd.prev=startNode;
    }

    // ======= For quick testing =======
    public static void main(String[] args) {
        DummyCircularDLL list = new DummyCircularDLL();
        int[] arr = {10, 40, 30, 20, 50};
        list.createDLL(arr);
        System.out.print("Original list: ");
        list.printDLL();

        // Call the method (you’ll implement it)
        list.reverseDLLBetweenTwoPositions(list.dh, 2, 4);

        System.out.print("Modified list: ");
        list.printDLL();
    }
}
