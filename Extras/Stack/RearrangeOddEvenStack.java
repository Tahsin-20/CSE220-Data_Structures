// File: RearrangeOddEvenStack.java

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
    public static void rearrangeOddEven(MyStack st) {
        MyStack odd = new MyStack();
        MyStack even = new MyStack();
        int odd_count=0;
        int even_count=0;
        while(!st.isEmpty()){
            if(st.peek()%2!=0){
                odd.push(st.pop());
                odd_count++;
            }
            else{
                even.push(st.pop());
                even_count++;
            }
        }
        if(odd_count==even_count){
            while(!odd.isEmpty() && !even.isEmpty()){
                st.push(even.pop());
                st.push(odd.pop());
            }
        }
        else{
            while(!odd.isEmpty() && !even.isEmpty()){
                st.push(odd.pop());
                st.push(even.pop());
            }
            st.push(odd.pop());
        }
        st.printStack();
    }

    // print stack from top to bottom (as shown in assignment)
    public void printStack() {
        MyNode curr = top;
        while (curr != null) {
            System.out.println("| " + curr.data + " |");
            curr = curr.next;
        }
        System.out.println();
    }
}


// ------------------- MAIN -------------------
public class RearrangeOddEvenStack {
    public static void main(String[] args) {

        MyStack st = new MyStack();

        // ---------- SAMPLE INPUT #1 ----------
        // Stack (top → bottom):
        // 11, 22, 24, 35, 41

        st.push(41);
        st.push(35);
        st.push(24);
        st.push(22);
        st.push(11);

        // ---------- CALL YOUR FUNCTION ----------
        MyStack.rearrangeOddEven(st);

        // ---------- OUTPUT ----------


        // ---------- SAMPLE INPUT #2 ----------
        MyStack st2 = new MyStack();

        // Stack (top → bottom):
        // 7,10,7,5,12,3
        st2.push(3);
        st2.push(12);
        st2.push(5);
        st2.push(7);
        st2.push(10);
        st2.push(8);

        // CALL YOUR FUNCTION
        MyStack.rearrangeOddEven(st2);

        // OUTPUT
    }
}
