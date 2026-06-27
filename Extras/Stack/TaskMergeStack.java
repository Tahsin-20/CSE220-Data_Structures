public class TaskMergeStack {

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

        public Stack() {
            top = null;
        }

        public void push(int element) {
            Node newNode = new Node(element);
            newNode.next = top;
            top = newNode;
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack Underflow!");
                return -1;
            }
            int val = top.data;
            top = top.next;
            return val;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty!");
                return -1;
            }
            return top.data;
        }

        public boolean isEmpty() {
            return top == null;
        }
    }

    // =======================
    //   YOUR METHOD TO COMPLETE
    // =======================
    public static void print_total_task(int[][] tasks) {

    Stack temp = new Stack();

    int start_time = tasks[0][0];
    int end_time = tasks[0][1];

    // Start from second interval
    for (int i = 1; i < tasks.length; i++) {

        int next_start = tasks[i][0];
        int next_end = tasks[i][1];

        // CASE 1: Overlapping intervals
        if (next_start <= end_time) {

            // Update end_time without Math.max
            if (next_end > end_time) {
                end_time = next_end;
            }
        }

        // CASE 2: Non-overlapping → push previous merged task
        else {

            // push (start, end)
            temp.push(start_time);
            temp.push(end_time);

            // move to next interval
            start_time = next_start;
            end_time = next_end;
        }
    }

    // Push the last merged interval
    temp.push(start_time);
    temp.push(end_time);

    // Print in descending order of start time
    while (!temp.isEmpty()) {
        int end = temp.pop();
        int start = temp.pop();
        System.out.println(start + ", " + end);
    }
}


    // =======================
    //      Main (optional)
    // =======================
    public static void main(String[] args) {

        int[][] tasks = {
            {1, 5},
            {2, 3},
            {4, 6},
            {7, 10},
            {9, 11},
            {12, 15}
        };

        print_total_task(tasks);
    }
}
