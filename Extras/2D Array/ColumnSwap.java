package SlideProblem_Solve;
public class ColumnSwap {
    public static void main(String[]args){
        int [] [] mat={{1,2,3},
                       {4,5,6},
                       {7,8,9}};
        
        int l=0;
        int k=mat[0].length-1;

        while(l<k){
            for(int i=0; i<mat.length; i++){
                int temp=mat[i][l];
                mat[i][l]=mat[i][k];
                mat[i][k]=temp;
            }
            l++;
            k--;
        }

        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
