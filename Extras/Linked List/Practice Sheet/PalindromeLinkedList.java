public class PalindromeLinkedList {

    // ======================
    //        Node Class
    // ======================
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // ======================
    //    Linked List Class
    // ======================
    static class MyPalindromeList {
        Node head;

        // Insert at end (for building the list)
        public void insert(int data) {
            Node newNode = new Node(data);
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

        // ==============================
        // YOU WILL COMPLETE THIS METHOD
        // ==============================
        public boolean isPalindrome() {
            int i=0;
            int j=0;
            Node curr=head;

            while(curr.next!=null){
                j++;
                curr=curr.next;
            }

            while(i<j){
                int startindx=0;
                int endindx=0;
                Node start=head;
                Node end=head;
                while(startindx<i){
                    start=start.next;
                    startindx++;
                }
                while(endindx<j){
                    end=end.next;
                    endindx++;
                }
                if(start.data!=end.data){
                    return false;
                }
                i++;
                j--;
            }
            return true;
        }
    }
    
    // ======================
    //         Main
    // ======================
    public static void main(String[] args) {
        MyPalindromeList list = new MyPalindromeList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(1);
        list.insert(1);

        System.out.println(list.isPalindrome()); // should print True after you implement it
    }
}