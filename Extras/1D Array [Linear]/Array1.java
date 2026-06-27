package Array;
import java.util.Arrays;
import java.util.Scanner;
public class Array1 {
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();

    int [] arr=new int[size];
    for(int i=0; i<size; i++){
        int j=sc.nextInt();
        arr[i]=j;
    }

    for(int i=0; i<size; i++){
        System.out.println(i+":"+arr[i]);
    }
    int []arr1=new int [size+1];
    int element=sc.nextInt();
    for(int i=0; i<arr1.length; i++){
        
        if(i<arr1.length-1){
            arr1[i]=arr[i];
        }
        else{
            arr1[i]=element;
        }
    }
    System.out.println(Arrays.toString(arr1));
  }  
}
