public class DoublyPalindromeCheck {

    static class DNode {
        int elem;
        DNode next;
        DNode prev;

        DNode(int elem) {
            this.elem = elem;
        }
    }

    static class DLinkedList {
        DNode dh; // dummy head

        public DLinkedList() {
            dh = new DNode(-1);
            dh.next = null;  // NOT circular
            dh.prev = null;  // NOT circular
        }

        // Insert at end
        public void insert(int elem) {
            DNode newNode = new DNode(elem);

            // empty list
            if (dh.next == null) {
                dh.next = newNode;
                newNode.prev = dh;   // prev of first real node = dummy
                return;
            }

            // find tail
            DNode tail = dh.next;
            while (tail.next != null) {
                tail = tail.next;
            }

            tail.next = newNode;
            newNode.prev = tail;
        }

        // Correct palindrome check
        public boolean isPalindrome() {

            DNode start = dh.next;

            // find end
            DNode end = dh.next;
            while (end.next != null) {
                end = end.next;
            }

            // compare
            while (start != end && start.prev != end) {

                if (start.elem != end.elem) {
                    return false;
                }
                start = start.next;
                end = end.prev;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        DLinkedList list = new DLinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(3);
        list.insert(2);
        list.insert(1);

        DLinkedList list2 = new DLinkedList();
        list2.insert(4);
        list2.insert(5);
        list2.insert(6);
        list2.insert(7);
        list2.insert(8);

        System.out.println(list.isPalindrome());
        System.out.println(list2.isPalindrome());
    }
}
