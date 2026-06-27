public class AdjacentSwapStack {

    // =======================
    //        Node Class
    // =======================
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // =======================
    //   Stack Using Linked List
    // =======================
    static class Stack {
        private Node top;

        // Constructor
        public Stack() {
            top = null;
        }

        // Push element onto stack
        public void push(int element) {
            Node newNode = new Node(element);
            newNode.next = top;
            top = newNode;
        }

        // Pop element from stack
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack Underflow!");
                return -1;
            }
            int val = top.data;
            top = top.next;
            return val;
        }

        // Peek top element
        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty!");
                return -1;
            }
            return top.data;
        }

        // Check empty
        public boolean isEmpty() {
            return top == null;
        }
    }

    // =======================
    //      YOUR METHOD
    // =======================
    public static Stack Do_Adjacent_Swap(Stack st) {
        Stack temp = new Stack();

        while(!st.isEmpty()){
            temp.push(st.pop());
        }
        while(!temp.isEmpty()){
            int i=temp.pop();
            if(!temp.isEmpty()){
                st.push(temp.pop());
            }
            st.push(i);
        }
        return st;
        
    }

    // =======================
    //     Main (optional)
    // =======================
    public static void main(String[] args) {

        Stack st = new Stack();

        // Example input stack (8 at top)
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
         st.push(8);

        // You will complete this method yourself
        Stack modified = Do_Adjacent_Swap(st);

        System.out.println("Modified Stack (Top to Bottom):");
        while (!modified.isEmpty()) {
            System.out.print(modified.pop() + " ");
        }
    }
}
