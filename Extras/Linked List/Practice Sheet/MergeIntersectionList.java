public class MergeIntersectionList {

    // Node class
    public static class Node {
        int elem;
        Node next;

        public Node(int elem) {
            this.elem = elem;
            this.next = null;
        }
    }

    // === METHOD TO SOLVE THE PROBLEM ===
    public static Node mergeLL(Node h1, Node h2) {
        Node pointer1=h1;
        Node pointer2=h2;

        while(pointer1!=pointer2){
            if(pointer1==null){
                pointer1=h2;
            }
            else{
                pointer1=pointer1.next;
            }
            if(pointer2==null){
                pointer2=h1;
            }
            else{
                pointer2=pointer2.next;
            }
        }
        if(pointer1==null || pointer2==null){
            return null;
        }
        Node intersection=pointer1;
        Node temp=h1;
        while(temp.next!=pointer1){
            temp=temp.next;
        }
        temp.next=h2;
        return h1;
    }

    // Utility: get list length
    private static int getLength(Node head) {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // === For testing ===
    public static void main(String[] args) {
        // Shared tail
        Node common = new Node(62);
        common.next = new Node(17);
        common.next.next = new Node(89);
        common.next.next.next = new Node(24);

        // First list
        Node h1 = new Node(56);
        h1.next = new Node(78);
        h1.next.next = new Node(91);
        h1.next.next.next = common; // intersection

        // Second list
        Node h2 = new Node(43);
        h2.next = new Node(33);
        h2.next.next = common; // intersection

        Node mergedHead = mergeLL(h1, h2);

        if (mergedHead == null) {
            System.out.println("No intersection found (null)");
        } else {
            printList(mergedHead);
        }
    }

    // Print helper
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.elem);
            if (temp.next != null) System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println();
    }
}
