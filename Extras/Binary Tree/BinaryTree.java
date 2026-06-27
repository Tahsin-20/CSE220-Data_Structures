package Basic;
import java.util.*;

public class BinaryTree {

    // Node class
    static class Node {
        int key;
        Node left, right;

        Node(int item) {
            key = item;
            left = right = null;
        }
    }

    Node root; // Root of the tree

    public BinaryTree() {
        root = null;
    }

    // ---------- Level Order Traversal ----------
    public void levelOrderTraversal(Node root) {
        if (root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();
            while (size-- > 0) {
                Node curr = q.remove();
                System.out.print(curr.key + " ");
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
            System.out.println();
        }
    }
    public void levelOrderTraversal() { levelOrderTraversal(root); }


    // ---------- Preorder ----------
    public void preOrderTraversal(Node root) {
        if (root == null) return;
        System.out.print(root.key + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    public void preOrderTraversal() { preOrderTraversal(root); }


    // ---------- Inorder ----------
    public void inOrderTraversal(Node root) {
        if (root == null) return;
        inOrderTraversal(root.left);
        System.out.print(root.key + " ");
        inOrderTraversal(root.right);
    }
    public void inOrderTraversal() { inOrderTraversal(root); }


    // ---------- Postorder ----------
    public void postOrderTraversal(Node root) {
        if (root == null) return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.key + " ");
    }
    public void postOrderTraversal() { postOrderTraversal(root); }


    // ---------- Total Nodes ----------
    public int totalNodes(Node root) {
        if(root==null){
            return 0;
        }
        int left=totalNodes(root.left);
        int right=totalNodes(root.right);
        return left+right+1;
    }
    public int totalNodes() { return totalNodes(root); }


    // ---------- Height ----------
    public int heightt(Node root) {
        if(root==null){
            return 0;
        }
        int left=heightt(root.left);
        int right=heightt(root.right);
        return heighthelper(left, right);
    }
    public int heighthelper(int left, int right){
        int max;
        if(left>right){
            max=left;
        }
        else{
            max=right;
        }
        return max+1;
    }
    public int heightt() { return heightt(root); }


    // ---------- Level of a Node (root at level 1) ----------
    public int findLevelOfNode(Node root, int key, int level) {
        if(root==null){
            return -1;
        }
        if(root.key==key){
            return level;
        }
        int left=findLevelOfNode(root.left, key, level+1);
        int right=findLevelOfNode(root.right, key, level+1);

        if(left!=-1)return left;
        return right;
    }
    public int findLevelOfNode(int key) { return findLevelOfNode(root, key, 0); }


    // ---------- Depth (root at depth 0) ----------
    public int findDepthOfNode(Node root, int key, int depth) {
        if(root==null){
            return -1;
        }
        if(root.key==key){
            return depth;
        }
        int leftdepth=findDepthOfNode(root.left, key, depth+1);
        if(leftdepth!=-1){
            return leftdepth;
        }
        return findDepthOfNode(root.right, key, depth+1);
    }
    public int findDepthOfNode(int key) { return findDepthOfNode(root, key, 0); }


    // ---------- Max value ----------
    public int findMax(Node root) {
        if(root==null){
            return Integer.MIN_VALUE;
        }
        int leftMax=findMax(root.left);
        int rightMax=findMax(root.right);

        int max=root.key;
        if(leftMax>max){
            max=leftMax;
        }
        if(rightMax>max){
            max=rightMax;
        }
        return max;
    }
    public int findMax() { return findMax(root); }


    // ---------- Sum of nodes ----------
    public int sumOfNodes(Node root) {
        if(root==null){
            return 0;
        }
        int sum=0;
        sum+=root.key;
        sum+=sumOfNodes(root.left);
        sum+=sumOfNodes(root.right);
        return sum;
    }
    public int sumOfNodes() { return sumOfNodes(root); }


    // ---------- Leaf count ----------
    public int leafCount(Node root) {
        if(root==null){
            return 0;
        }
        int count=0;
        if(root.left==null && root.right==null){
            return count+1;
        }
        count+=leafCount(root.left);
        count+=leafCount(root.right);
        return count;
    }
    public int leafCount() { return leafCount(root); }


    // ---------- Diameter ----------
    public static int diameter(Node root) {
    if (root == null) return 0;

    int throughRoot = height(root.left) + height(root.right) + 1;  
    int leftDiameter = diameter(root.left);           
    int rightDiameter = diameter(root.right);      

    return max(throughRoot, leftDiameter, rightDiameter);
    }

    public static int height(Node root) {
       if (root == null) return 0;

       return Math.max(height(root.left), height(root.right)) + 1;
    }

    public static int max(int a, int b, int c){
       return Math.max(a, Math.max(b, c));
    }
    public int diameter() { return diameter(root); }


    // ---------- Main ----------
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Create sample tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.left.left = new Node(8);
        tree.root.left.left.left.left = new Node(17);
        tree.root.left.right = new Node(5);
        tree.root.left.right.right = new Node(10);
        tree.root.left.right.right.right = new Node(11);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        // Test the methods
        tree.levelOrderTraversal();
        tree.preOrderTraversal();
        System.out.println();
        tree.inOrderTraversal();
        System.out.println();
        tree.postOrderTraversal();
        System.out.println();

        System.out.println("Total nodes: " + tree.totalNodes());
        System.out.println("Height: " + tree.heightt());
        System.out.println("Level of node 5: " + tree.findLevelOfNode(8));
        System.out.println("Depth of node 5: " + tree.findDepthOfNode(5));
        System.out.println("Max value: " + tree.findMax());
        System.out.println("Sum of nodes: " + tree.sumOfNodes());
        System.out.println("Leaf count: " + tree.leafCount());
        System.out.println("Diameter: " + tree.diameter());
    }
}
