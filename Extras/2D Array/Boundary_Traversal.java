package PractiseSheet_Solve;
// Ques:6
public class Boundary_Traversal {
    public static void main(String[]args){
        int[][]mat={{1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}};

        int[]arr=new int[(2*mat.length)+(2*mat[0].length)-4];
        int count=0;

        //Left to Right
        for(int i=0; i<mat[0].length; i++){
            arr[count]=mat[0][i];
            count++;
        }
        //Top to Bottom
        for(int i=1; i<=mat.length-1; i++){
            arr[count]=mat[i][mat[0].length-1];
            count++;
        }
        //Right to Left
        for(int i=mat[0].length-2; i>=0; i--){
            arr[count]=mat[mat.length-1][i];
            count++;
        }
        //Bottom to Top
        for(int i=mat.length-2; i>=1; i--){
            arr[count]=mat[i][0];
            count++;
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }    
}
