package Data_Structures_and_algorithms.non_linear_dataStructures.graph.problem.mode3;

import java.util.* ; 

public class allPathFromSourceToTarget {
    public static void main(String[] args) {
        Graph gh  = new Graph(8);
        gh.createGraph();
        gh.Allpaths(5,1) ; 
    }
}

class Graph{
    private static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    private final ArrayList<ArrayList<Edge>> graph;

    // Constructor
    //time O(V+1)  space O(V)
    public Graph(int vertices) {
        this.graph = new ArrayList<>(); // O(1)
        for (int i = 0; i < vertices; i++) { // O(V)
            graph.add(new ArrayList<>());
        }
    }

    //! Adding one edge O(1) time adding E edge O(E) time 
    //! E edges takes O(E) space 
    public void createGraph() {
        graph.get(1).add(new Edge(1, 3, 1));
        graph.get(0).add(new Edge(0, 3, 1));
        graph.get(2).add(new Edge(2, 3, 1));
        graph.get(3).add(new Edge(3, 1, 1));
        graph.get(4).add(new Edge(4, 1, 0)) ;
        graph.get(4).add(new Edge(4, 0, 0)) ;
        graph.get(5).add(new Edge(5, 0, 0)) ; 
        graph.get(5).add(new Edge(5, 2, 0)) ; 
    }



    public void Allpaths(int startNode , int endNode){
        helper(startNode , endNode , "") ; 
    }
    void helper(int startNode , int endNode , String path){
        if(startNode == endNode){
            System.out.println(path + startNode);
            return ; 
        }
        for(int i = 0 ; i < graph.get(startNode).size() ; i++){
            Edge edge = graph.get(startNode).get(i);
            int dest = edge.dest ;
            helper(dest, endNode, path + startNode);
        }
    }
   


}