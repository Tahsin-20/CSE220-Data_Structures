package Array;
import java.util.Arrays;
import java.util.Scanner;
public class Array5 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int [] arr=new int[a];
        boolean bool=false;

        for(int i=0; i<arr.length; i++){
            int c=sc.nextInt();
            arr[i]=c;
        }
        int b=sc.nextInt();

            for(int i=0; i<arr.length; i++){
                if(arr[i]==b){
                    System.out.println(b+" is at index "+i);
                    bool=true;
                    break;
                }
            }
            if(bool==false){
                System.out.println("Element not found");
            }
    }
}
