import edu.princeton.cs.algs4.Bag;

import java.util.LinkedList;

public class EdgeGraph {
/*N.o of vertices*/
     final int V;
     private final Bag<Edge>[] adj;
     private LinkedList<Edge> edges;
    public EdgeGraph(int v) {
    this.V=v;
    edges=new LinkedList<Edge>();
    adj=(Bag<Edge>[]) new Bag[v];
    for(int i=0;i<v;i++){
        adj[i]=new Bag<Edge>();

    }
    }
    public void addEdge(Edge edge){
        edges.add(edge);
     int v=edge.eitherVertex(),w=edge.alternateVertex(v);
adj[v].add(edge);
adj[w].add(edge);
    }

    public Iterable<Edge> adj(int v){
        return adj[v];
    }
 public Iterable<Edge> edges(){
        return edges;
 }

}
