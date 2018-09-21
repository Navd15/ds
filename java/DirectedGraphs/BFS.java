import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    boolean[] marked;
    int[] edgeTo;
    int[] dist;
    Queue<Integer> queue;

    public BFS(DiGraph dg, int site) {
        dist = new int[dg.getSize()];
        edgeTo=new int[dg.getSize()];
        marked = new boolean[dg.getSize()];
        queue = new LinkedList<>();
        bfs(dg,site);
    }


    private void bfs(DiGraph dg, int v) {
        /*Add source vertex to queue*/
        queue.add(v);
        /*Mark it as true i.e traversed*/
        marked[v] = true;

        /*Distance of connected vertices from source vertex*/
        int dis=0;
        /*Make source vertex distance from itself as zero*/
        dist[v]=0;

        /*From which vertex we arrived at present vertex*/
        edgeTo[v]=v;

        while (!queue.isEmpty()) {
            /*Element to be removed*/
            int element=queue.remove();

            /*Check if removed element got any adjacent vertices then iterate distance*/
            if(dg.adj(element).iterator().hasNext()){
                dis++;
            }

            for (int w : dg.adj(element)) {

                if (!marked[w])
                    edgeTo[w]=v;
                    dist[w]=dis;
                    queue.add(w);
                marked[w] = true;


            }

        }

    }

    public int[] ret(){return dist;};

}
