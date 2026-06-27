package Lab_Quiz2;
public class BSTEnergyCalculator {

    // ===== BST Node =====
    static class BSTNode {
        int data;
        BSTNode left;
        BSTNode right;

        BSTNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // ===== YOU WILL WRITE THIS METHOD =====
    public static int calculate_energy(BSTNode root, int destination) {
        if(root==null){
            return -1;
        }
        int result=0;
        if(result==-1){
            return -1;
        }
        if(root.data==destination){
            return root.data;
        }
        if(destination<root.data){
            result=calculate_energy(root.left, destination);
        }
        else{
            result=calculate_energy(root.right, destination);
        }
        return root.data*result;
    }

    // ===== Driver Code =====
    public static void main(String[] args) {

        /*
                 30
               /    \
             15      40
            /  \    /  \
           9   20  35  45
          /
         7
               /
              32
        */

        BSTNode root = new BSTNode(30);

        root.left = new BSTNode(15);
        root.right = new BSTNode(40);

        root.left.left = new BSTNode(9);
        root.left.right = new BSTNode(20);

        root.left.left.left = new BSTNode(7);

        root.right.left = new BSTNode(35);
        root.right.right = new BSTNode(45);

        root.right.left.left = new BSTNode(32);

        int destination = 35;

        int result = calculate_energy(root, destination);

        if (result == -1) {
            System.out.println("route does not exist");
        } else {
            System.out.println("Product = " + result);
        }
    }
}
