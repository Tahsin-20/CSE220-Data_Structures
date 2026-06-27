package Lab_Quiz2;

public class BSTMirrorMultiply {

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
    public static String mirror_multiply(BSTNode root, int x) {
        return helper (root, root, x);
    }
    public static String helper(BSTNode n1, BSTNode n2, int elem){

        if(n1==null || n2==null){
            return "No Mirror Found";
        }

        if(n1.data==elem){
            String b="";
            return b+=n2.data*n1.data;
        }
        if(n1.data>elem){
            return helper(n1.left, n2.right, elem);
        }
        else{
            return helper(n1.right, n2.left, elem);
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

        System.out.println(mirror_multiply(root, 5)); // 75
        System.out.println(mirror_multiply(root, 7)); // 84
        System.out.println(mirror_multiply(root, 3)); // No Mirror Found
    }
}

