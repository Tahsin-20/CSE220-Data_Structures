// Node class
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Custom Linked List class for the problem
class StoneLinkedList {
    Node head;

    // Method to insert elements at the end
    public void insert(int data) {
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

    // You will implement this method
    public int smallest_number_product(Node head, int n) {
        int count=0;
        int temp=0;
        Node temp1=head;
        
        while(count<n){
            temp+=temp1.data;
            temp1=temp1.next;
            count++;
        }
        return temp;
    }

    // For displaying the list (optional)
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main for testing
    public static void main(String[] args) {
        StoneLinkedList list = new StoneLinkedList();
        list.insert(2);
        list.insert(3);
        list.insert(9);
        list.insert(20);
        list.insert(100);
        list.insert(110);
        list.display();

        int n = 3;
        System.out.println("Product = " + list.smallest_number_product(list.head, n));
    }
}
