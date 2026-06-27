package Array;
import java.util.*;
public class Array9 {
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);

    int row=sc.nextInt();
    int col=sc.nextInt();

    int [] [] mat=new int [row] [col];

    for(int i=0; i<row; i++){
        for(int j=0; j<col; j++){
            int a=sc.nextInt();
            mat [i] [j]=a;
        }
    }

    for(int i=0; i<row; i++){
        for(int j=0; j<col; j++){
            System.out.print(mat[i][j]+" ");
        }
        System.out.println();
    }

    int [] arr=new int[row*col];
    int ind=0;

    for(int i=0; i<row; i++){
        for(int j=0; j<col; j++){
            arr[ind]=mat[i][j];
            ind++;
        }
    }
    System.out.println(Arrays.toString(arr));
    }
}
