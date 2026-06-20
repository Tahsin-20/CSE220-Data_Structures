package PractiseSheet_Solve;
//Ques:5
public class Set_Matrix_Zeros {
   public static void main(String[]args){
      int[][]mat={{1,2,0},
                  {4,5,6},
                  {7,8,9}};

      boolean[]row=new boolean[mat.length];
      boolean[]col=new boolean[mat[0].length];

      for(int i=0; i<mat.length; i++){
         for(int j=0; j<mat[0].length; j++){
            if(mat[i][j]==0){
               row[i]=true;
               col[j]=true;
            }
         }
      }
      for(int i=0; i<mat.length; i++){
         for(int j=0; j<mat[0].length; j++){
            if(row[i]==true || col[j]==true){
               mat[i][j]=0;
            }
         }
      }
      for(int i=0; i<mat.length; i++){
         for(int j=0; j<mat[0].length;j++){
            System.out.print(mat[i][j]+" ");
         }
         System.out.println();
      }
   } 
}
