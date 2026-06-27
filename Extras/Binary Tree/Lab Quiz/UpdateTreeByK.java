package Lab_Quiz2BT;

public class UpdateTreeByK {

    // ---------- Node class ----------
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // ---------- Method to implement ----------
    public static void updateTree(Node t1, Node t2, int k) {
        if(t1==null || t2==null){
            return;
        }
        if(t1.data==t2.data){
            if(t1.data%k==0){
                t1.data=100;
            }
        }
        else{
            t1.data=t1.data+t2.data;
        }
        updateTree(t1.left, t2.left, k);
        updateTree(t1.right, t2.right, k);
    }
    public static void inorder(Node t1){

        if(t1==null){
            return;
        }
        inorder(t1.left);
        System.out.print(t1.data+" ");
        inorder(t1.right);
    }

    // ---------- Driver ----------
    public static void main(String[] args) {

        int k = 3;

        /*
            Tree1:          Tree2:
               6               6
              / \             / \
             5   9           1   4
            / \             / \
           2   3           2   7
        */

        Node t1 = new Node(6);
        t1.left = new Node(5);
        t1.right = new Node(9);
        t1.left.left = new Node(2);
        t1.left.right = new Node(3);

        Node t2 = new Node(6);
        t2.left = new Node(1);
        t2.right = new Node(4);
        t2.left.left = new Node(2);
        t2.left.right = new Node(7);

        updateTree(t1, t2, k);

        // After update, t1 root should be 100
        System.out.println(t1.data);
        inorder(t1);
    }
}

