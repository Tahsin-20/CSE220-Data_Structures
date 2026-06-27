package Array;
import java.util.Arrays;
import java.util.Scanner;
public class Array2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int [] arr=new int[x];

        for(int i=0; i<arr.length; i++){
            int j=sc.nextInt();
            arr[i]=j;
        }

        for(int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    arr[j]=0;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
    
}
