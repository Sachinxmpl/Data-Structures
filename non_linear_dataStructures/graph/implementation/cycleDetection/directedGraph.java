package Data_Structures_and_algorithms.non_linear_dataStructures.graph.implementation.cycleDetection;
import java.util.* ; 

public class directedGraph {
    public static void main(String[] args) {
        Graph gh  = new Graph(8);
        gh.createGraph();
        System.out.println(gh.hasCycle());
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

        //acyclic part of not connected graph 
        graph.get(0).add(new Edge(0, 1, 1));
        graph.get(0).add(new Edge(0, 2, 1));

        graph.get(1).add(new Edge(1, 3, 1));

        graph.get(2).add(new Edge(2, 3, 1));

        //cyclic part of not connect graph 
        graph.get(4).add(new Edge(4, 5, 0)) ; 
        graph.get(5).add(new Edge(5, 6, 0)) ; 
        graph.get(6).add(new Edge(6, 7, 0)) ; 
        graph.get(7).add(new Edge(7, 5, 0)) ; 

    }

    public boolean hasCycle(){
        int size = graph.size() ; 
        if(size == 0){
            return false ; 
        }
        boolean[] isVisited  = new boolean[size] ; 
        boolean[] stack = new boolean[size] ; 
        for ( int i = 0 ; i < size ; i++){
            if(!isVisited[i]){
                 if(helper(isVisited , stack , i)){
                    return true ; 
                 } 
            }
        }
        return false ; 
    } 

    private boolean helper(boolean[] isVisited , boolean[] stack ,  int curr){
        isVisited[curr] = true ; 
        stack[curr]  = true ; 

        for ( int i = 0 ;i < graph.get(curr).size() ; i++){
            Edge e = graph.get(curr).get(i) ;
            int temp = e.dest ; 
            if(stack[temp] == true){
                return true ; 
            } 
            if(!isVisited[temp]){
                if(helper(isVisited, stack, temp)){
                    return true ; 
                }
            }
        }
        stack[curr] = false ; 

        return false ; 
    }
}