package Data_Structures_and_algorithms.non_linear_dataStructures.graph.problem.mode3;

import java.util.* ; 

public class course_schedule2 {
    
}

//problem 210
//https://leetcode.com/problems/course-schedule-ii/

class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] ans = new int[numCourses];
        int indexer = 0;
        if (numCourses == 0) {
            return ans;
        }
        int[] indeg = new int[numCourses];
        helper(numCourses, prerequisites, indeg);

        Queue<Integer> que = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (indeg[i] == 0) {
                que.add(i);
            }
        }

        while (!que.isEmpty()) {
            int x = que.poll();
            ans[indexer++] = x;
            for (int i = 0; i < prerequisites.length; i++) {
                for (int j = 0; j < prerequisites[i].length; j++) {
                    if(prerequisites[i][1] == x){
                        int temp = prerequisites[i][0] ;
                        indeg[temp]-- ; 
                        if(indeg[temp]== 0){
                            que.add(temp) ; 
                        }
                    }
                }
            }
        }

        if (indexer != numCourses) {
            return new int[0]; // Return empty array if there's a cycle
        }

        return ans ; 
    }

    void helper(int numCourses, int[][] prerequisites, int[] indeg) {
        for (int i = 0; i < prerequisites.length; i++) {
            for (int j = 0; j < prerequisites[i].length; j++) {
                int x = prerequisites[i][0];
                indeg[x]++;
            }
        }
    }
}