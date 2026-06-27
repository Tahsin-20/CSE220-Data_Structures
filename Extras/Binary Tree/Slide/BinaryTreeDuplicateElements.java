package RFTS_Slide;

public class BinaryTreeDuplicateElements {

    public static class Node {
        int data;
        Node left, right;
        Node(int data) { this.data = data; }
    }

    // YOU WILL IMPLEMENT THIS
    public static void hasDuplicate(Node root){
    findDuplicatesHelper(root, root);
}


private static void findDuplicatesHelper(Node root, Node curr){
    if (curr == null) return;

    int c=count(root, curr.data);
    if (c>1) {
        System.out.print(curr.data + " ");
    }

    findDuplicatesHelper(root, curr.left);
    findDuplicatesHelper(root, curr.right);
}
public static int count(Node root, int value) {       
    if (root == null) return 0;

    int c = 0;
    if (root.data==value) {
        c = 1;
    }
    c+=count(root.left, value);
    c+=count(root.right, value);
    return c;
}

    public static void main(String[] args) {
        Node root = new Node(7);
        root.left = new Node(3);
        root.right = new Node(7);
        root.left.left = new Node(3); // duplicate

        hasDuplicate(root);
    }
}

