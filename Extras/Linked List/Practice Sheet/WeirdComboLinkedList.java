public class WeirdComboLinkedList {

    // ===================== Node Class =====================
    static class Node {
        int elem;
        Node next;

        Node(int elem) {
            this.elem = elem;
            this.next = null;
        }
    }

    // ===================== Linked List Class =====================
    static class MyLinkedList2 {
        Node head;

        public void insert(int value) {
            Node newNode = new Node(value);

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

        // returns the node at index (0-based)
        public Node nodeAt(int index) {
            Node temp = head;
            int count = 0;
            while (temp != null && count < index) {
                temp = temp.next;
                count++;
            }
            return temp;
        }

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

    // ===================== You will implement this =====================
    public static int weirdCombination(Node head, int[] arr) {
        int count=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        int n=count-1;
        int m=0;
        int sum=0;
        while(m<count){

            Node start=head;
            for(int i=0; i<m; i++){
                start=start.next;
            }
            sum+=start.elem-arr[n];
            m++;
            n--;
        }
        return sum;
    }

    // ===================== MAIN =====================
    public static void main(String[] args) {

        MyLinkedList2 list = new MyLinkedList2();
        list.insert(10);
        list.insert(23);
        list.insert(30);
        list.insert(14);

        int[] arr = {15, 10, 56, 65};

        list.printList();

        int result = weirdCombination(list.head, arr);
        System.out.println("Result = " + result);
    }
}
