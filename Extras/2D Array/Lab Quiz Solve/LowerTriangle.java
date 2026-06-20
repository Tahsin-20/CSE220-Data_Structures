package LabQuiz_Solve;
//Lab Quiz-4
public class LowerTriangle {
    public static void main(String[]args){
        int[][]mat={{8,2,1},
                    {3,5,4},
                    {6,9,7}};

        for(int i=0; i<mat.length; i++){
            for(int j=i+1;j<mat[0].length; j++){
                mat[j][i]+=mat[i][j];
                mat[i][j]=0;
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
