/*Check  Connected components in  constant  time */

public class CC {
    /* Visited vertices */

    boolean[] marked;

    /* Id of components to which they belong */

    int[] id;
    /*
     * count will be id given to components . We just iterate it for the vertices
     * when any unmarked is encounted
     */
    int count;

    public CC(Graph g, int site) {
        marked = new boolean[g.getSize()];
        id = new int[g.getSize()];
        count = 0;
        /* For each call dfs method and dfs do next bit of things */
        for (int i = 0; i < g.getSize(); i++) {
            if (!marked[i]) {
                dfs(g, i);
                count++;
            }
        }

    }

    public int count(){
        return count;
    }

    public int id(int v){
        return id[v];
    }
    private void dfs(Graph g, int v) {
        marked[v] = true;
        id[v]=count;
        for (int i : g.adj(v)) {
            if (!marked[i]) {
                dfs(g, i);
            }
        }

    }

}