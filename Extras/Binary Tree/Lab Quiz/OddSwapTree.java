package Lab_Quiz2BT;

// File: OddSwapTree.java
public class OddSwapTree {

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
    public static void OddSwap(Node root) {
        helper(root.left, root.right, 1);
    }
    public static void helper(Node root1, Node root2, int level){

        if(root1==null || root2==null){
            return;
        }
        if(level%2!=0){
            if(root1.elem<root2.elem){
                int temp=root1.elem;
                root1.elem=root2.elem;
                root2.elem=temp;
            }
        }
        helper(root1.left, root1.right, level+1);
        helper(root2.left, root2.right, level+1);
    }
    public static void inorder(Node root){

        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.elem+" ");
        inorder(root.right);
    }

    // -------- Driver code --------
    public static void main(String[] args) {

        /*
               5
              / \
             3   8
            / \
           1   6
        */

        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(8);
        root.left.left = new Node(1);
        root.left.right = new Node(6);

        // Call your method
        OddSwap(root);
        inorder(root);

        // You may print the tree after swapping (optional)
    }
}

