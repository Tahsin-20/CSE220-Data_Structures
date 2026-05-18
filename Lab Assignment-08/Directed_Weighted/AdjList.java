package Directed_Weighted;

public class AdjList {
    
    public static void addEdge(Edge[]adjlist, int src, int dest, int w){
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
    //Task3b
    public static int maxOutDegree(Edge[]adjList){
        int maxdegree=0;
        int vertex=-1;
        for(int i=0; i<adjList.length; i++){
            int count=0;
            Edge temp=adjList[i];
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            if(count>maxdegree){
                maxdegree=count;
                vertex=i;
            }
        }
        return maxdegree;
    }
    //Task3b
    public static int maxSumofEdgeWeights(Edge[]adjList){
        int maxweight=0;
        int vertex=-1;
        for(int i=0; i<adjList.length; i++){
            int weightcount=0;
            Edge temp=adjList[i];
            while(temp!=null){
                weightcount+=temp.weight;
                temp=temp.next;
            }
            if(weightcount>maxweight){
                maxweight=weightcount;
                vertex=i;
            }
        }
        return maxweight;
    }
    //Task4b
    public static Edge[]covertingDirectedtoUndirected(Edge[]adjList){
        Edge[]undir=new Edge[adjList.length];
        for(int i=0; i<adjList.length; i++){
            Edge curr=adjList[i];
            while(curr!=null){
                update(undir, i, curr.vertex, curr.weight);
                update(undir, curr.vertex, i, curr.weight);
                curr=curr.next;
            }
        }
        return undir;
    }
    public static void update(Edge[]undir, int m, int n, int w){
        Edge newEdge=new Edge(n, w);
        if(undir[m]==null){
            undir[m]=newEdge;
            return;
        }
        else{
            Edge temp=undir[m];
            while(temp!=null){
            if(temp.vertex==n){
                temp.weight=temp.weight+w;
                return;
            }
            if(temp.next==null){
                temp.next=newEdge;
                break;
            }
            temp=temp.next;
            }
        }  
    }
    public static void main(String[]args){
        int n=8;
        Edge[]adjList=new Edge[n];

        addEdge(adjList, 1, 2, 3);
        addEdge(adjList, 2, 1, 3);
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

        System.out.println(maxOutDegree(adjList));
        System.out.println(maxSumofEdgeWeights(adjList));
        covertingDirectedtoUndirected(adjList);
    }
}
