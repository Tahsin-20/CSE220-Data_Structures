public class InsertDLL {

    // ===== Node Class =====
    static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    // ===== Doubly Circular Dummy Headed List (X) =====
    static class DCList {
        Node head; // dummy head

        public DCList() {
            head = new Node(-1);    // dummy node
            head.next = head;
            head.prev = head;
        }

        // add to end for building sample list
        public void add(int data) {
            Node newNode = new Node(data);
            Node last = head.prev;

            last.next = newNode;
            newNode.prev = last;
            newNode.next = head;
            head.prev = newNode;
        }

        public void print() {
            Node temp = head.next;
            System.out.print("DH <=> ");
            while (temp != head) {
                System.out.print(temp.data + " <=> ");
                temp = temp.next;
            }
            System.out.println("DH");
        }
    }

    // ===== Singly Linear List A =====
    static class SList {
        Node head;

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

        public void print() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("None");
        }
    }

    // ===== METHOD YOU WILL COMPLETE =====
    // Insert A into X at index k (0-indexed)
    public static void insert_list(Node headX, Node headA, int k) {
        //Singly
        Node temp=headA;
        Node prev=null;
        while(temp!=null){
            temp.prev=prev;
            prev=temp;
            temp=temp.next;
        }
        Node tail=prev;
        //Doubly
        int c=0;
        Node curr=headX;
        while(c<k){
            curr=curr.next;
            c++;
        }
        Node next=curr.next;
        curr.next=headA;
        headA.prev=curr;
        tail.next=next;
        next.prev=tail;
    }

    // ===== MAIN FOR TESTING =====
    public static void main(String[] args) {

        DCList X = new DCList();
        X.add(2);
        X.add(3);
        X.add(1);
        X.add(9);

        SList A = new SList();
        //A.add(5);
        A.add(4);
        A.add(8);

        System.out.println("Before insert:");
        X.print();

        int k = 2;

        insert_list(X.head, A.head, k);

        System.out.println("After insert:");
        X.print();
    }
}
