package RFTS_Slide;

public class OccurrenceInTree {

    public static class Node {
        int data;
        Node left, right;
        Node(int data) { this.data = data; }
    }

    // YOU WILL IMPLEMENT THIS
    public static int countOccurrence(Node root, int target) {
        return count(root,target);
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

    public static void main(String[] args) {
        Node root = new Node(7);
        root.left = new Node(0);
        root.right = new Node(8);
        root.right.right = new Node(7);

        System.out.println(countOccurrence(root, 7));
    }
}

