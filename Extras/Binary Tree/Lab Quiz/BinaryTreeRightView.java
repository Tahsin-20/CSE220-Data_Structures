package Lab_Quiz1;

public class BinaryTreeRightView {

    // ===== Binary Tree Node =====
    static class BTNode {
        int data;
        BTNode left;
        BTNode right;

        BTNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static int max_level=-1;
    public static void RightView(BTNode root, int level) {
        if (root == null) {
            return;
        }
        if (level > max_level) {
            System.out.print(root.data + " ");
            max_level = level;
        }
        RightView(root.right, level + 1);
        RightView(root.left, level + 1);
    }

    // ===== Driver Code =====
    public static void main(String[] args) {

        BTNode root = new BTNode(4);

        root.left = new BTNode(0);
        root.right = new BTNode(3);

        root.left.left = new BTNode(2);
        root.right.right = new BTNode(9);

        root.left.left.right = new BTNode(8);
        root.left.left.right.left = new BTNode(6);
        root.left.left.right.right = new BTNode(1);

        root.right.right.left = new BTNode(5);


        RightView(root, 0);
    }
}

