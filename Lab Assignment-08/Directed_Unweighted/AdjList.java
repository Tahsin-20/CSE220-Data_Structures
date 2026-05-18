package Directed_Unweighted;

public class AdjList {
    
    public static void addEdge(Edge[]adjlist, int src, int dest){
        Edge curr=adjlist[src];
        Edge newEdge=new Edge(dest);
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
    public static void printAdjList(Edge[]adjList){
        for(int i=0; i<adjList.length; i++){
            if(i==0) continue;
            System.out.print(i+" : ");
            Edge temp=adjList[i];
            while(temp!=null){
                System.out.print(temp.vertex+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public static int outDegree(Edge[]adjList, int tar){
        int count=0;
        Edge temp=adjList[tar];
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public static int inDegree(Edge[]adjList, int tar){
        int count=0;
        for(int i=0; i<adjList.length; i++){
            Edge temp=adjList[i];
            while(temp!=null){
                if(temp.vertex==tar) count++;
                temp=temp.next;
            }
        }
        return count;
    }
    public static void main(String[]args){
        int n=8;
        Edge[]adjList=new Edge[n];

        addEdge(adjList, 1, 2);
        addEdge(adjList, 1, 6);
        addEdge(adjList, 2, 4);
        addEdge(adjList, 2, 5);
        addEdge(adjList, 5, 6);
        addEdge(adjList, 5, 1);
        addEdge(adjList, 6, 3);
        addEdge(adjList, 6, 7);
        addEdge(adjList, 7, 2);
        addEdge(adjList, 7, 4);
        addEdge(adjList, 4, 3);
        addEdge(adjList, 3, 1);

        printAdjList(adjList);
        System.out.println(outDegree(adjList, 3));
        System.out.println(inDegree(adjList, 3));
    }
}
