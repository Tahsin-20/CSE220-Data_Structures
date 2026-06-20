package LabQuiz_Solve;
//Lab Quiz-3
public class QueensAge {
    public static void main(String[]args){
        int [][]mat={{50,45,90,35},
                     {70,80,60,95},
                     {40,30,25,75}};
        
        int[]col=new int[mat[0].length];
        int[]row=new int[mat.length];
        int count=0;

        for (int i = 0; i < row.length; i++) {
            for (int j = 0; j < col.length; j++) {
                row[i] += mat[i][j];
                col[j] += mat[i][j];
            }
        }

        int row_ind=0;
        for (int i = 1; i < row.length; i++) {
            if (row[i] < row[row_ind]) {
                row_ind=i;
            }
        }
        int col_ind=0;
        for (int i = 1; i < col.length; i++) {
            if (col[i] < col[col_ind]) {

                col_ind=i;
            }
        }
        System.out.println(mat[row_ind][col_ind]);
    }
}
