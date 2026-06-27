package Array;
import java.util.Arrays;
import java.util.Scanner;
public class Array3a {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int [] arr=new int[x];
        int [] arr1=new int [x];
        int m=0;

        for(int i=0; i<arr.length; i++){
            int a=sc.nextInt();
            arr[i]=a;
        }

        for(int i=arr.length-1; i>=0; i--){
            arr1[m++]=arr[i];
        }
        System.out.println(Arrays.toString(arr1));
    }
}
