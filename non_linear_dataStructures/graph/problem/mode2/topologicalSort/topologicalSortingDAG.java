package Data_Structures_and_algorithms.non_linear_dataStructures.graph.problem.mode2.topologicalSort;

import java.util.* ; 

public class topologicalSortingDAG {
    
}

//geeks for geeks 
//https://www.geeksforgeeks.org/problems/topological-sort/1

class Solution {
    // Function to return list containing vertices in Topological order.
    static ArrayList<Integer> topologicalSort(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ans = new ArrayList<>() ; 
        int size = adj.size() ; 
        if(size == 0){
            return ans;
        }
        boolean[] isVisited = new boolean[size] ; 
        Stack<Integer> sc = new Stack<>() ; 
        for ( int i = 0 ; i < size ; i++){
            if(!isVisited[i]){
                 helper(sc, isVisited, i , adj) ; 
            }
        }
        while(!sc.isEmpty()){
            ans.add(sc.pop()) ; 
        }
        return ans ; 
      
    }
    
    static void helper(Stack<Integer> sc ,boolean[] isVisited , int start , ArrayList<ArrayList<Integer>> adj ){
         isVisited[start] = true ; 
         
         for ( int i = 0 ; i < adj.get(start).size() ; i++){
             int temp = adj.get(start).get(i) ; 
             if(!isVisited[temp]){
                 helper(sc , isVisited, temp , adj) ; 
             }
         }
         sc.push(start); 
    }
}