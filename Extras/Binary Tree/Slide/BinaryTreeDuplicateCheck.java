package RFTS_Slide;

public class BinaryTreeDuplicateCheck {

    public static class Node {
        int data;
        Node left, right;
        Node(int data) { this.data = data; }
    }

    // YOU WILL IMPLEMENT THIS
    public static boolean hasDuplicate(Node root) {
        return helper(root,root);
    }
    public static boolean helper(Node root, Node curr){
        if(curr==null)return false;

        int c=count(root,curr.data);
        if(c>1){
            return true;
        }
        boolean left=helper(root, curr.left);
        boolean right=helper(root, curr.right);
        return left||right;
    }
    public static int count(Node root, int value){
        if(root==null) return 0;

        int c=0;
        if(root.data==value){
            c++;
        }
        c+=count(root.left, value);
        c+=count(root.right, value);
        return c;
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(8);
        root.right = new Node(7);
        root.left.left = new Node(7); // duplicate

        System.out.print(hasDuplicate(root));
    }
}

