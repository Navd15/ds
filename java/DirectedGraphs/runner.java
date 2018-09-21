public class runner {


    public static void main(String[] args) {
         DiGraph diGraph=new DiGraph(4);
         diGraph.addEdge(0,2);
         diGraph.addEdge(2,1);
         diGraph.addEdge(1,0);
        diGraph.addEdge(0,3);

        CyclicDIGraph cd=new CyclicDIGraph(diGraph);
        TopologicalSort ts=new TopologicalSort(diGraph,cd);
        


//        if(cd.cyclicPath()!=null){
//            for (int i:
//                 cd.cyclicPath()) {
//                System.out.println(i);
//            }
//
//        }
//
//        for (int i:bfs.ret()) {
//        }

//        System.out.println(i);



    }
}

