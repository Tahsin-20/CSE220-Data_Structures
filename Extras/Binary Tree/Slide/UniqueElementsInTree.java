package RFTS_Slide;

public class UniqueElementsInTree {

    // ---------- Node Class ----------
    public static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    // ---------- METHOD YOU WILL COMPLETE ----------
    // Use ONLY recursion (NO Set, NO Array, NO List)
    public static void printUnique(Node root, Node fullTree) {
        helper(root, fullTree);
    }
    public static void helper(Node root, Node curr){
        if(curr==null) return;
    
    int c=count(root,curr.data);
    if(c==1){
        System.out.print(curr.data+" ");
    }
    helper(root,curr.left);
    helper(root,curr.right);
    }
    public static int count(Node root, int value){
        if(root==null) return 0;

        int c=0;
        if(root.data==value){
            c=1;
        }
        c+=count(root.left, value);
        c+=count(root.right,value);
        return c;
    }

    // ---------- DRIVER CODE ----------
    public static void main(String[] args) {

        /*
                10
               /  \
              5   15
             /      \
            5       20
        */

        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(5);
        root.right.right = new Node(20);

        System.out.print("Unique elements: ");
        printUnique(root, root);
    }
}


