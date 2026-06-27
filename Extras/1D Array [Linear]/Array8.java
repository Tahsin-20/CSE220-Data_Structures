package Array;
import java.util.Scanner;
public class Array8 {
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();

    int [] arr1=new int[size];
    for(int i=0; i<size; i++){
        int j=sc.nextInt();
        arr1[i]=j;
    }
    int size2=sc.nextInt();
    int [] arr2=new int[size2];
    for(int i=0; i<size2; i++){
        int j=sc.nextInt();
        arr2[i]=j;
    }
boolean bool_subset=true;
    for(int i=0; i<arr2.length; i++){
        boolean bool=false;
        for(int j=0; j<arr1.length; j++){
            if(arr2[i]==arr1[j]){
                bool=true;
                break;
            }
        }
        if(bool==false){
            bool_subset=false;
            break;
        }
    }
    if(bool_subset==true){
        System.out.println("Subset");
    }
    else{
        System.out.println("Not Subset");
    }
}
}
