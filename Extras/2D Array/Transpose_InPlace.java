package PractiseSheet_Solve;
//Ques:7
public class Transpose_InPlace {
    public static void main(String[]args){
        int[][]mat={{1,2,3},
                    {4,5,6},
                    {7,8,9}};
                    
        for(int i=0; i<mat.length; i++){
            for(int j=i+1; j<mat[0].length; j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
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
