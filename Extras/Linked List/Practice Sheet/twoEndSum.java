public class twoEndSum{

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
    static class MyLinkedList {
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

    // ===================== Method YOU will write =====================
    public static int twoEndSum(Node head) {
        
        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }

        int i=0;
        int j=count-1;
        int sum=0;
        while(i<j){

            Node front=head;
            for(int m=0; m<i; m++){
                front=front.next;
            }
            Node end=head;
            for(int n=0; n<j; n++){
                end=end.next;
            }
            sum+=front.elem-end.elem;
            i++;
            j--;
        }
        return sum;
    }
    // ===================== Main Method =====================
    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();
        list.insert(9);
        list.insert(11);
        list.insert(3);
        list.insert(4);
        list.insert(2);
        list.insert(1);

        list.printList();

        int result = twoEndSum(list.head);
        System.out.println("Result = " + result);
    }
}