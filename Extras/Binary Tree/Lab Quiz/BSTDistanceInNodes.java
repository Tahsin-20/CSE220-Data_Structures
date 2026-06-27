package Lab_Quiz2;

public class BSTDistanceInNodes {

    // ---------- Node class ----------
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // ---------- Method YOU will implement ----------
    public static int distance_in_nodes(Node root, int x, int y) {

        if(x==y) return 1;
        if(search(root,x)==false || search(root,y)==false){
            return -1;
        }
        Node lca=helper1(root, x, y);
        int left=helper2(lca, x,0);
        int right=helper2(lca, y,0);
        return (left+right)+1;
    }
    public static Node helper1(Node root, int x, int y){

        if(root==null){
            return null;
        }

        if(root.data>x && root.data>y){
            return helper1(root.left, x, y);
        }
        if(x>root.data && y>root.data){
            return helper1(root.right, x, y);
        }

        return root;
    }
    public static int helper2(Node root, int x, int count){

        if(root==null){
            return -1;
        }
        if(root.data==x){
            return count;
        }
        int left=helper2(root.left, x, count+1);

        if(left!=-1){
            return left;
        }
        return helper2(root.right, x, count+1);
    }
    public static boolean search(Node root, int key) {

    if (root == null) return false;

    if (root.data == key) return true;

    if (key < root.data)
        return search(root.left, key);
    else
        return search(root.right, key);
    }

    // ---------- Driver code ----------
    public static void main(String[] args) {

        /*
                  20
                /    \
              10      30
             /  \    /  \
            5   15  25  40
           / \        \
          3   7        27
        */

        Node root = new Node(20);

        root.left = new Node(10);
        root.right = new Node(30);

        root.left.left = new Node(5);
        root.left.right = new Node(15);

        root.left.left.left = new Node(3);
        root.left.left.right = new Node(7);

        root.right.left = new Node(25);
        root.right.right = new Node(40);

        root.right.left.right = new Node(27);

        // Sample calls
        System.out.println(distance_in_nodes(root, 5, 15));  // expected 3
        System.out.println(distance_in_nodes(root, 3, 27));  // expected 7
        System.out.println(distance_in_nodes(root, 10, 10)); // expected 1
        System.out.println(distance_in_nodes(root, 7, 99));  // expected -1
    }
}

