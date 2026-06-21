public class RearrangeLinkedList {

    // ===== Node Class =====
    static class Node {
        int elem;
        Node next;

        public Node(int elem) {
            this.elem = elem;
            this.next = null;
        }
    }

    // ===== Custom Linked List Class =====
    static class MyList {
        Node head;

        // Add node at end
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

        // ========== YOU WILL IMPLEMENT THIS ==========
        // Rearrange so values < x come before >= x, preserving order
        public void rearrangeNodes(int x) {
            Node lesshead=null, greaterhead=null;
            Node lesstail=null , greatertail=null;
            Node curr=head;

            while(curr!=null){
                Node nextnode=curr.next;
                curr.next=null;
                if(curr.elem<x){
                    if(lesshead==null){
                        lesshead=curr;
                        lesstail=curr;
                    }
                    else{
                        lesstail.next=curr;
                        lesstail=lesstail.next;
                    }
                }
                else{
                    if(greaterhead==null){
                        greaterhead=curr;
                        greatertail=curr;
                    }
                    else{
                        greatertail.next=curr;
                        greatertail=greatertail.next;
                    }
                }
                curr=nextnode;
            }
            lesstail.next=greaterhead;
            head=lesshead;
        }

        // Print list
        public void printList() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.elem + " -> ");
                temp = temp.next;
            }
            System.out.println("None");
        }
    }

    // ===== MAIN TO TEST =====
    public static void main(String[] args) {
        MyList list = new MyList();
        list.add(1);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(5);
        list.add(2);

        System.out.println("Before rearrange:");
        list.printList();

        int x = 3;
        list.rearrangeNodes(x);   // You will complete this

        System.out.println("After rearrange:");
        list.printList();
    }
}
