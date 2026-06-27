package Array;
import java.util.Arrays;
import java.util.Scanner;

public class Array3b {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int [] arr=new int[a];
        int b=0;

        for(int i=0; i<arr.length; i++){
            int c=sc.nextInt();
            arr[i]=c;
        }
        for(int i=0; i<arr.length/2; i++){
            b=arr[i];
            arr [i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=b;
        }
        System.out.println(Arrays.toString(arr));
    }  
}
