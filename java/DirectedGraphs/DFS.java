public class DFS {
    boolean[] maked;
    int[] edgeTo;


    public DFS(DiGraph dg,int site) {

        maked=new boolean[dg.getSize()];
        edgeTo=new int[dg.getSize()];
        dfs(dg,site);
    }

    private void dfs(DiGraph dg,int v){
            maked[v]=true;
            for(int w :dg.adj(v)){
                if (!maked[w]){
                    edgeTo[w]=v;
                    dfs(dg,w);
                }
            }
    }




}
