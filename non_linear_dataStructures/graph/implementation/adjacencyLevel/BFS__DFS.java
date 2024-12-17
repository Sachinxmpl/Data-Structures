package Data_Structures_and_algorithms.non_linear_dataStructures.graph.implementation.adjacencyLevel;

import java.util.* ; 

public class BFS__DFS {
    static private class edge{
        int src ; 
        int dest ;
        int wt ;  

        public edge(int x, int d, int w){
            this.src = x ;
            this.dest = d ; 
            this.wt = w ; 
        }
    }

    static void createGraph(ArrayList<edge>[] graph){
        // time O(V)
        for ( int i = 0 ; i < graph.length ; i++){
            graph[i] = new ArrayList<>() ; 
        }

        //time for adding edge O(2*E) each edge added twice ==> undirected graph
        graph[0].add(new edge(0, 1, 1)) ; 
        graph[0].add(new edge(0, 2, 1)) ; 

        graph[1].add(new edge(1, 0, 1)) ; 
        graph[1].add(new edge(1, 3, 1)) ; 

        graph[2].add(new edge(2, 0, 1)) ; 
        graph[2].add(new edge(2, 4, 1)) ; 

        graph[3].add(new edge(3, 1, 1)) ; 
        graph[3].add(new edge(3, 4, 1)) ; 
        graph[3].add(new edge(3, 5, 1)) ; 

        graph[4].add(new edge(4, 2, 1)) ; 
        graph[4].add(new edge(4, 3, 1)) ; 
        graph[4].add(new edge(4, 5, 1)) ; 


        graph[5].add(new edge(5, 4, 1)) ; 
        graph[5].add(new edge(5, 3, 1)) ; 
        graph[5].add(new edge(5, 6, 1)) ; 

        graph[6].add(new edge(6, 5, 1)) ; 
    }



    //since there are v vertices time for queue operation O(V)
    //For every vertex V , BFS examines it neight ==> O(E)
    //total time O(V+E)
    public static void bfs(ArrayList<edge>[] graph){
        if(graph.length == 0){
            return ; 
        }

        //source 
        Queue<Integer> que = new LinkedList<>() ; 
        boolean isVisited[]  = new boolean[graph.length] ; 
        que.add(0) ; 

        while(!que.isEmpty()){
            int curr = que.poll() ; 

            if(!isVisited[curr]){
                System.out.print(curr + " ");
                isVisited[curr] = true ; 

                for ( int i = 0 ; i < graph[curr].size() ; i++){
                    edge e = graph[curr].get(i) ; 
                    que.add(e.dest) ; 
                }
            }
        }
    }



    //time O(V+E)
    public static void DFS(ArrayList<edge>[] graph){
        if(graph.length == 0){
            return  ; 
        }
        boolean isVisited[]  = new boolean[graph.length] ; 
        dfs(graph , 0 ,  isVisited);
    }
    public static void dfs(ArrayList<edge>[] graph , int curr  ,boolean isVisited[] ){
        System.out.print(curr + " ");
        isVisited[curr] = true ; 

        for ( int i = 0 ;i < graph[curr].size() ; i++ ){
            edge t = graph[curr].get(i) ; 
            int x = t.dest ; 
            if(!isVisited[x]){
                dfs(graph, x, isVisited);
            }
        }
    }


    public static boolean hasPath(ArrayList<edge>[] graph  , int src , int dest){
        boolean isVisited[]  = new boolean[graph.length] ; 
        return helper(graph , src, dest , isVisited) ; 
    }

    public static  boolean helper(ArrayList<edge>[] graph  , int src , int dest , boolean[] isVisited){
        if(src == dest){
            return true ; 
        }
        isVisited[src] = true ; 
        for( int i = 0 ;i < graph[src].size() ; i++){
            edge t = graph[src].get(i) ; 
            int x = t.dest ; 
            if(!isVisited[x]){
                if (helper(graph, x, dest, isVisited)) {
                    return true;  // Return true as soon as a path is found
                }
            }
        }
        return false ; 
    }










    public static void main(String[] args) {
        /*
         *              1 ---------- 3
         *             /             | \
         *            /             |   \
         *           0             |     5  ----- 6
         *            \            |    /
         *             \          |  |
         *              2 ------  4
         */

        int V = 7 ; 

        @SuppressWarnings("unchecked")
        ArrayList<edge>[] graph = new ArrayList[V] ;
        createGraph(graph); 
        bfs(graph) ; 
        System.out.println("\n++++++++++++++++");
        DFS(graph)  ;
        System.out.println("______________");

        boolean path = hasPath(graph , 0 , 5) ; 
        System.out.println("Visited + " + path );
    }
}
