package Array;
import java.util.Scanner;
public class Array6 {
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        double [] arr=new double[a];
        double min_val=Double.MAX_VALUE;
        double max_val=Double.MIN_VALUE;
        int ind_max=0;
        int ind_min=0;
        double sum=0.0;

        for(int i=0; i<arr.length; i++){
            double c=sc.nextDouble();
            arr[i]=c;
        }

        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
            if(arr[i]>max_val){
                max_val=arr[i];
                ind_max=i;
            }
            if(arr[i]<min_val){
                min_val=arr[i];
                ind_min=i;
            }
        }
        System.out.println(max_val+" "+ind_max);
        System.out.println(min_val+" "+ind_min);
    }
}
