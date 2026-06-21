// File: DifferenceCheckMain.java

class Node {
    int data;
    Node next;

    Node(int elem) {
        this.data = elem;
        this.next = null;
    }
}

class TaskLinkedList {
    Node head;

    // Insert node at end
    public void insert(int elem) {
        Node newNode = new Node(elem);
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
            if (temp.next != null)
                System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class DifferenceCheckMain {

    // 🔹 You will implement this method
    public static boolean is_difference_linear_increasing(Node headA, Node headB) {
        Node curr1=headA;
        Node curr2=headB;
        boolean bool=true;
        while(curr1.next!=null && curr2.next!=null){
            int a=curr1.data-curr2.data;
            int b=curr1.next.data-curr2.next.data;

            if((b-a)==1){
            }
            else{
                bool=false;
                break;
            }
            curr1=curr1.next;
            curr2=curr2.next;

        }
        return bool;
    }

    public static void main(String[] args) {
        // ===== Test 1 =====
        TaskLinkedList listA1 = new TaskLinkedList();
        TaskLinkedList listB1 = new TaskLinkedList();

        int[] valsA1 = {10, 12, 14, 16};
        int[] valsB1 = {4, 5, 6, 7};

        for (int v : valsA1) listA1.insert(v);
        for (int v : valsB1) listB1.insert(v);

        System.out.println("List A:");
        listA1.printList();
        System.out.println("List B:");
        listB1.printList();

        System.out.println("Output 1: " + is_difference_linear_increasing(listA1.head, listB1.head));
        System.out.println();

        // ===== Test 2 =====
        TaskLinkedList listA2 = new TaskLinkedList();
        TaskLinkedList listB2 = new TaskLinkedList();

        int[] valsA2 = {20, 24, 30};
        int[] valsB2 = {10, 12, 15};

        for (int v : valsA2) listA2.insert(v);
        for (int v : valsB2) listB2.insert(v);

        System.out.println("List A:");
        listA2.printList();
        System.out.println("List B:");
        listB2.printList();

        System.out.println("Output 2: " + is_difference_linear_increasing(listA2.head, listB2.head));
    }
}
