package Lab_Quiz1;

public class MaxTreasureBST {

    // ---------- Node class ----------
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    // ---------- Result class ----------
    static class Result {
        int sum;
        String path;

        Result(int s, String p) {
            sum = s;
            path = p;
        }
    }

    static int maxSum = Integer.MIN_VALUE;
    static String bestPath = "";

public static Result maxTreasure(Node root) {
    helper(root, 0, "");
    return new Result(maxSum, bestPath);
}

public static void helper(Node root, int sum, String path) {

    if (root == null) {
        return;
    }

    sum += root.data;
    path += root.data + "->";

    if (root.left == null && root.right == null) {
        if (sum > maxSum) {
            maxSum = sum;
            bestPath = path;
        }
        return;
    }

    helper(root.left, sum, path);
    helper(root.right, sum, path);
}

    

    // ---------- Driver code ----------
    public static void main(String[] args) {

        /*
                20
               /  \
             10    30
            /  \     \
           5   15     40
        */

        Node root = new Node(20);
        root.left = new Node(10);
        root.right = new Node(30);

        root.left.left = new Node(5);
        root.left.right = new Node(15);

        root.right.right = new Node(40);

        Result res = maxTreasure(root);

        System.out.println(res.path); // 20->30->40
        System.out.println(res.sum);
    }
}
