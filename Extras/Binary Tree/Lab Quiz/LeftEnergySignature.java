package Lab_Quiz2BT;

public class LeftEnergySignature {

    // ---------- Node class ----------
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // ---------- Method to implement ----------
    public static int left_energy_signature(Node root) {
        if(root==null) return 0;

        int sum=0;
        
        if(root.left!=null && root.right==null && root.left.left==null && root.left.right==null){
            sum+=root.data;
        }
        sum+=left_energy_signature(root.left);
        sum+=left_energy_signature(root.right);
        return sum;
    }

    // ---------- Driver ----------
    public static void main(String[] args) {

        /*
              5
             / \
            7   9
           /   / \
          3   2   6
                 /
                5
        */

        Node root = new Node(5);
        root.left = new Node(7);
        root.right = new Node(9);

        root.left.left = new Node(3);

        root.right.left = new Node(2);
        root.right.right = new Node(6);
        root.right.right.left = new Node(5);

        int result = left_energy_signature(root);
        System.out.println(result); // Expected: 13
    }
}

