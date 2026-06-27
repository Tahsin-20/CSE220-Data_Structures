package RFTS_Slide;
public class BuildKeyTree {

    // ===== Node Class =====
    static class Node {
        String elem;
        Node left;
        Node right;

        Node(String elem) {
            this.elem = elem;
            this.left = null;
            this.right = null;
        }
    }

    // ===== Binary Tree Class =====
    static class BinaryTree {
        Node root;

        BinaryTree() {
            root = null;
        }

        // You will implement this method:
        public String build_key(Node node) {
            return helper(root, 0);
        }
        public String helper(Node root, int lvl){

            if(root==null){
                return "";
            }
            String str="";
            if(lvl%2==0 && (root.left==null && root.right==null)){
                str+=root.elem;
            }
            
            str+=helper(root.right, lvl+1);
            str+=helper(root.left, lvl+1);

            return str;
        }
    }

    // ===== Main to test =====
    public static void main(String[] args) {

        BinaryTree bt = new BinaryTree();

        /* Example tree (same as question) */

        bt.root = new Node("U");

        bt.root.left = new Node("V");
        bt.root.right = new Node("W");

        bt.root.left.left = new Node("X");
        bt.root.left.right = new Node("Y");

        bt.root.right.left = new Node("Z");
        bt.root.right.right = new Node("I");

        bt.root.left.left.left = new Node("J");
        bt.root.left.left.right = new Node("N");

        bt.root.left.left.left.left = new Node("K");

        bt.root.right.left.left = new Node("L");
        bt.root.right.left.right = new Node("M");

        // Call your function
        String result = bt.build_key(bt.root);

        System.out.println(result);
    }
}
