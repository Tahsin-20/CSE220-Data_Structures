package SlideProblem_Solve;
public class UnlockSafe {
    public static void main(String[]args){

        int [] [] lock={{2, 8, 9, 6, 7},
                        {4, 2, 5, 8, 5},
                        {6, 7, 1, 4, 3},
                        {9, 6, 7, 2, 9},
                        {7, 9, 3, 5, 6},
                        {8, 1, 6, 9, 2},
                        {5, 4, 2, 7, 1},
                        {3, 3, 8, 1, 4},
                        {1, 5, 4, 3, 8}};
        int [] combo={1,2,3,4,5};
        int mid=lock.length/2;

        for(int c=0; c<lock[0].length; c++){
            while(lock[mid][c]!=combo[c]){
                rotateUp(lock,c);
            }
        }
        for(int i=0; i<lock.length; i++){
            for(int j=0; j<lock[0].length; j++){
                System.out.print(lock[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void rotateUp(int[][]mat, int col){
        for(int i=0; i<mat.length-1; i++){
            int temp=mat[i][col];
            mat[i][col]=mat[i+1][col];
            mat[i+1][col]=temp;
        }
    }
}
