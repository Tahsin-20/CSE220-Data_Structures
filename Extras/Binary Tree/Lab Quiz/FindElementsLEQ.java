package Lab_Quiz2;

public class FindElementsLEQ {

    // =========================
    //        TreeNode Class
    // =========================
    static class TreeNode {
        int element;
        TreeNode left;
        TreeNode right;

        TreeNode(int element) {
            this.element = element;
            this.left = null;
            this.right = null;
        }
    }

    // ==================================================
    //  METHOD TO IMPLEMENT (DO NOT CHANGE SIGNATURE)
    // ==================================================
    public static String find_elements_leq(TreeNode root, int target) {
        
        if(root==null){
            return "";
        }
        String a="";
        
        if(root.element>target){
            return find_elements_leq(root.left, target);
        }
        else{
            a+=root.element+" ";
            a+=find_elements_leq(root.left, target);
            a+=find_elements_leq(root.right, target);
            return a;
        }
    }

    // =========================
    //        Driver Code
    // =========================
    public static void main(String[] args) {

        /*
                BST used in sample:

                        10
                       /  \
                      5    15
                     / \
                    2   7
         */

        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);

        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(7);

        int target = 15;

        System.out.println(find_elements_leq(root, target));
        // Expected output format (preorder):
        // 10 5 2 7
    }
}

