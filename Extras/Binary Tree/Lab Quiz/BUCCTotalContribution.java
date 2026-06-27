package Lab_Quiz1;

public class BUCCTotalContribution {

    // ---------- BTNode class ----------
    static class BTNode {
        int ID;
        int score;
        BTNode left;
        BTNode right;

        BTNode(int ID, int score) {
            this.ID = ID;
            this.score = score;
            this.left = null;
            this.right = null;
        }
    }

    // ---------- YOU WILL IMPLEMENT THIS METHOD ----------
    public static int totalContribution(BTNode root, int targetID) {
        BTNode r=helper(root, targetID);
        return sum(r);
    }
    public static BTNode helper(BTNode root, int id){

        if(root==null){
            return null;
        }
        if(root.ID==id){
            return root;
        }
        BTNode left=helper(root.left, id);
        if(left!=null){
            return left;
        }
        else{
            return helper(root.right, id);
        }
    }
    public static int sum(BTNode r){
        if(r==null){
            return 0;
        }
        int sum=0;
        sum+=r.score;
        sum+=sum(r.left);
        sum+=sum(r.right);
        return sum;
    }
    // ---------------------------------------------------

    public static void main(String[] args) {

        /*
                    Sample Tree

                            ID=1 (15)
                          /              \
                    ID=2 (10)          ID=3 (8)
                      /     \            /     \
                ID=4 (6)  ID=5 (5)  ID=6 (4)  ID=7 (3)
        */

        BTNode root = new BTNode(1, 15);

        root.left = new BTNode(2, 10);
        root.right = new BTNode(3, 8);

        root.left.left = new BTNode(4, 6);
        root.left.right = new BTNode(5, 5);

        root.right.left = new BTNode(6, 4);
        root.right.right = new BTNode(7, 3);

        // Sample calls
        System.out.println(totalContribution(root, 1)); // expected 51
        System.out.println(totalContribution(root, 2)); // expected 21
    }
}

