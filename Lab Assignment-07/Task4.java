import java.util.*;
public class Task4 {
    
    public static int[] findMax(int[]arr, int k){
        MaxHeap heap=new MaxHeap(arr.length);
        
        int[]newarr=new int[k];

        for(int i=0; i<arr.length; i++){
            heap.insert(arr[i]);
        }
        for(int i=0; i<newarr.length; i++){
            newarr[i]=heap.extractMax();
        }
        return newarr;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int a=sc.nextInt();
        int[]arr=new int[a];
        System.out.println("Enter integer number: ");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("How many largest elements do you want to find: ");
        int k=sc.nextInt();

        int[]forprint=findMax(arr,k);
        System.out.print("[");
        for(int i=0; i<forprint.length; i++){
            System.out.print(forprint[i]);
            if(i<forprint.length-1){
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}
