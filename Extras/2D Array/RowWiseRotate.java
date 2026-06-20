package SlideProblem_Solve;
public class RowWiseRotate {
     public static void main(String[]args){
        String[][]mat={{"A","B","C","D","E"},
                       {"F","G","H","I","J"},
                       {"K","L","M","N","O"},
                       {"P","Q","R","S","T"},
                       {"U","V","W","X","Y"},
                    {"Z","AA","BB","CC","DD"}};
                    int c=0;
        while(c<2){
        for(int i=0; i<mat[0].length; i++){
            for(int j=mat.length-1; j>0; j--){
                String temp=mat[j][i];
                mat[j][i]=mat[j-1][i];
                mat[j-1][i]=temp;
            }
        }
        c++;
    }
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
