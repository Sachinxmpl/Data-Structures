package Data_Structures_and_algorithms.non_linear_dataStructures.graph.problem.mode2.kahn'sAlgorithm;
import java.util.* ; 


public class topSort {
    
}


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