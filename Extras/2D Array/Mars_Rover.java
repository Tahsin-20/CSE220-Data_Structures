package SlideProblem_Solve;
public class Mars_Rover {
   public static void main(String[]args){
    int[][] mat = {{22, 21, 1000, 23}, 
                   {25, 17, 21, 1000}, 
                   {1000, 19, 18, 22}, 
                   {21, 22, 1000, 20}};
    int thresh=100;
    int row=-1;
    int col=-1;

    for(int i=1; i<mat.length-1; i++){
        for(int j=1; j<mat[0].length-1; j++){
            if(mat[i][j]<thresh){
                if((mat[i-1][j]>mat[i][j]) && (mat[i][j-1]>mat[i][j])&&(mat[i][j+1]>mat[i][j])&&mat[i+1][j]>mat[i][j]){
                    row=i;
                    col=j;                
                }
            }
        }
    }
    System.out.print(row+" "+col);
   } 
}
