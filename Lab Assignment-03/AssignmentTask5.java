public class AssignmentTask5 {

    //SUBMIT ONLY THIS METHOD
    public static void sumOddAppend(Node dh) {
        Node prev=dh;
        Node temp=dh.next;
        Integer sum=0;

        while(temp!=dh){
            //Jodi odd pay then sum e store kortese kintu prev change hocche na
            if(((Integer)(temp.elem))%2!=0){
                sum+=(Integer)(temp.elem);
                temp=temp.next;
            }
            else{
                //Jokhoni even pay previously jei odd valye ta paisilam oitar node ta delete kore dey
                prev.next=temp;
                prev=temp;
                temp=temp.next;

            }
        }
        Node tail=dh.next;
        //Last node porjonto traverse kortesi
        while(tail.next!=dh){
            tail=tail.next;
        }
        //Last node er pore sum ta add kore dicchi
        Node newNode=new Node(sum);
        tail.next=newNode;
        newNode.next=dh;
    }

    //DO NOT SUBMIT THE DRIVER CODE BELOW
    //SUBMITTING IT WILL INCREASE YOUR PLAG % FOR NO REASON
    public static void main(String[] args) {
        Object[] values = {11, 22, 33, 44, 55, 66};
        Node head = LinkedListHelpers.createDummyHeadedSinglyCircularLL(values, true);

        System.out.println("Given Linked List:");
        LinkedListHelpers.printDummyHeadedSinglyCircularLL(head);
        System.out.println("\nExpected Output:");
        Object[] expected = {22, 44, 66, 99};
        Node expectedHead = LinkedListHelpers.createDummyHeadedSinglyCircularLL(expected, true);
        LinkedListHelpers.printDummyHeadedSinglyCircularLL(expectedHead);
        
        //Running the Sum Odd Append
        sumOddAppend(head);
        //Printing after Sum Odd Append
        System.out.println("\nYour Output:");
        LinkedListHelpers.printDummyHeadedSinglyCircularLL(head);
    }
}
