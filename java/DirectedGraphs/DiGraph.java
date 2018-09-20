import edu.princeton.cs.algs4.Bag;

public class DiGraph {
   private int size;
    private Bag<Integer>[] vertices;

    public DiGraph(int c) {
        size=c;
        vertices=(Bag<Integer>[]) new Bag[size];
        for(int i=0;i<size;i++){
            vertices[i]=new Bag<Integer>();

        }

    }

//    From v -> w
    public void addEdge(int v,int w){
        vertices[v].add(w);
    }

    public Iterable<Integer> adj(int v){
        return vertices[v];
    }

    public int getSize(){return size;}

}

