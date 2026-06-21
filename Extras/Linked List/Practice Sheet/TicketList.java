public class TicketList {

    // Node class for the linked list
    public static class Node {
        int id;
        Node next;

        public Node(int id) {
            this.id = id;
            this.next = null;
        }
    }

    // Head of the linked list
    public Node head;

    // Add new ticket ID at the end of the list
    public void add(int id) {
        Node newNode = new Node(id);
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

    // Print the linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.id);
            if (temp.next != null)
                System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Method to remove duplicates — you will fill this part
    public void remove_Duplicates(Node head) {
        Node curr=head;
        while(curr!=null){
            Node nextNode=curr;
            while(nextNode.next!=null){
                if(curr.id==nextNode.next.id){
                    nextNode.next=nextNode.next.next;
                }
                else{
                    nextNode=nextNode.next;
                }
            }
            curr=curr.next;
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        TicketList list = new TicketList();

        // Example input
        list.add(101);
        list.add(103);
        list.add(101);
        list.add(102);
        list.add(103);
        list.add(104);
        list.add(105);
        list.add(105);

        System.out.print("Input Tickets: ");
        list.printList();

        list.remove_Duplicates(list.head);

        System.out.print("Fixed Tickets: ");
        list.printList();
    }
}
