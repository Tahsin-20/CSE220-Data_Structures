package SlideProblem_Solve;
public class Decrypte{
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 1},
            {6, 4, 2},
            {5, 1, 7},
            {9, 3, 3},
            {8, 5, 4}};

        int [] newarr=decrypte(matrix);
        for(int i=0; i<newarr.length; i++){
            System.out.print(newarr[i]+" ");
        }
    }

    
    public static int[] decrypte(int[][]arr){
        int [] sumarr=new int[arr[0].length];
        for(int i=0; i<arr[0].length; i++){
            int sum=0;
            for(int j=0; j<arr.length; j++){
                sum+=arr[j][i];
            }
            sumarr[i]=sum;
        }
        int [] newarr=new int[arr[0].length-1];

        for(int i=0; i<sumarr.length-1; i++){
            newarr[i]=sumarr[i+1]-sumarr[i];
        }
        return newarr;
    } 
}