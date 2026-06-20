package LabQuiz_Solve;
//Lab Quiz-2
public class Decode {
    public static void main(String[]args){
        String [][] mat={{"A","D","M","Q","F"},
                         {"E","S","Y","K","W"},
                         {"J","F","O","L","T"},
                         {"P","X","J","S","Y"},
                         {"V","R","K","G","P"}};
        String APT="";

        for(int i=0; i<mat.length; i++){
            for(int j=i+1; j<mat.length; j++){
                if(mat[i][i]==mat[j][j]){
                    mat[i][i]=null;
                    mat[j][j]=null;
                }
            }
        }
        for(int i=0; i<mat.length; i++){
            if(mat[i][i]!=null){
                APT+=mat[i][i];
            }
        }
        System.out.println(APT);
    }
}
