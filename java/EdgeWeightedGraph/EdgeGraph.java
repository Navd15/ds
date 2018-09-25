import edu.princeton.cs.algs4.Bag;

public class EdgeGraph {
/*N.o of vertices*/
    private final int v;
     private final Bag<Edge>[] adj;
    public EdgeGraph(int v) {
    this.v=v;
    adj=(Bag<Edge>[]) new Bag[v];
    for(int i=0;i<v;i++){
        adj[i]=new Bag<Edge>();

    }
    }
    public void addEdge(Edge edge){
     int v=edge.eitherVertex(),w=edge.alternateVertex(v);
adj[v].add(edge);
adj[w].add(edge);
    }

    public Iterable<Edge> adj(int v){
        return adj[v];
    }


}
