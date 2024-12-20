package Data_Structures_and_algorithms.non_linear_dataStructures.graph.problem.mode2.kahn'sAlgorithm;
import java.util.* ; 



//? Kahn's algorithm 
//Every node has indegree and outdegree . In DAG(Directed Acycle Graph) there is atlest one vertex with indegree 0 and atleast 1 vertex with outdegree 0
//approach 
//FInd the indegree for each vertex 
//The one with lowest (0) indegree comes at first of the top sort 
//And then iterate , this and that 


public class topSort {
    
}
//geeks for geeks 
//https://www.geeksforgeeks.org/problems/topological-sort/1

//!Time complexity O(V+E)
//!Auxilarry space complexity O(V)

class Solution {
    // Function to return list containing vertices in Topological order.
    static ArrayList<Integer> topologicalSort(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ans  = new ArrayList<>();
        int size = adj.size() ; 
        if(size == 0){
            return ans ; 
        }
        int[] indegree = new int[size] ; 
        calculateIndegree(adj , indegree) ; 
        
        Queue<Integer> que  = new LinkedList<>() ; 
        for ( int i = 0 ;i < indegree.length ; i++){
            if(indegree[i] == 0){
                que.add(i) ; 
            }
        }
        
        //bfs
        while(!que.isEmpty()){
            int curr = que.poll() ; 
            ans.add(curr);
            
            for (int i = 0 ;i < adj.get(curr).size() ; i++){
                int dest = adj.get(curr).get(i);
                indegree[dest]-- ; 
                if(indegree[dest] == 0){
                    que.add(dest) ;
                }
            }
        }
        
        return ans ; 
    }
    
    static void calculateIndegree(ArrayList<ArrayList<Integer>> adj , int[] indegree){
        for(int i = 0 ; i < adj.size() ; i++){
            for ( int j = 0 ;j < adj.get(i).size() ; j++){
                int dest = adj.get(i).get(j) ;
                indegree[dest]++ ; 
            }
        }
    }
}