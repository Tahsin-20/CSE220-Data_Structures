package Lab_Quiz2;

public class SmallestMulBST {

    // =========================
    //        Node Class
    // =========================
    static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    // =========================
    //   Helper State Variables
    // =========================
    static int count;
    static int product;

    // ==================================================
    //  REQUIRED METHOD
    // ==================================================
    public static int smallest_mul(Node root, int k) {
        count=0;
        product=1;
        helper(root, k);
        return product;
    }
    public static void helper(Node root, int k){

        if(count==k){
            return;
        }
        if(root==null){
            return;
        }
        helper(root.left, k);

        if(count<k){
            product*=root.val;
            count++;
        }
        helper(root.right, k);
    }


    // =========================
    //        Driver Code
    // =========================
    public static void main(String[] args) {

        /*
                Example BST:

                        8
                      /   \
                     3     10
                    / \      \
                   1   6      14
                      / \     /
                     4   7   13
        */

        Node root = new Node(8);
        root.left = new Node(3);
        root.right = new Node(10);

        root.left.left = new Node(1);
        root.left.right = new Node(6);

        root.left.right.left = new Node(4);
        root.left.right.right = new Node(7);

        root.right.right = new Node(14);
        root.right.right.left = new Node(13);

        System.out.println(smallest_mul(root, 3)); // 12
        System.out.println(smallest_mul(root, 4)); // 72
        System.out.println(smallest_mul(root, 6)); // 4032
    }
}

