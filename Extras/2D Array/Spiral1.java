package Pepcoding;

public class Spiral1 {
    public static void main(String[]args){
        int[][]mat={{11,12,13,14,15,16,17},
                    {21,22,23,24,25,26,27},
                    {31,32,33,34,35,36,37},
                    {41,42,43,44,45,46,47},
                    {51,52,53,54,55,56,57}};

        int minr=0;
        int minc=0;
        int maxc=mat[0].length-1;
        int maxr=mat.length-1;
        int c=0;
        int total_elem=mat.length*mat[0].length;
        while(c<total_elem){
        //Top -> Bottom
        for(int i=minr; i<=maxr && c<total_elem; i++){
            System.out.print(mat[i][minc]+" ");
            c++;
        }
        minc++;

        //Left -> Right
        for(int i=minc; i<=maxc && c<total_elem; i++){
            System.out.print(mat[maxr][i]+" ");
            c++;
        }
        maxr--;

        //Bottom -> Top
        for(int i=maxr; i>=minr && c<total_elem; i--){
            System.out.print(mat[i][maxc]+" ");
            c++;
        }
        maxc--;
        //Right -> Left
        for(int i=maxc; i>=minc && c<total_elem; i--){
            System.out.print(mat[minr][i]+" ");
            c++;
        }
        minr++;
    }
}   
}
