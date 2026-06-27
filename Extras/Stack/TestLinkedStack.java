// ===================== Node Class =====================
class Node {
    int elem;
    Node next;

    public Node(int elem) {
        this.elem = elem;
        this.next = null;
    }
}

// ===================== LinkedStack Class =====================
class LinkedStack {
    private Node top;

    public LinkedStack() {
        top = null;
    }

    // Push an element onto the stack
    public void push(int elem) {
        Node newNode = new Node(elem);
        newNode.next = top;
        top = newNode;
    }

    // Pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int popped = top.elem;
        top = top.next;
        return popped;
    }

    // Peek the top element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.elem;
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Print stack elements (for testing)
    public void printStack() {
        Node temp = top;
        System.out.print("Stack: ");
        while (temp != null) {
            System.out.print(temp.elem + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // ===================== conditional_reverse (to be completed by you) =====================
    public static LinkedStack conditional_reverse(LinkedStack st, int n) {
        LinkedStack temp1=new LinkedStack();
        LinkedStack temp2=new LinkedStack();
        int count=0;

        while(count<n){
            temp1.push(st.pop());
            count++;
        }
        while(!temp1.isEmpty()){
            temp2.push(temp1.pop());
        }
        while(!temp2.isEmpty()){
            st.push(temp2.pop());
        }
        return st;
    }
}

// ===================== Example Main Class =====================
public class TestLinkedStack {
    public static void main(String[] args) {
        LinkedStack st = new LinkedStack();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);

        System.out.println("Before:");
        st.printStack();

        st = LinkedStack.conditional_reverse(st, 4);

        System.out.println("After:");
        st.printStack();
    }
}
