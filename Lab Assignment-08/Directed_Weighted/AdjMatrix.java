package Directed_Weighted;

public class AdjMatrix {
    
    public static void addEdge(int[][]adjMatrix, int src, int dest, int w){
        adjMatrix[src][dest]=w;
    }
    //Task3a
    public static int maxOutGoingDegree(int[][]adjMatrix){
        int maxoutgoing=0;
        int vertex=-1;
        for(int i=0; i<adjMatrix.length; i++){
            int count=0;
            for(int j=0; j<adjMatrix.length; j++){
                if(adjMatrix[i][j]!=0){
                    count++;
                }
            }
            if(count>maxoutgoing){
                maxoutgoing=count;
                vertex=i;
            }
        }
        return maxoutgoing;
    }
    //Task3a
    public static void maxSumOfEdgeWeight(int[][]adjMatrix){
        int maxsum=0;
        int vertex=-1;
        for(int i=0; i<adjMatrix.length; i++){
            int weightsum=0;
            for(int j=0; j<adjMatrix.length; j++){
                if(adjMatrix[i][j]!=0){
                    weightsum+=adjMatrix[i][j];
                }
            }
            if(weightsum>maxsum){
                maxsum=weightsum;
                vertex=i;
            }
        }
        System.out.println(maxsum);
    }
    //Task4a
    public static void convertingDirectedtoUndirected(int[][]adjMatrix){
        for(int i=0; i<adjMatrix.length; i++){
            for(int j=i+1; j<adjMatrix.length; j++){
                if(adjMatrix[i][j]!=0 || adjMatrix[i][j]==0){
                    if(adjMatrix[j][i]!=0){
                        int sum=adjMatrix[i][j]+adjMatrix[j][i];
                        adjMatrix[i][j]=sum;
                        adjMatrix[j][i]=sum;
                    }
                    else if(adjMatrix[j][i]==0){
                        adjMatrix[j][i]=adjMatrix[i][j];
                    }
                    else{
                        adjMatrix[i][j]=adjMatrix[j][i];
                    }
                }
            }
        }
    }
    public static void main(String[]args){
        int [][] adjMatrix=new int[8][8];
        addEdge(adjMatrix, 1, 2, 3);
        addEdge(adjMatrix, 2, 1, 3);
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

        System.out.println(maxOutGoingDegree(adjMatrix)); //Task3a
        maxSumOfEdgeWeight(adjMatrix); //Task3a
        convertingDirectedtoUndirected(adjMatrix); //Task4a
    }
}
