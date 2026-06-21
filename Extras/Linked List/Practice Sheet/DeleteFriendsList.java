// File: DeleteFriendsList.java

public class DeleteFriendsList {   // <-- public class matches file name

    class FriendNode {
        int data;
        FriendNode next;

        public FriendNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private FriendNode head;

    public DeleteFriendsList() {
        head = null;
    }

    // Insert at end
    public void insert(int data) {
        FriendNode newNode = new FriendNode(data);

        if (head == null) {
            head = newNode;
            return;
        }

        FriendNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Display list
    public void display() {
        FriendNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Getter
    public FriendNode getHead() {
        return head;
    }

    // Setter
    public void setHead(FriendNode newHead) {
        head = newHead;
    }

    // You will implement this
    public void deleteFriends(int k) {
        
        while(k>0){
            FriendNode curr=head;
            FriendNode prev=null;
            boolean deleted=false;

            while(curr!=null && curr.next!=null){
                if(curr.data<curr.next.data){
                    if(prev==null){
                        head=curr.next;
                    }
                    else{
                        prev.next=prev.next.next;
                    }
                    deleted=true;
                    k--;
                    break;
                }
                prev=curr;
                curr=curr.next;
            }
            if(deleted==false){
                FriendNode p=head;
                while(p.next.next!=null){
                    p=p.next;
                }
                p.next=null;
                k--;
            }
        }
    }

    // Optional tester
    public static void main(String[] args) {
        DeleteFriendsList list = new DeleteFriendsList();

        list.insert(19);
        list.insert(12);
        list.insert(3);
        list.insert(4);
        list.insert(17);

        list.display();

        list.deleteFriends(2); // you implement

        list.display();
    }
}