// File: RevisionList.java

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class RevisionList {
    Node head;
    Node tail;

    // Insert node at the end
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Print list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) System.out.print(" ⇔ ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class RevisionMain {

    // ✳️ You will write your logic here
    public static Node[] removeOverlaps(Node head1, Node head2) {
        Node temp1=head1;

        while(temp1!=null){
            Node temp2=head2;
            while(temp2!=null){
                if(temp1.data==temp2.data){
                    temp2.prev.next=temp2.next;
                    temp2.next.prev=temp2.prev;
                }
                temp2=temp2.next;
            }
            temp1=temp1.next;
        }
        return new Node[]{head1,head2};
    }

    public static void main(String[] args) {
        // Create first list
        RevisionList list1 = new RevisionList();
        list1.insert(1);
        list1.insert(2);
        list1.insert(3);
        list1.insert(4);

        // Create second list
        RevisionList list2 = new RevisionList();
        list2.insert(9);
        list2.insert(15);
        list2.insert(2);
        list2.insert(3);
        list2.insert(7);

        System.out.println("Before removing overlaps:");
        System.out.print("List 1: ");
        list1.printList();
        System.out.print("List 2: ");
        list2.printList();

        // Call your method here
        Node[] result = removeOverlaps(list1.head, list2.head);

        // Update heads (if modified)
        list1.head = result[0];
        list2.head = result[1];

        System.out.println("\nAfter removing overlaps:");
        System.out.print("List 1: ");
        list1.printList();
        System.out.print("List 2: ");
        list2.printList();
    }
}
