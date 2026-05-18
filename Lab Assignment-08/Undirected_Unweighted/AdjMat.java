package Undirected_Unweighted;

public class AdjMat {
    
    public static void addEdge(int[][]adjMatrix, int src, int dest){
        adjMatrix[src][dest]=1;
        adjMatrix[dest][src]=1;
    }
    public static void print(int[][]adjMatrix){
        int n=adjMatrix.length;
        boolean[]active=new boolean[n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(adjMatrix[i][j]==1){
                    active[i]=true;
                    active[j]=true;
                }
            }
        }
        System.out.printf("%4s", "");

        for(int i=0; i<n; i++){
            if(active[i]==true){
                System.out.printf("%2d", i);
            }
        }
        System.out.println();

        System.out.printf("%4s", "");
        for(int i=0; i<n; i++){
            if(active[i]){
                System.out.print("--");
            }
        }
        System.out.println();

        for(int i=0; i<n; i++){
            if(active[i]==false)continue;
            System.out.printf("%2d |", i);
            for(int j=0; j<n; j++){
                if(active[j]==true){
                    System.out.printf("%2d",adjMatrix[i][j]);
                }
            }
            System.out.println();
        }
    }
    public static void degree(int[][]adjMatrix){
        int maxdegree=0;
        int vertex=-1;
        for(int i=0; i<adjMatrix.length; i++){
            int count=0;
            for(int j=0; j<adjMatrix.length; j++){
                if(adjMatrix[i][j]==1){
                    count++;
                }
            }
            if(count>maxdegree){
                maxdegree=count;
                vertex=i;
            }
        }
        System.out.println("Degree: "+maxdegree+" "+"Vertex: "+vertex);
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
        degree(adjMatrix);

    }
}

