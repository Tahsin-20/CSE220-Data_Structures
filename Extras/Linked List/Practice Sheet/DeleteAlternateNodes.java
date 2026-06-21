public class DeleteAlternateNodes {

    // ======================
    //        Node Class
    // ======================
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // ======================
    //    Singly Linked List
    // ======================
    static class MyList {
        Node head;

        // Insert at end
        public void insert(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            Node temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = newNode;
        }

        // ===================================
        // YOU WILL COMPLETE THIS METHOD
        // delete alternate nodes starting from 2nd
        // ===================================
        public void deleteAlternate() {
            Node curr=head;

            while(curr!=null && curr.next!=null){
                curr.next=curr.next.next;
                curr=curr.next;
            }
        }

        // print list (for testing)
        public void printList() {
            Node t = head;
            while (t != null) {
                System.out.print(t.data + " ");
                t = t.next;
            }
            System.out.println();
        }
    }

    // ======================
    //         MAIN
    // ======================
    public static void main(String[] args) {
        MyList list = new MyList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.insert(7);


        list.deleteAlternate(); // after you implement, output: 1 3 5

        list.printList();
    }
}
