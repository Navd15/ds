public class runner {

    public static void main(String[] args) {
        Graph graph=new Graph(7);
        graph.addEdge(1,6);
        graph.addEdge(1,5);
        graph.addEdge(3,2);
        graph.addEdge(3,4);
        graph.addEdge(2,5);
        graph.addEdge(4,6);

        DFS dfs=new DFS(graph,3);
        dfs.pr();

    }
}
