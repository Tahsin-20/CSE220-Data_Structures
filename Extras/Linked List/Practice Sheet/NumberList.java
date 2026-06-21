public class NumberList {

    // Node class for singly linked list
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head of the linked list
    public Node head;

    // Method to add elements to the end of the list
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

    // Print the list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null)
                System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Method to check if sum possible — you will implement this
    public boolean IsSumPossible(Node head, int n) {
        Node curr=head;
        boolean bool=false;
        while(curr.next!=null){
            Node nextNode=curr.next;
            if(head.next==null){
                return false;
            }
            if((curr.data+nextNode.data)==n){
                bool=true;
                break;
            }
            else{
                bool=false;
            }
            curr=curr.next;
        }
        return bool;
    }

    // Main method for testing
    public static void main(String[] args) {
        NumberList list = new NumberList();

        // Example input: list = 1 -> 2 -> 3 -> 4 -> 5, n = 7
        
        list.add(5);

        System.out.print("List: ");
        list.printList();

        int n = 7;
        boolean result = list.IsSumPossible(list.head, n);
        System.out.println("Is sum " + n + " possible? " + result);
    }
}
