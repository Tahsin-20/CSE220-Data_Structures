package Directed_Weighted;

public class Edge {
    int vertex;
    Edge next;
    int weight;

    Edge(int dest, int w){
        vertex=dest;
        weight=w;
        next=null;
    }
}