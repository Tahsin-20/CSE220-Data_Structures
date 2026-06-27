package Array;
import java.util.*;
public class Array15 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int count =0;
        int total=row*col;
        int [] [] mat=new int[row] [col];
        int minr=0;
        int minc=0;
        int maxr=mat.length-1;
        int maxc=mat[0].length-1;


        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                mat[i][j]=sc.nextInt();
            }
        }

        while(count<total){

            for(int i=minr, j=minc; i<=maxr && count<total; i++ ){
                System.out.print(mat[i][j]);
                count++;
            }
            minc++;
            System.out.println();

            for(int i=maxr, j=minc; j<=maxc && count<total; j++ ){
                System.out.print(mat[i][j]);
                count++;
            }
            maxr--;
            System.out.println();

            for(int i=maxr , j=maxc; i>=minr && count<total; i--){
                System.out.print(mat[i][j]);
                count++;
            }
            maxc--;
            System.out.println();

            for(int i=minr, j=maxc; j>=minc && count<total; j--){
                System.out.print(mat[i][j]);
                count++;
            }
            minr++;
            System.out.println();
        }
    }
}
