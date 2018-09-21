import java.util.Stack;

public class TopologicalSort {
    private boolean[] marked;
    private Stack<Integer> stack;

    public TopologicalSort(DiGraph dg,CyclicDIGraph cd) {
        marked=new boolean[dg.getSize()];
        stack=new Stack<Integer>();
        if(!cd.isCyclic()) {
            for (int i = 0; i < dg.getSize(); i++) {
                if (!marked[i]) {
                    dfs(dg, i);
                }
            }
        }
throw new CyclicException("Provided graph object has cycle(s)");
    }

    private void dfs(DiGraph dg,int site){
        marked[site]=true;
        for (int w:dg.adj(site)) {
            if(!marked[w])
                dfs(dg,w);
        }
      stack.push(site);
    }

    public Iterable<Integer> sorted(){
        return stack;
    }
    private class CyclicException extends RuntimeException {
String message;
        public CyclicException(String message) {
            super(message);
            this.message=message;


        }




    }



}


