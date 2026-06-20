package LabQuiz_Solve;
//Lab Quiz-6
import java.util.Arrays;
public class Message {
    public static void main(String[]args){
        int [][]mat={{1,2,3,-4},
                     {5,-6,7,8},
                     {9,-10,11,12},
                     {13,14,15,-16}};
        int []arr=new int[mat.length];

        for(int i=0; i<mat.length; i++){
            arr[i]=Math.abs(mat[i][i]-mat[i][mat[0].length-1-i]);
        }
        System.out.println(Arrays.toString(arr));
    }
}