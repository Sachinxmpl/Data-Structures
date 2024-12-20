package Data_Structures_and_algorithms.non_linear_dataStructures.graph.problem.mode2.BipartiteGraph;
import java.util.* ; 

public class isGraphBiparted {
    
}

//leetcode problem 785
//https://leetcode.com/problems/is-graph-bipartite/description/


class Solution {
    public boolean isBipartite(int[][] graph) {
        int size = graph.length;
        int[] color = new int[size];
        for (int i = 0; i < size; i++) {
            color[i] = -1;
        }

        for (int i = 0; i < size; i++) {
            if (color[i] == -1) {
                Queue<Integer> que = new LinkedList<>();
                que.add(i);
                color[i] = 5;
                while (!que.isEmpty()) {
                    int x = que.poll();
                    for (int j = 0; j < graph[x].length; j++) {
                        int temp = graph[x][j];
                        if (color[temp] == color[x]) {
                            return false;
                        }
                        if (color[temp] == -1) {
                            color[temp] = color[x] == 5 ? 0 : 5;
                            que.add(temp);
                        }
                    }
                }
            }
        }

        return true;
    }
}

















// Online Java Compiler
// Use this editor to write, compile and run your Java code online


// class Main {
//     public static void main(String[] args) {
//         Graph gh = new Graph(14) ; 
//         gh.createGraph() ; 
//         System.out.println(gh.hasCycle()) ; 
//         gh.BFS() ; 
//         System.out.println(gh.isBipartite()) ; 
//     }
// }

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
    
      public void createGraph() {
    // Even-length cycle (bipartite)
        graph.get(4).add(new Edge(4, 5, 1));
        graph.get(5).add(new Edge(5, 4, 1));

        graph.get(5).add(new Edge(5, 6, 1));
        graph.get(6).add(new Edge(6, 5, 1));

        graph.get(6).add(new Edge(6, 7, 1));
        graph.get(7).add(new Edge(7, 6, 1));

        graph.get(7).add(new Edge(7, 4, 1));
        graph.get(4).add(new Edge(4, 7, 1));
    }
    
    public boolean isBipartite(){
        int size = graph.size() ; 
        int[] color = new int[size] ;
        for ( int i = 0 ;i < size ; i++){
            color[i] = -1 ; 
        }
        for ( int i = 0 ; i < size; i++){
            if(color[i] == -1){
                Queue<Integer> que = new LinkedList<>() ; 
                que.add(i) ; 
                color[i] = 5 ; 
                while(!que.isEmpty()){
                    int x = que.poll() ; 
                    for ( int j = 0 ; j < graph.get(x).size() ; j++){
                        Edge e = graph.get(x).get(j) ; 
                        int temp = e.dest ; 
                        if(color[temp] == -1){
                            color[temp] = (color[x] == 5)? 0 : 5;
                            que.add(temp) ; 
                        }
                        if(color[temp] == color[x]){
                            return false ; 
                        }
                    }
                }
            }
        }
        return true ; 
    }
    
    public void BFS(){
       int size = graph.size() ; 
       boolean[] isVisited = new boolean[size] ; 
       for ( int i = 0 ; i < size ; i++){
           if(!isVisited[i]){
               util(isVisited , i) ; 
           }
       }
    }
    public void util(boolean[] isVisited , int curr){
        Queue<Integer> que = new LinkedList<>() ; 
        que.add(curr) ; 
        isVisited[curr] = true ; 
        
        while(!que.isEmpty()){
            int item = que.poll();
            System.out.print(item + " ") ; 
            for ( int i = 0 ; i < graph.get(curr).size() ; i++){
                 Edge e = graph.get(curr).get(i) ; 
                 int x = e.dest ; 
                 if(!isVisited[x]){
                     que.add(x) ; 
                     isVisited[x] = true ; 
                 }
            }
        }
        System.out.println() ; 
    }
    
    
    public boolean hasCycle(){
        int size = graph.size() ; 
        boolean[] isVisited = new boolean[size] ; 
        for ( int i = 0; i < size ; i++){
            if(!isVisited[i]){
                if(helper(isVisited , i , -1)){
                    return true ; 
                }
            }
        }
        
        return false ; 
    }
    
    public boolean helper(boolean[] isVisited  , int curr , int parent){
        isVisited[curr] = true ;
        
        for ( int i = 0 ;i < graph.get(curr).size() ; i++){
            Edge e = graph.get(curr).get(i) ; 
            int x = e.dest ; 
            if(isVisited[x] && x != parent){
                return true ; 
            }
            if(!isVisited[x]){
                if(helper(isVisited , x , curr)){
                    return true ; 
                }
            }
        }
        
        return false ; 
    }

}