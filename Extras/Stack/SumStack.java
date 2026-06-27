// File: SumStack.java

// ------------------- Node Class -------------------
class MyNode {
    int data;
    MyNode next;

    public MyNode(int data) {
        this.data = data;
        this.next = null;
    }
}


// ------------------- Stack Class -------------------
class MyStack {

    private MyNode top;

    public MyStack() {
        top = null;
    }

    // push
    public void push(int data) {
        MyNode newNode = new MyNode(data);
        newNode.next = top;
        top = newNode;
    }

    // pop
    public Integer pop() {
        if (isEmpty()) return null;

        int value = top.data;
        top = top.next;
        return value;
    }

    // peek
    public Integer peek() {
        if (isEmpty()) return null;
        return top.data;
    }

    // isEmpty
    public boolean isEmpty() {
        return top == null;
    }

    // ---------- YOU WILL COMPLETE THIS ----------
    public static void sum_stack(MyStack st) {
        MyStack temp = new MyStack();
        MyStack half = new MyStack();
        MyStack result = new MyStack();
        int count=0;
        int i=0;
        while(!st.isEmpty()){
            temp.push(st.pop());
            count++;
        }
        while(!temp.isEmpty()){
            st.push(temp.pop());
        }
        while(i<count/2){
            half.push(st.pop());
            i++;
        }
        while(!st.isEmpty() && !half.isEmpty()){
            result.push(st.pop()+half.pop());
        }
        result.printStack();
    }

    // print from bottom to top
    public void printStack() {
        printRec(top);
        System.out.println();
    }

    private void printRec(MyNode node) {
        if (node == null) return;
        printRec(node.next);
        System.out.print(node.data + " ");
    }
}


// ------------------- MAIN -------------------
public class SumStack {
    public static void main(String[] args) {

        MyStack st = new MyStack();

        // ------- SAMPLE INPUT -------
        // Input Stack (bottom → top):
        // 10 15 20 50 25 35
        st.push(10);
        st.push(15);
        st.push(20);
        st.push(50);
        st.push(25);
        st.push(35);
        // ----------------------------

        // Call your function
        MyStack.sum_stack(st);

        // Output the modified stack
    }
}
