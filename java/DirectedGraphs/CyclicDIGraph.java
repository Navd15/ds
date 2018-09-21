import edu.princeton.cs.algs4.In;

import java.util.Stack;

/**
 * API to check  cycle with in a DirectedGraph
 */
public class CyclicDIGraph {
    private boolean[] onStack;
    private boolean[] marked;
    private int[] edgeTo;
    private Stack<Integer> stack;

    /**
     * @param dg
     */
    public CyclicDIGraph(DiGraph dg) {
        int size = dg.getSize();
        edgeTo = new int[size];
        onStack = new boolean[size];
        marked = new boolean[size];
        for(int i=0;i<dg.getSize();i++)
            if(!marked[i]){
        cyclicDFS(dg,i);}
    }

    private void cyclicDFS(DiGraph dg, int site) {
        marked[site] = true;
        onStack[site] = true;
        for (int w : dg.adj(site)) {
            if (this.isCyclic())
                return;
            else if (!marked[w]) {
                edgeTo[w] = site;
                cyclicDFS(dg, w);
            } else if (onStack[w]) {
                stack = new Stack<Integer>();
                for (int x = site; x != w; x = edgeTo[x]) {
                    System.out.println(x);
                    stack.push(x);
                }
                stack.push(w);
                stack.push(site);
            }
        }
    }

    public boolean isCyclic() {

        return stack != null;

    }

    public Iterable<Integer> cyclicPath(){

        return isCyclic()?stack:null;
    }
}
