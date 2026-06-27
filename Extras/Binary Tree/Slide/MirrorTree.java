package RFTS_Slide;

public class MirrorTree {

    public static class Node {
        int data;
        Node left, right;
        Node(int data) { this.data = data; }
    }

    // YOU WILL IMPLEMENT THIS
    public static Node mirror(Node root) {
        if(root==null) return null;
        Node temp=root.left;
        root.left=root.right;
        root.right=temp;
        mirror(root.left);
        mirror(root.right);
        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root = mirror(root);
        System.out.println(root.left.data);
    }
}

