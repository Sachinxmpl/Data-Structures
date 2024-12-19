package Data_Structures_and_algorithms.non_linear_dataStructures.graph.implementation.cycleDetection;

import java.util.* ;


public class undirectedGraph {
    public static void main(String[] args) {
        Graph graph = new Graph(14); // Adjust size based on the number of nodes
        graph.createGraph();
        System.out.println(graph.hasCycle());
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
      public Graph(int vertices) {
        this.graph = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }
    }
     /*
     * Graph structure:
     *       1 ---------- 3              9------10
     *      /             | \                     \     12-----13
     *     /             |   \                     \  
     *    0             |     5  ----- 6            11
     *     \            |    /
     *      \          |  |
     *       2 ------  4
     */
    public void createGraph() {
        graph.get(0).add(new Edge(0, 1, 1));
        graph.get(0).add(new Edge(0, 2, 1));

        graph.get(1).add(new Edge(1, 0, 1));
        graph.get(1).add(new Edge(1, 3, 1));

        graph.get(2).add(new Edge(2, 0, 1));
        graph.get(2).add(new Edge(2, 4, 1));

        graph.get(3).add(new Edge(3, 1, 1));
        // graph.get(3).add(new Edge(3, 4, 1));
        // graph.get(3).add(new Edge(3, 5, 1));

        graph.get(4).add(new Edge(4, 2, 1));
        // graph.get(4).add(new Edge(4, 3, 1));
        graph.get(4).add(new Edge(4, 5, 1));

        graph.get(5).add(new Edge(5, 4, 1));
        // graph.get(5).add(new Edge(5, 3, 1));
        graph.get(5).add(new Edge(5, 6, 1));

        graph.get(6).add(new Edge(6, 5, 1));

        graph.get(9).add(new Edge(9, 10, 1));

        graph.get(10).add(new Edge(10, 9, 1));
        graph.get(10).add(new Edge(10, 11, 1));

        graph.get(11).add(new Edge(11, 10, 1));

        graph.get(12).add(new Edge(12, 13, 1));

        graph.get(13).add(new Edge(13, 12, 1));
    }

    public boolean hasCycle(){
        int size = graph.size() ; 
        boolean[] isVisited = new boolean[size] ; 

        for ( int i = 0 ;i < size; i++){
            if(!isVisited[i]){
                if(detectCycle(isVisited , i , -1)){
                    return true ; 
                }
            }
        }

        return false ; 
    }

    private boolean detectCycle(boolean[] isVisited , int curr , int parent){
        isVisited[curr] = true ; 

        for ( int i = 0 ; i < graph.get(curr).size() ; i++ ){
            Edge e = graph.get(curr).get(i) ; 
            int dest = e.dest ; 

            //case 1 the neighbour is visited already and isn't the parent
            if(isVisited[dest] && dest != parent){
                return true ; 
            }

            //case 2 neighbour is not visited
            if(!isVisited[dest]){
                if(detectCycle(isVisited, dest, curr)){
                    return true ; 
                }
            }

            //case 2 neighbout is visited and is parent of current node 
            //just continue
        }

        return false ; 
    }
}
