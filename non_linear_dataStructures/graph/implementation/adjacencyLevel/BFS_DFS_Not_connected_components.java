package Data_Structures_and_algorithms.non_linear_dataStructures.graph.implementation.adjacencyLevel;

import java.util.*;

public class BFS_DFS_Not_connected_components {
    public static void main(String[] args) {
        Graph graph = new Graph(14); // Adjust size based on the number of nodes
        graph.createGraph();
        System.out.println("BFS Traversal:");
        graph.BFS();
        System.out.println("++++++++++++++++++");
        graph.DFS();
    }
}

class Graph {
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

    // Breadth-First Search
    public void BFS() {
        int size = graph.size();
        if (size == 0) {
            return;
        }

        boolean[] isVisited = new boolean[size];
        for (int i = 0; i < size; i++) {
            if (!isVisited[i]) {
                bfsUtil(i, isVisited);
            }
        }
    }

    private void bfsUtil(int start, boolean[] isVisited) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        isVisited[start] = true;

        while (!queue.isEmpty()) {
            int curr = queue.poll();
            System.out.print(curr + " ");

            for (Edge e : graph.get(curr)) {
                int neighbor = e.dest;
                if (!isVisited[neighbor]) {
                    queue.add(neighbor);
                    isVisited[neighbor] = true;
                }
            }
        }
        System.out.println(); // Separate components
    }




    //Depth first search 
    public void DFS(){
        int size = graph.size() ; 
        if(size == 0){
            return ; 
        }
        boolean[] isVisited = new boolean[size] ; 
        for ( int i = 0 ;i < size ; i++){
            if(!isVisited[i]){
                dfsUtil(i , isVisited) ; 
            }
        }
    }
    private void dfsUtil(int curr , boolean[] isVisited){
        System.out.print(curr + " ");
        isVisited[curr] = true ; 

        for ( int i = 0 ; i < graph.get(curr).size() ; i++){
            Edge e = graph.get(curr).get(i) ; 
            int x = e.dest ; 
            if(!isVisited[x]){
                dfsUtil(x, isVisited);
            }
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
        graph.get(3).add(new Edge(3, 4, 1));
        graph.get(3).add(new Edge(3, 5, 1));

        graph.get(4).add(new Edge(4, 2, 1));
        graph.get(4).add(new Edge(4, 3, 1));
        graph.get(4).add(new Edge(4, 5, 1));

        graph.get(5).add(new Edge(5, 4, 1));
        graph.get(5).add(new Edge(5, 3, 1));
        graph.get(5).add(new Edge(5, 6, 1));

        graph.get(6).add(new Edge(6, 5, 1));

        graph.get(9).add(new Edge(9, 10, 1));

        graph.get(10).add(new Edge(10, 9, 1));
        graph.get(10).add(new Edge(10, 11, 1));

        graph.get(11).add(new Edge(11, 10, 1));

        graph.get(12).add(new Edge(12, 13, 1));

        graph.get(13).add(new Edge(13, 12, 1));
    }
}
