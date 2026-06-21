public class LinkedListAltTask {

    // Node class definition
    static class Node {
        int elem;
        Node next;

        Node(int elem) {
            this.elem = elem;
            this.next = null;
        }
    }

    // Linked List class (named differently so it doesn’t conflict with your other file)
    static class LinkedListAlt {
        Node head;

        // Insert a node at the end
        public void insert(int elem) {
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

        // Print the list
        public void printList() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.elem);
                if (temp.next != null) System.out.print(" → ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    // ===== You will implement this method =====
    public static boolean sumEvenOdd(Node L1, Node L2, Node L3) {
        Node curr1=L1;
        Node curr2=L2;
        Node curr3=L3;
        while(curr1!=null && curr2!=null && curr3!=null){
            int a=curr1.elem+curr2.elem;
            int b=curr2.elem+curr3.elem;
            if(a%2!=0 && b%2!=0){
                break;
            }
            else{
                return true;
            }
        }
        return false;
    }

    // ===== Test code =====
    public static void main(String[] args) {

        LinkedListAlt list1 = new LinkedListAlt();
        LinkedListAlt list2 = new LinkedListAlt();
        LinkedListAlt list3 = new LinkedListAlt();

        // Sample Input 1 (Expected Output: true)
        int[] L1 = {1, 2, 3};
        int[] L2 = {4, 3, 6};
        int[] L3 = {5, 7, 1};

        for (int val : L1) list1.insert(val);
        for (int val : L2) list2.insert(val);
        for (int val : L3) list3.insert(val);

        System.out.println("L1: "); list1.printList();
        System.out.println("L2: "); list2.printList();
        System.out.println("L3: "); list3.printList();

        boolean result = sumEvenOdd(list1.head, list2.head, list3.head);
        System.out.println("\nOutput: " + result);
    }
}
