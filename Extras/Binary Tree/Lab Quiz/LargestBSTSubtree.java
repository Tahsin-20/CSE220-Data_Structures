package Lab_Quiz1;

public class LargestBSTSubtree {

    // ---------- Node class ----------
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // ---------- METHOD YOU WILL IMPLEMENT ----------
    // This method should return the size of the largest BST subtree
    public static int largestBST(Node root) {
        if (root == null)
            return 0;

        // If current subtree is BST, return its size
        if (isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE))
            return size(root);

        // Otherwise check left and right
        return Math.max(
            largestBST(root.left),
            largestBST(root.right)
        );
    }
    public static boolean isBST(Node root, int min, int max) {
        if (root == null)
            return true;

        if (root.data <= min || root.data >= max)
            return false;

        return isBST(root.left, min, root.data)
            && isBST(root.right, root.data, max);
    }

    // ---------- Size of a subtree ----------
    public static int size(Node root) {
        if (root == null)
            return 0;

        return 1 + size(root.left) + size(root.right);
    }
    // ---------- Driver code ----------
    public static void main(String[] args) {

        /*
              4
            /   \
          10     20
         /  \   /  \
        5   12 17  24
              \
               13
        */

        Node root = new Node(4);

        root.left = new Node(10);
        root.right = new Node(20);

        root.left.left = new Node(5);
        root.left.right = new Node(12);
        root.left.right.right = new Node(13);

        root.right.left = new Node(17);
        root.right.right = new Node(24);

        int result = largestBST(root);
        System.out.println(result);
    }
}

