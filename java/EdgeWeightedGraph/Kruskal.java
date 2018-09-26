import edu.princeton.cs.algs4.UF;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Kruskal {
Queue<Edge> queue;
    public Kruskal(EdgeGraph eg) {
        queue=new LinkedList<Edge>();
        PriorityQueue<Edge> priorityQueue=new PriorityQueue<Edge>(eg.V);
        UF uf=new UF(eg.V);
        for (Edge e:eg.edges()) {
priorityQueue.add(e);
        }
       while (!priorityQueue.isEmpty() && queue.size()!=eg.V-1 ){
            Edge e=priorityQueue.remove();
            int v=e.eitherVertex(),w=e.alternateVertex(v);
            if (!uf.connected(v,w)){
                uf.union(v,w);
                queue.add(e);
            }

       }


    }
    public Iterable<Edge> edges(){
        return queue;
    }

}
