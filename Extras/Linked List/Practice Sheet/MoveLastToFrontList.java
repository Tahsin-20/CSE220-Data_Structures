// Node class for Question 01
class NodeQ1 {
    int data;
    NodeQ1 next;

    NodeQ1(int data) {
        this.data = data;
        this.next = null;
    }
}

// Linked list class for Question 01
class MoveLastToFrontList {
    NodeQ1 head;

    // Method to insert elements at the end
    public void insert(int data) {
        NodeQ1 newNode = new NodeQ1(data);
        if (head == null) {
            head = newNode;
            return;
        }
        NodeQ1 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // You will implement this method
    // Should return the new head after moving the last node to front
    public NodeQ1 moveLastToFront(NodeQ1 head) {
        NodeQ1 temp=head;
        NodeQ1 secondLast=head;
        while(temp.next!=null){
            secondLast=temp;
            temp=temp.next;
        }
        secondLast.next=null;
        temp.next=head;
        head=temp;
        return head;
    }

    // Display method
    public void display(NodeQ1 head) {
        NodeQ1 temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main method for testing
    public static void main(String[] args) {
        MoveLastToFrontList list = new MoveLastToFrontList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        System.out.println("Before:");
        list.display(list.head);

        list.head = list.moveLastToFront(list.head);

        System.out.println("After:");
        list.display(list.head);
    }
}
