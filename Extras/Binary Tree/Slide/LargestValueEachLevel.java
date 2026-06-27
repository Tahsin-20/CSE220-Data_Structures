package RFTS_Slide;

public class LargestValueEachLevel {

    // ---------- Node ----------
    public static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    // ---------- YOU WILL COMPLETE THIS ----------
    // recursively finds and prints max at each level
    public static void printMaxEachLevel(Node root) {
        Integer[]arr=new Integer[5];
        fillLargest(root, arr, 0);

        int i=0;
        while(arr[i]!=null){
            System.out.println(arr[i]);
            i++;
        }
    }
    public static void fillLargest(Node root, Integer[]arr, int lvl){

        if(root==null) return;
        int val=root.data;

        if(arr[lvl]==null){
            arr[lvl]=val;
        }
        else if(val>arr[lvl]){
            arr[lvl]=val;
        }
        fillLargest(root.left, arr, lvl+1);
        fillLargest(root.right, arr, lvl+1);
    }
    // ---------- DRIVER ----------
    public static void main(String[] args) {

        /*
                5
               / \
              1   9
                 / \
                7  12
        */

        Node root = new Node(5);
        root.left = new Node(1);
        root.right = new Node(9);
        root.right.left = new Node(7);
        root.right.right = new Node(12);

        printMaxEachLevel(root);
    }
}
