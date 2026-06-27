package Array;
import java.util.*;
public class Array14 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();

        int [] [] mat=new int[row] [col];

        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                mat[i][j]=sc.nextInt();
            }
        }

        for(int j=0; j<mat[0].length; j++){

            if(j%2==0){
                for(int i=0; i<mat.length; i++){
                    System.out.println(mat[i][j]);
                }
            }
            else{
                for(int i=mat.length-1; i>=0; i--){
                    System.out.println(mat[i][j]);
                }
            }
        }
    } 
}
