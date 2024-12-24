package recursion.Backtracking;

import java.util.ArrayList;
import java.util.Collections;

public class ratInMaze {
        
}
class Solution {
        // Function to find all possible paths
        public ArrayList<String> findPath(ArrayList<ArrayList<Integer>> mat) {
            ArrayList<String> ans = new ArrayList<String>() ; 
            int size = mat.size() ; 
            boolean[][] isvisited = new boolean[size][size] ; 
            if (mat.get(0).get(0) == 0 || mat.get(mat.size() - 1).get(mat.size() - 1) == 0) {
                 return ans; // No path possible
            }
            helper(mat , "" ,  0 , 0 , ans , isvisited );
            Collections.sort(ans);
            return ans ; 
        }
        
        static void helper(ArrayList<ArrayList<Integer>> mat , String p , int row ,int col , ArrayList<String> ans , boolean[][] isvisited ){
            if(row < 0 || col < 0 || row >=mat.size() || col >=mat.size()){
                return ; 
            }
            if(row == mat.size()-1 && col == mat.size()-1 ){
                ans.add(p) ; 
                return ; 
            }
            if(mat.get(row).get(col) == 0 || isvisited[row][col]){
                return ; 
            }
            isvisited[row][col] = true ; 
            
           
            if(row < mat.size()-1){
                helper(mat, p + "D" , row + 1 , col , ans , isvisited) ; 
            }
            
            if(col < mat.size()-1){
                helper(mat, p + "R" , row , col + 1, ans , isvisited) ; 
            }
              if(row > 0){
                helper(mat , p + "U" , row-1 , col, ans , isvisited) ; 
            }
            if(col > 0){
                helper(mat , p + "L" , row , col -1, ans , isvisited) ; 
            }
           
            isvisited[row][col] = false ; 
        }
    }