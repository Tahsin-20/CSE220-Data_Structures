package RFTS_Slide;

public class ChildrenSumProperty {

    public static class Node {
        int data;
        Node left, right;
        Node(int data) { this.data = data; }
    }

    // YOU WILL IMPLEMENT THIS
    public static boolean checkChildrenSum(Node root) {
        return helper(root);
    }
    public static boolean helper(Node root){
        if(root.left==null && root.right==null){
            return true;
        }
        int sum=0;
        if(root.left!=null){
            sum+=root.left.data;
        }
        if(root.right!=null){
            sum+=root.right.data;
        }
        return (root.data == sum) && helper(root.left) && helper(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(3);
        root.right = new Node(7); // valid

        System.out.println(checkChildrenSum(root));
    }
}

