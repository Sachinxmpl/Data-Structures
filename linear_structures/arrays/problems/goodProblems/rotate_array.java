package linear_structures.arrays.problems.goodProblems;

public class rotate_array {
    
}

//leetcode https://leetcode.com/problems/rotate-array/submissions/1472546155/

class Solution {
    public void rotate(int[] nums, int k) {
        int length = nums.length ; 

        k = k % length ; 
        reverse(nums , 0 , length - 1) ; 

        reverse(nums , 0 , k-1 );
        reverse(nums , k , length-1) ; 
    }

    void reverse(int[] nums , int start , int end){
        while(start < end){
            int temp = nums[start] ; 
            nums[start] = nums[end] ; 
            nums[end] = temp ; 

            start ++ ; 
            end -- ; 
        }
    }
}