public class RetainAndReverseStack {

    // ===== Node Class =====
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // ===== Stack Class Using Linked List =====
    static class StackLL {
        private Node top;
        private int size;

        public StackLL() {
            top = null;
            size = 0;
        }

        public void push(int value) {
            Node newNode = new Node(value);
            newNode.next = top;
            top = newNode;
            size++;
        }

        public int pop() {
            if (isEmpty()) return -1;
            int val = top.data;
            top = top.next;
            size--;
            return val;
        }

        public int peek() {
            if (isEmpty()) return -1;
            return top.data;
        }

        public boolean isEmpty() {
            return top == null;
        }

        public int getSize() {
            return size;
        }

        // ===== method to retain only top m and reverse =====
        public void retain_and_reverse_stack(int m) {
            StackLL temp = new StackLL();
            int size=getSize()-m;
            int count=0;

            while(count<size){
                this.pop();
                count++;
            }
            while(!this.isEmpty()){
                temp.push(this.pop());
            }
            temp.display();
        }

        public void display() {
            Node current = top;
            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        }
    }

    // ===== Main Method =====
    public static void main(String[] args) {
        StackLL stack = new StackLL();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);

        stack.retain_and_reverse_stack(4);

    }
}
