// File: RearrangeTasksMain.java

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class TaskList {
    Node head;

    // Insert node at end
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = newNode;
        }
    }

    // Print linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) System.out.print(" → ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class RearrangeTasksMain {

    // ✳️ You will implement this part
    public static Node rearrangeTasks(Node head) {
        int count=0;
        Node curr=head;
        
        while(curr.next!=null){
            if(count%2==0){
            if(curr.data>curr.next.data){
                int temp=curr.next.data;
                curr.next.data=curr.data;
                curr.data=temp;
            }
        }
        else{
            if(curr.data<curr.next.data){
                int temp=curr.next.data;
                curr.next.data=curr.data;
                curr.data=temp;
            }
        }
        curr=curr.next;
        count++;
        }
        return head;
    }

    public static void main(String[] args) {
        // ===== Test 1 =====
        TaskList list1 = new TaskList();
        int[] vals1 = {4, 3, 7, 8, 6, 2, 1};
        for (int v : vals1) list1.insert(v);

        System.out.println("Before rearranging:");
        list1.printList();

        list1.head = rearrangeTasks(list1.head);

        System.out.println("After rearranging:");
        list1.printList();

        System.out.println();

        // ===== Test 2 =====
        TaskList list2 = new TaskList();
        int[] vals2 = {1, 4, 3, 2, 5};
        for (int v : vals2) list2.insert(v);

        System.out.println("Before rearranging:");
        list2.printList();

        list2.head = rearrangeTasks(list2.head);

        System.out.println("After rearranging:");
        list2.printList();
    }
}
