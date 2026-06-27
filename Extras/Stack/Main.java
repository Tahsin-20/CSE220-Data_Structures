public class Main {

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
        public void display() {
    Node current = top;
    while (current != null) {
        System.out.println(current.data);
        current = current.next;
    }
}

        // ===== method to rotate upward by k =====
        public void rotate_stack(int k) {
            StackLL temp1 = new StackLL();
            StackLL temp2 = new StackLL();
            int count=0;
            while(count<k){
                temp1.push(this.pop());
                count++;
            }
            while(!this.isEmpty()){
                temp2.push(this.pop());
            }
            while(!temp1.isEmpty()){
                this.push(temp1.pop());
            }
            while(!temp2.isEmpty()){
                this.push(temp2.pop());
            }
        }
    }

    // ===== Main Method =====
    public static void main(String[] args) {
        StackLL stack = new StackLL();

        stack.push(50);
        stack.push(40);
        stack.push(30);
        stack.push(20);
        stack.push(10);

        stack.rotate_stack(2);
        stack.display();  // You will implement this
    }
}
