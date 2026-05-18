package Directed_Unweighted;

public class Edge {
    int vertex;
    Edge next;

    Edge(int dest){
        vertex=dest;
        next=null;
    }
}
