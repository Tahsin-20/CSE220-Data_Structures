package Array;
import java.util.*;
public class Array13 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Row of first matrix: ");
        int row1=sc.nextInt();
        System.out.println("Enter Column of first matrix: ");
        int col1=sc.nextInt();
        int [] [] mat1=new int [row1] [col1];

        System.out.println("Enter Row of second matrix: ");
        int row2=sc.nextInt();
        System.out.println("Enter Column of second matrix: ");
        int col2=sc.nextInt();
        int [] [] mat2=new int [row2] [col2];

        for(int i=0; i<row1; i++){
            for(int j=0; j<col1; j++){
                int a=sc.nextInt();
                mat1[i][j]=a;
            }
        }

        for(int i=0; i<row2; i++){
            for(int j=0; j<col2; j++){
                int b=sc.nextInt();
                mat2[i][j]=b;
            }
        }
        int [] [] prdmat=new int[row1] [col2];

        if(col1!=row2){
            System.out.println("Invalid!");
        }

        else{

            for(int i=0; i<row1; i++){
                for(int j=0; j<col2; j++){
                    for(int k=0; k<col1; k++){
                        prdmat[i][j]+=mat1[i][k]*mat2[k][j];
                    }
                }
            }

            for(int i=0; i<row1; i++){
                for(int j=0; j<col2; j++){
                    System.out.print(prdmat[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
