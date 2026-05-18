package Undirected_Weighted;

public class Edge {
    int vertex;
    int weight;
    Edge next;

    Edge(int dest, int w){
        vertex=dest;
        weight=w;
        next=null;
    }
}
