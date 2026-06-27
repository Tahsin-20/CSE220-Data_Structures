package Array;
import java.util.*;
public class Array10 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        int row=sc.nextInt();
        int col=sc.nextInt();
        int [] []mat=new int[row][col];
        boolean bool=true;

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                int a=sc.nextInt();
                mat[i][j]=a;
            }
        }

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){

                if((i==j && mat[i][j]!=1)|| (i!=j && mat[i][j]!=0)){
                    bool=false;
                }
            }
        }
        if(bool==true){
            System.out.println("Identity Matrix");
        }
        else{
            System.out.println("Not an identity matrix");
        }
    }
}
