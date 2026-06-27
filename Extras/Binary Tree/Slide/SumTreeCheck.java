package RFTS_Slide;
public class SumTreeCheck {

    // ---------- Node class ----------
    public static class Node {
        int elem;
        Node left;
        Node right;

        Node(int elem) {
            this.elem = elem;
        }
    }

    // ---------- Binary Tree class ----------
    public static class BinaryTree {
        Node root;

        BinaryTree() { }

        // You will implement this
        public boolean isSumTree(Node root) {
            if(check(root)!=-1){
                return true;
            }
            else{
                return false;
            }
        }
        public int check(Node root){
            if(root==null){
                return 0;
            }
            if(root.left==null && root.right==null){
                return root.elem;
            }
            int left=check(root.left);
            int right=check(root.right);

            if(root.elem==left+right){
                return root.elem+left+right;
            }
            return -1;
        }
    }

    // ---------- Main to test ----------
    public static void main(String[] args) {

        BinaryTree bt = new BinaryTree();

        /*
               26
              /  \
            10    3
           / \     \
          4   6     3
        */

        bt.root = new Node(26);
        bt.root.left = new Node(10);
        bt.root.right = new Node(3);

        bt.root.left.left = new Node(4);
        bt.root.left.right = new Node(9);

        bt.root.right.right = new Node(3);

        System.out.println(bt.isSumTree(bt.root));
    }
}