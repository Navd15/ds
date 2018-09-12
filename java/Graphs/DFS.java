import java.util.LinkedList;
import java.util.List;

public class DFS {
private boolean[] marked;
private int[] edgeTo;
private List<Integer> search;
    public DFS(Graph g,int start) {

        marked=new boolean[g.getSize()];
edgeTo=new int[g.getSize()];
search=new LinkedList<>();
dfs(g,start);
    }

    private void dfs(Graph g,int s){
marked[s]=true;
search.add(s);
for(int v:g.adj(s)) {

    if(!marked[v]){
//        System.out.println(s+":"+ v);
        dfs(g,v);
        edgeTo[v]=s;

    }

}
    }

public void pr(){
    for (int s:search
         ) {
        System.out.println(s);
    }
}


}
