package Array;
import java.Arrays;
import java.util.*;
public class RemoveDuplicates {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String [] arr=new String[a];
        int count=0;
        int ind=0;

        for(int i=0; i<arr.length; i++){
            arr[i]=sc.next();
        }

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i].equals(arr[j])){
                    arr[j]="";
                }
            }
        }
        for(int i=0; i<arr.length; i++){
            if(!arr[i].equals("")){
                count++;
            }
        }
        String [] newarr=new String[count];

        for(int i=0; i<arr.length; i++){
            if(!arr[i].equals("")){
                newarr[ind]=arr[i];
                ind++;
            }
        }
        System.out.println(Arrays.toString(newarr));
    }
}
