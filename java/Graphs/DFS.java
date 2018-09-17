import edu.princeton.cs.algs4.Bag;
import edu.princeton.cs.algs4.In;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class DFS {
    /*To put visited vertices*/
    private boolean[] marked;
    /*From which element we are visting edgeTo[i]*/
    private int[] edgeTo;
    /* Vertex we want to query about*/
    private int vt;

    /*Optional for client tests*/
    private List<Integer> search;

    public DFS(Graph g, int start) {
        vt = start;
        marked = new boolean[g.getSize()];
        edgeTo = new int[g.getSize()];
        search = new LinkedList<>();

        dfs(g, start);
    }

    /*Path searching with depth-first search*/

    private void dfs(Graph g, int s) {
        /*Always put first quering vertex in array*/
        marked[s] = true;

        /*Optional*/

        search.add(s);

        /*For each adjacent vertex to quering vertex i.e s
         * Check if it is not marked and call dfs again but this time with
         * adjacent vertices of s one by one
         * */
        for (int v : g.adj(s)) {

            if (!marked[v]) {
//        System.out.println(s+":"+ v);
                dfs(g, v);
                edgeTo[v] = s;

            }

        }
    }

    /*Check if there is a path between s (quering vertex) and v*/

    public boolean hasPath(int v) {
        return marked[v];
    }

    /*If there exists a path then put the vertices in Stack  when traveling from s to v*/

    public Iterable<Integer> path(int v) {
        Stack<Integer> s = new Stack<>();

        if (!hasPath(v)) {
            s.push(null);
            return s;
        }

        for (int i = v; i != vt; i = edgeTo[i]) {
            s.push(i);
        }

        s.push(vt);

        return s;
    }

    /*It should be implemented with dfs method*/
    public boolean isAnyCycle(Graph g){

        boolean isAny=false;

        for(int v=0;v<g.vert.length;v++){

            LinkedList<Integer> list=new LinkedList<>();
        for(int i:g.adj(v)){
            list.add(i);
        }
            for (int vertex:g.adj(v)){
                for(int nextVert:g.adj(vertex)){
                    if(list.contains(nextVert)){
                        isAny=true;
                    }

                }

             }
        }
        return isAny;
    }


    public void pr() {
        for (int s : search
                ) {
            System.out.println(s);
        }
    }


}
