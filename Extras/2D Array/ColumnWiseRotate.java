package SlideProblem_Solve;
public class ColumnWiseRotate {
    public static void main(String[]args){
        int[][]mat={{1,2,3},
                    {4,5,6},
                    {7,8,9}};
        
        for(int i=0; i<mat.length; i++){
            for(int j=mat[0].length-1; j>0; j--){
                int temp=mat[i][j];
                mat[i][j]=mat[i][j-1];
                mat[i][j-1]=temp;          
            }
        }
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}

