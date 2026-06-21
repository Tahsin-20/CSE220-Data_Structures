public class RearrangeTokens {
    
    // Node class
    static class Node {
        String elem;
        Node next;

        Node(String elem) {
            this.elem = elem;
            this.next = null;
        }
    }

    // Method to rearrange tokens
    public static Node rearrange_Tokens(Node head, int seniorPos) {
        Node temp=head;
        int count=1;
        while(count<seniorPos-1){
            temp=temp.next;
            count++;
        }
        Node newHead=temp.next;
        temp.next=null;

        Node curr=newHead;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=head;
        return newHead;
    }

    // Helper to print linked list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.elem);
            if (temp.next != null) System.out.print(" → ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Example test
    public static void main(String[] args) {
        // Example 1
        Node head1 = new Node("A3");
        head1.next = new Node("A9");
        head1.next.next = new Node("A4");
        head1.next.next.next = new Node("A2");
        head1.next.next.next.next = new Node("A7");
        head1.next.next.next.next.next = new Node("A8");
        head1.next.next.next.next.next.next = new Node("A1");

        System.out.println("Original:");
        printList(head1);

        Node newHead1 = rearrange_Tokens(head1, 4);

        System.out.println("Rearranged:");
        printList(newHead1);

        // Example 2
        Node head2 = new Node("A9");
        head2.next = new Node("A3");
        head2.next.next = new Node("A4");
        head2.next.next.next = new Node("A8");
        head2.next.next.next.next = new Node("A6");
        head2.next.next.next.next.next = new Node("A5");

        System.out.println("\nOriginal:");
        printList(head2);

        Node newHead2 = rearrange_Tokens(head2, 5);

        System.out.println("Rearranged:");
        printList(newHead2);
    }
}
