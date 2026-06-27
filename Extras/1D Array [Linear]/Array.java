package Array;
import java.util.Arrays;
import java.util.Scanner;
public class Array{
    public static void main (String []args){
        Scanner sc=new Scanner (System.in);
        int size=sc.nextInt();
        int [] arr1=new int[size];
        for(int i=0; i<size; i++){
            int j=sc.nextInt();
            arr1[i]=j;
        }
        System.out.println(Arrays.toString(arr1));
    }
    
}
