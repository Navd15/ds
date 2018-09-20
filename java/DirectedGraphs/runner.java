public class runner {


    public static void main(String[] args) {
         DiGraph diGraph=new DiGraph(3);
         diGraph.addEdge(0,1);
         diGraph.addEdge(0,2);
         diGraph.addEdge(1,3);

         for(int i :diGraph.adj(0)){
             System.out.println(0+"->"+i);


         }
    }
}

