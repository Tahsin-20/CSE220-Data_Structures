package RFTS_Slide;
public class SecondMaxBinaryTree {

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
        public int second_max(Node root) {
            int [] arr=new int[2];
            arr[0]=root.elem;
            arr[1]=root.elem;

            helper(root,arr);
            return arr[1];
        }
        public static void helper(Node root, int[]arr){
            if(root==null){
                return;
            }
            if(root.elem>arr[0]){
                arr[1]=arr[0];
                arr[0]=root.elem;
            }
            else if(root.elem>arr[1] && root.elem<arr[0]){
                arr[1]=root.elem;
            }
            helper(root.left, arr);
            helper(root.right, arr);
        }
    }

    // ---------- Main to test ----------
    public static void main(String[] args) {

        BinaryTree bt = new BinaryTree();

        /*
            Tree structure:
                   30
                  /  \
                50    10
                /
              40
        */

        bt.root = new Node(30);
        bt.root.left = new Node(50);
        bt.root.right = new Node(10);
        bt.root.left.left = new Node(40);

        // Call your method (after you implement it)
        System.out.println(bt.second_max(bt.root));
    }
}
