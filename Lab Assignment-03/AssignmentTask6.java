public class AssignmentTask6 {

    //SUBMIT ONLY THIS METHOD
    public static void pairJoin(DNode dh1, DNode dh2) {
        DNode temp1=dh1.next;
        DNode temp2=dh2.next;

        while(temp1!=null && temp2!=null){
            
            DNode next1=temp1.next;
            DNode next2=temp2.next;

            temp1.next=temp2;
            temp2.prev=temp1;
            /*Jotokhon na next1 ar next2 null hobe totokhon temp1 er 
            shathe temp2 join hoye next1 tao add hoye jabe*/
            if(next1!=null && next2!=null){
            temp2.next=next1;
            next1.prev=temp2;
            }
            temp1=next1;
            temp2=next2;
        }
        DNode temp=dh1.next;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=dh1;
        dh1.prev=temp;
    }

    //DO NOT SUBMIT THE DRIVER CODE BELOW
    //SUBMITTING IT WILL INCREASE YOUR PLAG % FOR NO REASON
    public static void main(String[] args) {
        Object[] list1 = {"A", "B", "C", "D"};
        Object[] list2 = {"E", "F", "G", "H"};

        DNode dh1 = LinkedListHelpers.createDummyHeadedDoublyLL(list1, false);
        DNode dh2 = LinkedListHelpers.createDummyHeadedDoublyLL(list2, false);

        System.out.println("Given Linked List 1:");
        LinkedListHelpers.printDummyHeadedDoublyLL(dh1);

        System.out.println("Given Linked List 2:");
        LinkedListHelpers.printDummyHeadedDoublyLL(dh2);

        System.out.println("\nExpected Output:");
        Object[] expected = {"A", "E", "B", "F", "C", "G", "D", "H"};
        DNode expectedHead = LinkedListHelpers.createDummyHeadedDoublyLL(expected, true);
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(expectedHead);

        //Running the Pair Join
        pairJoin(dh1, dh2);
        //Printing after Pair Join
        System.out.println("\nYour Output:");
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(dh1);
    }
}
