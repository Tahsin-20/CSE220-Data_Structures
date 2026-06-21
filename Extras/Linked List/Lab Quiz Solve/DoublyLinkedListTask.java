public class DoublyLinkedListTask {

    // Node class for Doubly Linked List
    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    // Doubly Linked List class
    static class DoublyLinkedList {
        Node head;
        Node tail;

        // Insert a node at the end of the list
        public void insert(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
                return;
            }
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        // Print the list forward
        public void printList() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data);
                if (temp.next != null) System.out.print(" ⇔ ");
                temp = temp.next;
            }
            System.out.println();
        }

        
        public void mergeMinPair() {
        Node curr=head;
        int sum=head.data+head.next.data;
        while(curr.next!=null){
            if((curr.data+curr.next.data)<sum){
                sum=curr.data+curr.next.data;
            }
            curr=curr.next;
        }
        Node temp=head;
        while(temp.next!=null){
            if((temp.data+temp.next.data)==sum){
                Node newNode=new Node(sum);
                Node nextNode=temp.next;
                newNode.prev=temp.prev;
                newNode.next=nextNode.next;
                temp.prev.next=newNode;
                nextNode.next.prev=newNode;
            }
            temp=temp.next;
        }
    }
}

    // Main function to test your method
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        
        // Sample Input
        int[] values = {15, 10, 21, 9, 5, 20, 9, 10};
        for (int val : values) {
            dll.insert(val);
        }

        System.out.println("Original List:");
        dll.printList();

        dll.mergeMinPair();

        System.out.println("\nUpdated List:");
        dll.printList();
    }
}
