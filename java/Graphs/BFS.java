
import edu.princeton.cs.algs4.Queue;
public class BFS {
    /*Just put the visited vertex in this */
   boolean[] marked;
   /*Array to keep track from which vertex we came to present index of array*/
   int[] edgeTo;

       public BFS(Graph g,int site) {
           /*Initialize arrays according to Graph's size*/
           marked=new boolean[g.getSize()];
           edgeTo=new int[g.getSize()];
           bfs(g,site);
    }

    /*Fills arrays with bredth-first search method*/
 private void bfs(Graph g,int s){
     /*Local queue ds*/
Queue<Integer> queue=new Queue<>();
     queue.enqueue(s);
     marked[s]=true;

while(!queue.isEmpty()){
    int v=queue.dequeue();
    for(int i:g.adj(v)){
        if(!marked[i]){

        marked[i]=true;
            queue.enqueue(i);
            edgeTo[i]=v;
        }

    }


}

 }

}







