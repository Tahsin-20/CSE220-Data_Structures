//Assignment Task (must Submit)
// Complete the isBST method
public class Task6 {

    //===================================TASK#6======================
    // This method takes only one parameter
    // it is root of the given tree
    // You can use extra helper private static methods as per need
    public static Boolean isBST( BSTNode root ){
        
        if(root.left==null){
            if(root.right==null){
                return true;
            }
            else if(root.elem<root.right.elem){
                return true;
            }
        }


        else if(root.right==null){
            if(root.left==null){
                return true;
            }
            else if(root.elem>root.left.elem){
                return true;
            }
        }


        else if(root.left.elem<root.elem && root.right.elem>root.elem){
            boolean left=isBST(root.left);
            boolean right=isBST(root.right);
            return left && right;
        }
        return false;
    }
    //===============================================================


}
