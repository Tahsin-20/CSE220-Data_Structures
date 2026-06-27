package Array;
import java.util.Arrays;
import java.util.Scanner;
public class Array4 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int [] arr=new int[a];

        for(int i=0; i<arr.length; i++){
            int c=sc.nextInt();
            arr[i]=c;
        }

        for(int i=0; i<arr.length; i++){
            
            if(arr[i]>0){
                arr[i]=1;
            }
            else if(arr[i]<0){
                arr[i]=0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
