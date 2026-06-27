public class FilterAndSort {

    // -------------------- Node class --------------------
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // -------------------- Stack class (using Linked List) --------------------
    static class LinkedListStack {
        private Node top;

        public LinkedListStack() {
            top = null;
        }

        public boolean isEmpty() {
            return top == null;
        }

        public void push(int data) {
            Node newNode = new Node(data);
            newNode.next = top;
            top = newNode;
        }

        public int pop() {
            if (isEmpty()) {
                throw new RuntimeException("Stack is empty");
            }
            int data = top.data;
            top = top.next;
            return data;
        }

        public int peek() {
            if (isEmpty()) {
                throw new RuntimeException("Stack is empty");
            }
            return top.data;
        }

        // Helper method to print the stack (top to bottom)
        public void printStack() {
            Node current = top;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }

    // -------------------- Method to complete --------------------
    public static void filter_and_sort_stack() {
        LinkedListStack st = new LinkedListStack();     // original stack
        LinkedListStack temp = new LinkedListStack();   // helper stack

        // Sample input (bottom → top order)
        st.push(30);
        st.push(80);
        st.push(10);
        st.push(20);
        st.push(70);
        st.push(40);
        st.push(50);

        int k = 40;

        while(!st.isEmpty()){
            int i=st.pop();
            if(i<=k){
                temp.push(i);
            }
        }

        while(!temp.isEmpty()){
            int m=temp.pop();

            while(!st.isEmpty() && st.peek()<m){
                temp.push(st.pop());
            }
            st.push(m);
        }
        st.printStack();


    }

    // -------------------- Main method to test --------------------
    public static void main(String[] args) {
        filter_and_sort_stack();
    }
}
