package SlideProblem_Solve;

public class Spiral2 {
    public static void main(String[]args){
        int[][]mat={{11,12,13,14,15,16,17},
                    {21,22,23,24,25,26,27},
                    {31,32,33,34,35,36,37},
                    {41,42,43,44,45,46,47},
                    {51,52,53,54,55,56,57}};

        int minr=0;
        int minc=0;
        int maxr=mat.length-1;
        int maxc=mat[0].length-1;

        while(minr<=maxr && minc<=maxc){

            //Left -> Right
            for(int i=minc; i<=maxc; i++){
                System.out.print(mat[minr][i]+" ");
            }

            //Top -> Bottom
            for(int i=minr+1; i<=maxr; i++){
                System.out.print(mat[i][maxc]+" ");
            }

            //Right -> Left
            for(int i=maxc-1; i>=minc; i--){
                if(minr==maxr){
                    break;
                }
                System.out.print(mat[maxr][i]+" ");
            }

            //Bottom -> Top
            for(int i=maxr-1; i>=maxr+1; i--){
                if(minc==maxc){
                    break;
                }
                System.out.print(mat[i][minc]+" ");
            }
            minr++;
            maxr--;
            minc++;
            maxc--;
        }
    }
}
