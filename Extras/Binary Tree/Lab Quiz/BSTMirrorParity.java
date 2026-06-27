package Lab_Quiz2;

public class BSTMirrorParity {

    // ===== BST Node =====
    static class BSTNode {
        int data;
        BSTNode left;
        BSTNode right;

        BSTNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // ===== YOU WILL WRITE THIS METHOD =====
    public static String mirror_parity(BSTNode root, int x) {
        return helper(root, root, x);
    }
    public static String helper(BSTNode founder, BSTNode mirrornode, int elem){

        if(founder==null || mirrornode==null){
            return "No Mirror Found";
        }
        if(founder.data==elem){
            if(mirrornode.data%2==0){
                return "Even";
            }
            else{
                return "Odd";
            }
        }
        if(founder.data>elem){
            return helper(founder.left, mirrornode.right, elem);
        }
        else{
            return helper(founder.right, mirrornode.left, elem);
        }
    }

    // ===== Driver Code =====
    public static void main(String[] args) {

        /*
                 10
               /    \
              5      15
             / \    /  \
            2   7  12  18
                 /
                3
        */

        BSTNode root = new BSTNode(10);

        root.left = new BSTNode(5);
        root.right = new BSTNode(15);

        root.left.left = new BSTNode(2);
        root.left.right = new BSTNode(7);

        root.right.left = new BSTNode(12);
        root.right.right = new BSTNode(18);

        root.left.right.left = new BSTNode(3);

        System.out.println(mirror_parity(root, 5)); // Odd
        System.out.println(mirror_parity(root, 7)); // Even
        System.out.println(mirror_parity(root, 3)); // No Mirror Found
    }
}

