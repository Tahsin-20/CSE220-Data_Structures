package SlideProblem_Solve;
public class Zigzag {
   public static void main(String[]args){
        int[][]mat={{1,2,3},
                    {4,5,6},
                    {7,8,9}};

        for(int g=0; g<mat.length; g++){
            for(int i=0, j=g; j>=0 && i<mat[0].length; j--, i++){
                System.out.print(mat[j][i]+" ");
            }
        }
        for(int g=1; g<=mat.length-1; g++){
            for(int j=mat.length-1, i=g; j>=0 && i<mat[0].length; j--, i++){
                System.out.print(mat[j][i]+" ");
            }
        }
    } 
}
