package SlideProblem_Solve;
public class Rotate90_AntiClockwise {
    public static void main(String[]args){
        int[][]mat={{1,2,3},
                    {4,5,6},
                    {7,8,9}};

        int [] [] newmat=new int[mat.length][mat[0].length];

        int row=0;
        for(int i=mat[0].length-1; i>=0; i--){
            int col=0;
            for(int j=0; j<mat.length; j++){
                newmat[row][col]=mat[j][i];
                col++;
            }
            row++;
        }
        for(int i=0; i<newmat.length; i++){
            for(int j=0; j<newmat[0].length; j++){
                System.out.print(newmat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
