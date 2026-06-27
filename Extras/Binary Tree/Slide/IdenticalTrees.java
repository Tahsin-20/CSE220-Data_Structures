package RFTS_Slide;
public class IdenticalTrees {

    public static class Node {
        int data;
        Node left, right;
        Node(int data) { this.data = data; }
    }

    // YOU WILL IMPLEMENT THIS
    public static boolean areIdentical(Node root1, Node root2) {
        if(root1==null && root2==null){
            return true;
        }
        if(root1 ==null || root2==null){
            return false;
        }
        if(root1.data!=root2.data){
            return false;
        }
        boolean left=areIdentical(root1.left, root2.left);
        boolean right=areIdentical(root1.right, root2.right);
        return left&&right;
    }

    public static void main(String[] args) {
        // Build tree 1
        Node a1 = new Node(1);
        a1.left = new Node(2);
        a1.right = new Node(3);

        // Build tree 2
        Node a2 = new Node(1);
        a2.left = new Node(2);
        a2.right = new Node(3);

        System.out.println(areIdentical(a1, a2));
    }
}
