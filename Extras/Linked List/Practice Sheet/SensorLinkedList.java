public class SensorLinkedList {

    // Node class definition
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head of the linked list
    Node head;

    // Method to add a node at the end of the list
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Method to print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null)
                System.out.print(" -> ");
            current = current.next;
        }
        System.out.println();
    }

    // You will implement this later
    public String validate_readings(Node head, int low, int high) {
        Node temp=head;

        while(temp!=null){

            if(temp.data<=high && temp.data>=low){
                temp=temp.next;
            }
            else{
                return "Reading out of range detected.";
            }
        }
        printList();
        return "";
    }

    // Simple main method for testing
    public static void main(String[] args) {
        SensorLinkedList list = new SensorLinkedList();

        // Example input: 15 -> 18 -> 10 -> 20 -> 12
        list.insert(25);
        list.insert(15);
        list.insert(30);
        list.insert(18);
        list.insert(10);
        list.insert(22);

        int low = 10;
        int high = 20;

        // Call your method here after implementing it
        list.validate_readings(list.head, low, high);
        String result = list.validate_readings(list.head, low, high);
if (!result.isEmpty()) {
    System.out.println(result);
}
    }
}
