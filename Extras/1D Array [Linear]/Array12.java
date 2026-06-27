package Array;
import java.util.*;
public class Array12 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);

        int row=sc.nextInt();
        int col=sc.nextInt();
        int [] [] mat=new int [row] [col];
        int [] [] tmat=new int [col] [row];
        int r=0;
        int c=0;

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                int a=sc.nextInt();
                mat[i][j]=a;
            }
        }

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){

                tmat[j][i]=mat[i][j];
            }
        }

        for(int i=0; i<col; i++){
            for(int j=0; j<row; j++){
                System.out.print(tmat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
