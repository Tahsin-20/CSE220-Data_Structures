package Array;
import java.util.*;
public class BinarySearch {
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int a =sc.nextInt();
    int tar=sc.nextInt();
    int [] arr=new int[a];
    int st=0;
    int end=arr.length-1;

    

    for(int i=0; i<arr.length; i++){
        arr[i]=sc.nextInt();
    }

     while(st<=end){
        int mid = (st+end)/2;

        if(tar>arr[mid]){
            st=mid+1;
        }
        else if(tar<arr[mid]){
            end=mid-1;
        }
        else{
            System.out.println("Target found: "+arr[mid]);
            break;
        }
    }
    }
}