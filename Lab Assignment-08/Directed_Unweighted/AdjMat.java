package Directed_Unweighted;

public class AdjMat {
    
    public static void addEdge(int[][]adjMatrix, int src, int dest){
        adjMatrix[src][dest]=1;
    }
    public static void print(int[][]adjMatrix){
        int n=adjMatrix.length;
        System.out.print("  ");

        for(int i=0; i<n; i++){
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.print(" ");
        for(int i=0; i<n; i++){
            System.out.print("--");
        }
        System.out.println();

        for(int i=0; i<n; i++){
            System.out.print(i+"|");
            for(int j=0; j<n; j++){
                System.out.print(adjMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        int [][] adjMatrix=new int[8][8];
        addEdge(adjMatrix, 1, 2);
        addEdge(adjMatrix, 1, 6);
        addEdge(adjMatrix, 2, 4);
        addEdge(adjMatrix, 2, 5);
        addEdge(adjMatrix, 5, 6);
        addEdge(adjMatrix, 5, 1);
        addEdge(adjMatrix, 6, 3);
        addEdge(adjMatrix, 6, 7);
        addEdge(adjMatrix, 7, 2);
        addEdge(adjMatrix, 7, 4);
        addEdge(adjMatrix, 4, 3);
        addEdge(adjMatrix, 3, 1);

        print(adjMatrix);

    }
}
