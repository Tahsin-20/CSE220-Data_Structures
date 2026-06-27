package Array;
import java.util.Scanner;
import java.util.Arrays;
public class Array7 {
    public static void main(String[]args){
      Scanner sc=new Scanner(System.in);
      int size=sc.nextInt();
      int count=0;

      int [] arr=new int[size];
      for(int i=0; i<size; i++){
        int j=sc.nextInt();
        arr[i]=j;
      }

      for(int i=0; i<arr.length; i++){
        for(int j=i+1; j<arr.length; j++){
            if(arr[i]==arr[j]){
                arr[j]=0;
            }
        }
      }

      for(int i=0; i<arr.length; i++){
        if(arr[i]!=0){
            count++;
        }
      }
      int [] new_arr=new int[count];
      int ind=0;

      for(int i=0; i<arr.length; i++){
        if(arr[i]!=0){
            new_arr[ind++]=arr[i];
        }
      }
      System.out.println(Arrays.toString(new_arr));
    }
}
