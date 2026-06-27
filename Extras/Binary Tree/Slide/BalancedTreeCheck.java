package RFTS_Slide;

public class BalancedTreeCheck {

    public static class Node {
        int data;
        Node left, right;
        Node(int data) { this.data = data; }
    }

    // YOU WILL IMPLEMENT THIS
    public static boolean isBalanced(Node root) {
        if(root==null){
            return false;
        }
        int lh=height(root.left);
        int rh=height(root.right);
        if(Math.abs(lh-rh)>1){
            return true;
        }
        boolean left=isBalanced(root.left);
        boolean right=isBalanced(root.right);

        return left&right;
    }
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int left=height(root.left);
        int right=height(root.right);
        return heighthelper(left,right);
    }
    public static int heighthelper(int left, int right){
        int max;
        if(left>right){
            max=left;
        }
        else{
            max=right;
        }
        return max+1;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.right = new Node(5); // unbalanced

        System.out.println(isBalanced(root));
    }
}

