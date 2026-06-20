package LabQuiz_Solve;
//Lab Quiz-5
import java.util.Arrays;
public class Quiz_Scores {
   public static void main(String[]args){
    int [][]mat={{85,90,78},
                 {88,85,80},
                 {75,95,85},
                 {92,88,82}};
    
    double [] arr=new double[mat[0].length];

    for(int i=0; i<mat[0].length; i++){
        int sum=0;
        for(int j=0; j<mat.length; j++){
            sum+=mat[j][i];
        }
        arr[i]=(double)sum/mat.length;;
    }
    for(int i=0; i<arr.length-1; i++){
        arr[i]=arr[i+1]-arr[i];
        System.out.print(arr[i]+" ");
    }
   } 
}
