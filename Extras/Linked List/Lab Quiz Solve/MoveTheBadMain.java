// File: MoveTheBadMain.java

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class BadList {
    Node head;

    // Insert node at end
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = newNode;
        }
    }

    // Print linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) System.out.print(" → ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class MoveTheBadMain {

    // ✳️ You will implement this part
    public static Node moveTheBad(Node head) {
        Node tail=head;
        while(tail.next!=null){
            tail=tail.next;
        }
        Node originaltail=tail;
        Node curr=head.next;
        Node prev=head;
        while(curr!=originaltail){
            Node nextNode=curr.next;

            if(curr.data<prev.data && curr.data<nextNode.data){
                prev.next=nextNode;
                tail.next=curr;
                curr.next=null;
                tail=curr;
            }
            else{
                prev=curr;
            }
            curr=nextNode;
        }
        return head;
    }

    public static void main(String[] args) {
        // ===== Test 1 =====
        BadList list1 = new BadList();
        int[] vals1 = {10, 5, 9, 3, 8, 2, 9};
        for (int v : vals1) list1.insert(v);

        System.out.println("Before moving bad nodes:");
        list1.printList();

        list1.head = moveTheBad(list1.head);

        System.out.println("After moving bad nodes:");
        list1.printList();

        System.out.println();

        // ===== Test 2 =====
        BadList list2 = new BadList();
        int[] vals2 = {8, 4, 7, 6, 2, 12, 9};
        for (int v : vals2) list2.insert(v);

        System.out.println("Before moving bad nodes:");
        list2.printList();

        list2.head = moveTheBad(list2.head);

        System.out.println("After moving bad nodes:");
        list2.printList();
    }
}

