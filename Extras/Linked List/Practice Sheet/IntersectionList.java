// Node class for Question 02
class NodeQ2 {
    int data;
    NodeQ2 next;

    NodeQ2(int data) {
        this.data = data;
        this.next = null;
    }
}

// Linked list class for Question 02
class IntersectionList {
    NodeQ2 head;

    // Method to insert elements at the end
    public void insert(int data) {
        NodeQ2 newNode = new NodeQ2(data);
        if (head == null) {
            head = newNode;
            return;
        }
        NodeQ2 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // You will implement this method
    // Should return the head of the new intersection list
    public static NodeQ2 findIntersection(NodeQ2 head1, NodeQ2 head2) {
        NodeQ2 newHead=new NodeQ2(0);
        NodeQ2 temp3=newHead;
        NodeQ2 temp1=head1;
        NodeQ2 temp2=head2;

        while(temp1!=null && temp2!=null){

            if(temp1.data==temp2.data){
                NodeQ2 newNode=new NodeQ2(temp2.data);
                temp3.next=newNode;
                temp3=temp3.next;
                temp1=temp1.next;
                temp2=temp2.next;
            }
            else if(temp1.data<temp2.data){
                temp1=temp1.next;
            }
            else{
                temp2=temp2.next;
            }
        }
        return newHead.next;
    }

    // Display method
    public void display(NodeQ2 head) {
        NodeQ2 temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main method for testing
    public static void main(String[] args) {
        IntersectionList list1 = new IntersectionList();
        IntersectionList list2 = new IntersectionList();

        list1.insert(1);
        list1.insert(2);
        list1.insert(3);
        list1.insert(4);
        list1.insert(6);

        list2.insert(2);
        list2.insert(4);
        list2.insert(6);
        list2.insert(8);

        System.out.println("First List:");
        list1.display(list1.head);

        System.out.println("Second List:");
        list2.display(list2.head);

        NodeQ2 result = findIntersection(list1.head, list2.head);
        System.out.println("Intersection List:");
        list2.display(result);
    }
}
