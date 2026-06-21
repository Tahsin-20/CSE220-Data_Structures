public class ZigzagLinkedList {

    // ===================== Node Class =====================
    static class Node {
        int elem;
        Node next;

        Node(int elem) {
            this.elem = elem;
            this.next = null;
        }
    }

    // ===================== Zigzag List Method =====================
    public static Node Zigzag_List(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        Node head = null;
        Node tail = null;

        for (int j = 0; j < col; j++) {
            if (j % 2 == 0) { // even column → top to bottom
                for (int i = 0; i < row; i++) {
                    if ((i + j) % 2 == 0) { // only white tiles
                        Node newNode = new Node(matrix[i][j]);
                        if (head == null) {
                            head = newNode;
                            tail = newNode;
                        } else {
                            tail.next = newNode;
                            tail = newNode;
                        }
                    }
                }
            } else { // odd column → bottom to top
                for (int i = row - 1; i >= 0; i--) {
                    if ((i + j) % 2 == 0) { // only white tiles
                        Node newNode = new Node(matrix[i][j]);
                        if (head == null) {
                            head = newNode;
                            tail = newNode;
                        } else {
                            tail.next = newNode;
                            tail = newNode;
                        }
                    }
                }
            }
        }
        Node prev=null;
        Node curr=head;
        while(curr!=null){
            Node nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }
        head=prev;
        return head;
    }

    // ===================== Utility Method to Print =====================
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.elem);
            if (temp.next != null) System.out.print(" → ");
            temp = temp.next;
        }
        System.out.println();
    }

    // ===================== Main (for quick testing) =====================
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 5, 8},
            {4, 9, 1, 0},
            {7, 3, 4, 9},
            {6, 8, 3, 2},
        };

        Node head = Zigzag_List(matrix);
        printList(head);
    }
}
