//With Helper Method

// Node class for Reverse Even Subparts question
class NodeRES {
    int data;
    NodeRES next;

    NodeRES(int data) {
        this.data = data;
        this.next = null;
    }
}

// Linked List class for Reverse Even Subparts question
class ReverseEvenSubpartsList {
    NodeRES head;

    // Method to insert elements at the end
    public void insert(int data) {
        NodeRES newNode = new NodeRES(data);
        if (head == null) {
            head = newNode;
            return;
        }
        NodeRES temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // You will implement this method
    // Should return the head of the original list
    public NodeRES reverseEvenSubparts(NodeRES head) {
    if (head == null) return null;

    NodeRES dummy = new NodeRES(0);
    dummy.next = head;

    NodeRES prev = dummy;
    NodeRES curr = head;

    while (curr != null) {
        if (curr.data % 2 == 0) {
            NodeRES start = curr;

            // Move curr to the end of this even sequence
            while (curr != null && curr.data % 2 == 0) {
                curr = curr.next;
            }

            // Now curr is the first odd node after the even sequence (or null)
            NodeRES end = curr;

            // Reverse the even segment between start and end
            prev.next = reverseSegment(start, end);
            start.next = end;

            prev = start;
        } 
        else {
            prev = curr;
            curr = curr.next;
        }
    }

    return dummy.next;
}

private NodeRES reverseSegment(NodeRES start, NodeRES end) {
    NodeRES prev = null;
    NodeRES curr = start;

    while (curr != end) {
        NodeRES nextNode = curr.next;
        curr.next = prev;
        prev = curr;
        curr = nextNode;
    }
    return prev; // new head of reversed section
}


    // Display method
    public void display(NodeRES head) {
        NodeRES temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) System.out.print(" ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main method for testing
    public static void main(String[] args) {
        ReverseEvenSubpartsList list = new ReverseEvenSubpartsList();
        
        // Sample Input
        int[] arr = {2, 18, 24, 3, 5, 7, 9, 6, 12};
        for (int val : arr) list.insert(val);

        System.out.println("Given Reversed List:");
        list.display(list.head);

        list.head = list.reverseEvenSubparts(list.head);

        System.out.println("Original List:");
        list.display(list.head);
    }
}
