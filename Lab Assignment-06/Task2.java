//Before starting to work on this design the Tree in the Tester code 
// Complete the sumOfLeaves method
public class Task2 {

    //===================================TASK#2===================================
    // This method takes only 2 parameters
    // 1st one is root
    // 2nd one is an Integer
    // You'll need to find the path from the root to a node containing the Integer
    // return the path as a String
    public static String findPath( BSTNode root, Integer key ){
        if(root==null){
            return "No Path Found";
        }
        if(key==root.elem){
            return root.elem+" ";
        }
        if(key<root.elem){
            String left=findPath(root.left, key);
            if(!left.equals("No Path Found")){
                return root.elem+" "+left;
            }
        }
        if(key>root.elem){
            String right=findPath(root.right, key);
            if(!right.equals("No Path Found")){
                return root.elem+" "+right;
            }
        }
        return "No Path Found";
    }
    //============================================================================

}
