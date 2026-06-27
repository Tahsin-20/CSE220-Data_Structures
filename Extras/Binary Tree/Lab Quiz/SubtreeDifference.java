package Lab_Quiz2BT;

// File: SubtreeDifference.java
public class SubtreeDifference {

    // -------- Node class --------
    static class Node {
        int elem;
        Node left;
        Node right;

        Node(int elem) {
            this.elem = elem;
            this.left = null;
            this.right = null;
        }
    }

    // -------- Method to implement --------
    // You will write the logic here
    public static int subtree_difference(Node root) {
        int left=helper1(root.left);
        int right=helper2(root.right);
        return Math.abs(left-right);
    }
    public static int helper1(Node root){

        if(root==null){
            return 0;
        }
        int sum=0;
        if(root.elem%2!=0){
            sum+=root.elem;
        }
        sum+=helper1(root.left);
        sum+=helper1(root.right);
        return sum;
    }
    public static int helper2(Node root){

        if(root==null){
            return 0;
        }
        int sum=0;
        if(root.elem%2==0){
            sum+=root.elem;
        }
        sum+=helper2(root.left);
        sum+=helper2(root.right);
        return sum;
    }

    // -------- Driver code --------
    public static void main(String[] args) {

        /*
                 10
                /  \
               5    12
              / \    \
             7   9    2
            /
           5

        */

        Node root = new Node(10);

        root.left = new Node(5);
        root.right = new Node(12);

        root.left.left = new Node(7);
        root.left.right = new Node(9);
        root.left.left.left = new Node(5);

        root.right.right = new Node(2);

        int result = subtree_difference(root);
        System.out.println(result);
    }
}

