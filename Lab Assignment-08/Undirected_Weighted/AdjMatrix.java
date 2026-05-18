package Undirected_Weighted;

public class AdjMatrix {
    
    public static void addEdge(int[][]adjMatrix, int src, int dest, int w){
        adjMatrix[src][dest]=w;
        adjMatrix[dest][src]=w;
    }
    public static void maxSumofWeights(int[][]adjMatrix){
        int maxweight=0;
        int vertex=-1;
        for(int i=0; i<adjMatrix.length; i++){
            int maxsum=0;
            for(int j=0; j<adjMatrix.length; j++){
                if(adjMatrix[i][j]!=0){
                    maxsum+=adjMatrix[i][j];
                }
            }
            if(maxsum>maxweight){
                maxweight=maxsum;
                vertex=i;
            }
        }
        System.out.println("Max sum of edge weight: "+maxweight+" "+"Vertex: "+vertex);
    }
    public static void main(String[]args){
        int [][] adjMatrix=new int[8][8];
        addEdge(adjMatrix, 1, 2, 3);
        addEdge(adjMatrix, 1, 6, 8);
        addEdge(adjMatrix, 2, 4, 9);
        addEdge(adjMatrix, 2, 5, 2);
        addEdge(adjMatrix, 5, 6, 10);
        addEdge(adjMatrix, 5, 1, 6);
        addEdge(adjMatrix, 6, 3, 2);
        addEdge(adjMatrix, 6, 7, 3);
        addEdge(adjMatrix, 7, 2, 15);
        addEdge(adjMatrix, 7, 4, 69);
        addEdge(adjMatrix, 4, 3, 67);
        addEdge(adjMatrix, 3, 1, 50);

        maxSumofWeights(adjMatrix);

    }
}

