package SlideProblem_Solve;
public class Multiply {
    public static void main(String[]args){
        int[][]matA={{1,2,3},
                     {4,5,6},
                     {7,8,9},
                     {10,11,12}};
        
        int[][]matB={{13,14},
                     {15,16},
                     {17,18}};

        int[][]matC=new int[matA.length][matB[0].length];

        for(int i=0; i<matA.length; i++){
            for(int j=0; j<matB.length; j++){
                int sum=0;
                for(int k=0; k<matC[0].length; k++){
                    sum+=(matA[i][j]*matB[k][j]);
                }
                matC[i][j]=sum;
            }
        }
    }
}
