public class RotateDoublyCircularList {

    // ---------------- NODE CLASS ----------------
    class DoublyNode {
        int data;
        DoublyNode next;
        DoublyNode prev;

        public DoublyNode(int data) {
            this.data = data;
        }
    }

    // --------- DOUBLY CIRCULAR LINKED LIST CLASS ----------
    class DoublyCircularList {

        DoublyNode head;   // dummy head

        public DoublyCircularList() {
            head = new DoublyNode(-1); // dummy
            head.next = head;
            head.prev = head;
        }

        // insert at end for testing
        public void insertEnd(int val) {
            DoublyNode newNode = new DoublyNode(val);

            DoublyNode last = head.prev;

            last.next = newNode;
            newNode.prev = last;

            newNode.next = head;
            head.prev = newNode;
        }

        // print list (for testing)
        public void printList() {
            DoublyNode temp = head.next;
            while (temp != head) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        // ------------- YOU WILL COMPLETE THIS METHOD --------------
        public void rotateRight(int k) {
            DoublyNode oldhead=head.next;
            if (head.next == head || head.next.next == head) return;

    // 1. Find length
    DoublyNode temp = head.next;
    int len = 0;
    while (temp != head) {
        temp = temp.next;
        len++;
    }

    // normalize k
    k = k % len;
    if (k == 0) return;

    // 2. Find new tail: (len - k)-th node
    int steps = len - k;
    int count=1;
    DoublyNode newTail = head.next;
    while (count < steps) {
        newTail = newTail.next;
        count++;
    }

    // new head = newTail.next
    DoublyNode newHead = newTail.next;

    // 3. OLD tail = head.prev (because circular DLL)
    DoublyNode oldTail = head.prev;

    // 4. Reconnect links
    head.next = newHead;
    newHead.prev = head;

    newTail.next = head;
    head.prev = newTail;

    oldTail.next = oldhead;
    oldhead.prev = oldTail;
}
    }

    // --------- MAIN METHOD TO LET YOU TEST ----------
    public static void main(String[] args) {

        RotateDoublyCircularList obj = new RotateDoublyCircularList();
        DoublyCircularList list = obj.new DoublyCircularList();

        list.insertEnd(10);
        list.insertEnd(20);
        list.insertEnd(30);
        list.insertEnd(40);
        list.insertEnd(50);

        System.out.println("Before rotation:");
        list.printList();

        list.rotateRight(2); // you will implement this

        System.out.println("After rotation:");
        list.printList();
    }
}