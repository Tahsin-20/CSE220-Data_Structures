//Assignment Task (must Submit)
// Complete the sumOfLeaves method
public class Task5 {

    //===================================TASK#5======================
    // This method takes only one parameter
    // it is root of the given tree
    // You can use extra helper private static methods as per need
    public static Integer mirrorSum( BSTNode root ){
        return helper(root.left, root.right);
    }
    private static int helper(BSTNode left, BSTNode right){


        if(left==null){
            return 0;
        }


        if(right==null){
            return 0;
        }


        int mirrorsum=0;
        mirrorsum=left.elem+right.elem;


        int a=helper(left.left, right.right);
        int b=helper(left.right, right.left);
        mirrorsum+=(a+b);
        return mirrorsum;
    }
    //===============================================================


}
