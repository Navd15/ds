import java.util.Iterator;
import edu.princeton.cs.algs4.*;
class Graph {
  private  int size;
Bag<Integer>[] vert;

    public Graph(int v) {
        size=v;
        vert=(Bag<Integer>[]) new Bag[v];

        for(int i=0;i<size;i++){
            vert[i]=new Bag<Integer>();
        };
    }
    public  void addEdge(int v,int w){
        vert[v].add(w);
         vert[w].add(v);

    }

    public int getSize() {
        return size;
    }

    public Iterable<Integer> adj(int v){

        return vert[v];
    }
    
}