public class AssignmentTask7 {

    //SUBMIT ONLY THIS METHOD
    public static void rangeMove(DNode dh, int start, int end) {
        DNode temp=dh.next;
        DNode lastNode=dh.next;

        while(lastNode.next!=dh){
            lastNode=lastNode.next;
        }

        /*Jotokhon na defined lastNode porjonto jabe totokhon loop
        cholbe karon lastNode define na korle infinite loop chole ashbe range
        er element gulo last e giye add hocchei*/
        while(temp!=lastNode){
            DNode t=temp.next;
            if((Integer)(temp.elem)<=end && (Integer)(temp.elem)>=start){

                temp.prev.next=temp.next; // X->3
                temp.next.prev=temp.prev; //X<-3
                temp.prev=dh.prev; //4<-5
                dh.prev.next=temp; //4->5
                temp.next=dh; //5->X
                dh.prev=temp; //X<-5
            }
            temp=t;
        }
    }

    //DO NOT SUBMIT THE DRIVER CODE BELOW
    //SUBMITTING IT WILL INCREASE YOUR PLAG % FOR NO REASON
    public static void main(String[] args) {
        Object[] values = {5, 3, 7, 1, 9, 6, 2, 4};
        DNode dh = LinkedListHelpers.createDummyHeadedDoublyLL(values, true);

        System.out.println("Given Linked List:");
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(dh);

        System.out.println("\nExpected Output:");
        Object[] expected = {3, 1, 9, 2, 4, 5, 7, 6};
        DNode expectedHead = LinkedListHelpers.createDummyHeadedDoublyLL(expected, true);
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(expectedHead);
        
        //Running the Range Move with [5,7] range 
        rangeMove(dh, 5, 7);
        //Printing after Range Move
        System.out.println("\nYour Output:");
        LinkedListHelpers.printDummyHeadedDoublyCircularLL(dh);
    }
}
