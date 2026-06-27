package Lab_Quiz1;

public class StrangeFunctionTree {

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

    // ---------- YOU WILL IMPLEMENT THIS ----------
    public static void strangeFunc(Node root, int k) {
        if(root.left==null || root.right==null){
            return;
        }
        if(root.data%k==0){
            root.data=Math.abs(root.left.data-root.right.data);
        }
        else if(root.data%k!=0){
            root.data=root.data*2;
        }
        strangeFunc(root.left, k);
        strangeFunc(root.right, k);
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    // --------------------------------------------

    public static void main(String[] args) {

        /*
                Sample Tree

                        2
                      /   \
                     3     5
                    / \   / \
                   6   7 8   9
                  /     / \   \
                10    11  12  14
        */

        Node root = new Node(2);

        root.left = new Node(3);
        root.right = new Node(5);

        root.left.left = new Node(6);
        root.left.right = new Node(7);

        root.left.left.left = new Node(10);

        root.right.left = new Node(8);
        root.right.right = new Node(9);

        root.right.left.left = new Node(11);
        root.right.left.right = new Node(12);

        root.right.right.right = new Node(14);

        int k = 3;

        inorder(root);
        // Call your method
        strangeFunc(root, k);
        System.out.println();

        inorder(root);
    }
}

