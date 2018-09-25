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


    }

}
