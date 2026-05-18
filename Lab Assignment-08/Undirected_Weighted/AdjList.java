package Undirected_Weighted;

public class AdjList {
    
    public static void addEdge(Edge[]adjList, int src, int dest, int w){
        addEdge_Single(adjList, src, dest, w);
        addEdge_Single(adjList, dest, src, w);
    }
    public static void addEdge_Single(Edge[]adjlist, int src, int dest, int w){
        Edge curr=adjlist[src];
        Edge newEdge=new Edge(dest, w);
        if(adjlist[src]==null){
            adjlist[src]=newEdge;
            return;
        }
        else{
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=newEdge;
        }
    }
    //Task2b
    public static int maxSumofEdgeWeight(Edge[]adjList){
        int max=0;
        int vertex=-1;
        for(int i=0; i<adjList.length; i++){
            int sum=0;
            Edge temp=adjList[i];
            while(temp!=null){
                sum+=temp.weight;
                temp=temp.next;
            }
            if(sum>max){
                max=sum;
                vertex=i;
            }
        }
        return max;
    }
    public static void main(String[]args){
        int n=8;
        Edge[]adjList=new Edge[n];

        addEdge(adjList, 1, 2, 3);
        addEdge(adjList, 1, 6, 8);
        addEdge(adjList, 2, 4, 9);
        addEdge(adjList, 2, 5, 2);
        addEdge(adjList, 5, 6, 10);
        addEdge(adjList, 5, 1, 6);
        addEdge(adjList, 6, 3, 2);
        addEdge(adjList, 6, 7, 3);
        addEdge(adjList, 7, 2, 15);
        addEdge(adjList, 7, 4, 69);
        addEdge(adjList, 4, 3, 67);
        addEdge(adjList, 3, 1, 50);

        System.out.println(maxSumofEdgeWeight(adjList));
    }
}
