package Lab_Quiz2;

public class SmallestSumBST {

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

    // ==================================================
    //  METHOD TO IMPLEMENT (DO NOT CHANGE SIGNATURE)
    // ==================================================
    static int count;
    static int sum;
    public static int smallest_sum(Node root, int k) {
        count=0;
        sum=0;
        helper(root, k);
        return sum;
    }
    public static void helper(Node root, int min){

        if(root==null){
            return;
        }
        if(count==min){
            return;
        }
        helper(root.left, min);

        if(count<min){
            sum+=root.val;
            count++;
        }
        helper(root.right, min);
    }

    // =========================
    //        Driver Code
    // =========================
    public static void main(String[] args) {

        /*
                Example BST used in the problem:

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

        // Sample test calls
        System.out.println(smallest_sum(root, 3)); // Expected: 8
        System.out.println(smallest_sum(root, 5)); // Expected: 21
        System.out.println(smallest_sum(root, 6)); // Expected: 29
    }
}

