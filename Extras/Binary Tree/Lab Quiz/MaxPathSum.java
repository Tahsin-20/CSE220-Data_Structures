package Lab_Quiz2BT;

public class MaxPathSum {

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
    public static int max_path_sum(Node root) {
    if (root == null) {
        return 0;
    }
    if (root.left == null && root.right == null) {
        return root.data;
    }
    int leftSum = max_path_sum(root.left);
    int rightSum = max_path_sum(root.right);

    if (leftSum > rightSum) {
        return root.data + leftSum;
    } else {
        return root.data + rightSum;
    }
    }

    // ---------- Driver ----------
    public static void main(String[] args) {

        /*
                1
               / \
              7   9
             / \   \
            2   6   9
               / \   \
              5  11   5
        */

        Node root = new Node(1);

        root.left = new Node(7);
        root.right = new Node(9);

        root.left.left = new Node(2);
        root.left.right = new Node(6);

        root.left.right.left = new Node(5);
        root.left.right.right = new Node(11);

        root.right.right = new Node(9);
        root.right.right.right = new Node(5);

        int result = max_path_sum(root);
        System.out.println(result); // Expected: 25
    }
}

