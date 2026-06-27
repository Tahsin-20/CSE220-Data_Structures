package Lab_Quiz2;

public class BSTProductGreaterThanK {

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
    public static int productGreaterThanK(Node root, int k) {
        
        if(root==null){
            return 1;
        }
        int prod=1;
        if(root.data<=k){
            return productGreaterThanK(root.right, k);
        }

        else{
            prod*=root.data;
            prod*=productGreaterThanK(root.left, k);
            prod*=productGreaterThanK(root.right, k);
        }
        return prod;
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
        System.out.println(productGreaterThanK(root, 15));  // expected 16200000
        System.out.println(productGreaterThanK(root, 25));  // expected 32400
        System.out.println(productGreaterThanK(root, 35));  // expected 40
        System.out.println(productGreaterThanK(root, 100)); // expected 1
    }
}

