public class SwapLinkedList {

    // ===== Node Class =====
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // ===== Custom Linked List Class =====
    static class MyList {
        Node head;

        // Add node at end
        public void add(int data) {
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

        // ===== METHOD YOU WILL COMPLETE =====
        // Swap the k-th node from start and end (swap values only)
        public void swapKth(int k) {
            int c=1;
            Node curr=head;
            while(curr.next!=null){
                curr=curr.next;
                c++;
            }
            int count1=1;
            Node temp1=head;
            Node temp2=head;
            int count2=1;

            while(count1<k){
                temp1=temp1.next;
                count1++;
            }
            while(count2<((c-k)+1)){
                temp2=temp2.next;
                count2++;
            }
            int temp=0;
            temp=temp1.data;
            temp1.data=temp2.data;
            temp2.data=temp;
        }

        // Print list
        public void printList() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("None");
        }
    }

    // ===== MAIN FOR TESTING =====
    public static void main(String[] args) {
        MyList list = new MyList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Before swap:");
        list.printList();

        int k = 2;
        list.swapKth(k);   // You will implement this

        System.out.println("After swap:");
        list.printList();
    }
}
