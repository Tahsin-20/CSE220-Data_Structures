import java.util.*;
public class Task3 {

    public static void taskmanagement(int[] arr,int mach){
        MinHeap heap=new MinHeap(mach);

        for(int i=0; i<mach; i++){
            heap.insert(0);
        }
        for(int i=0; i<arr.length; i++){
            heap.insert(heap.extractMin()+arr[i]);
            
        }
        for(int i=0; i<mach; i++){
            System.out.print(heap.extractMin()+" ");
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of processing time array: ");
        int a=sc.nextInt();
        int[]arr=new int[a];
        System.out.print("Enter number of machines: ");
        int m=sc.nextInt();
        System.out.println("Enter processing times: ");
        for(int i=0; i<a; i++){
            arr[i]=sc.nextInt();
        }
        taskmanagement(arr,m);
    }
}
