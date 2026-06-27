package Lab_Quiz1;
public class SymmetricFactorDifference {

    // Assume TreeNode class is already defined
    static class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int data) {
            this.data = data;
        }
    }

    // ---------- MAIN METHOD ----------
    public static int symmetricFactorDiff(TreeNode root, TreeNode x) {
        return helper(root.left, root.right);
    }
    public static int helper(TreeNode left, TreeNode right){

        if(left==null || right==null){
            return 0;
        }
        int sum=0;
        if(left.data%right.data==0 || right.data%left.data==0){
            sum+=Math.abs(left.data-right.data);
        }
        sum+=helper(left.left, right.right);
        sum+=helper(left.right, right.left);
        return sum;
    }

    // ---------- Driver code (for understanding) ----------
    public static void main(String[] args) {

        /*
                8
              /   \
             6     12
            / \      \
           3   7      24
        */

        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(6);
        root.right = new TreeNode(12);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.right = new TreeNode(24);

        System.out.println(symmetricFactorDiff(root, root)); // Output: 27
    }
}
