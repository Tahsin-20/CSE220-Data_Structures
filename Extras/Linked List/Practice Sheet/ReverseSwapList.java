public class ReverseSwapList {

    // Node class (already assumed to be provided in the problem)
    public static class Node {
        int elem;
        Node next;

        public Node(int elem) {
            this.elem = elem;
            this.next = null;
        }
    }

    // Head of the linked list
    public Node head;

    // Method to add elements to the end of the list
    public void add(int elem) {
        Node newNode = new Node(elem);
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

    // Method to print the linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.elem);
            if (temp.next != null)
                System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Method to reverse and swap parts of the list — you will implement this
    public Node reverseAndSwap(Node head, int i) {
        int count=0;
        Node prev=null;
        Node curr=head;
        while(count<=i){
            Node nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
            count++;
        }
        Node headofreversed=prev;
        Node newHead=curr;
        while(newHead.next!=null){
            newHead=newHead.next;
        }
        newHead.next=prev;
        return curr;
    }

    // Main method to test
    public static void main(String[] args) {
        ReverseSwapList list = new ReverseSwapList();

        // Sample Input: 5 -> 7 -> 6 -> 3 -> 8 -> 2 -> 1, i = 3
        list.add(5);
        list.add(7);
        list.add(6);
        list.add(3);
        list.add(8);
        list.add(2);
        list.add(1);

        System.out.print("Original List: ");
        list.printList();

        int i = 3;
        list.head = list.reverseAndSwap(list.head, i);

        System.out.print("Modified List: ");
        list.printList();
    }
}
