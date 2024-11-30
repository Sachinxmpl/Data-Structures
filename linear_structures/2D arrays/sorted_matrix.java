//leetcode problem 74
// You are given an m x n integer matrix matrix with the following two properties:

// Each row is sorted in non-decreasing order.
// The first integer of each row is greater than the last integer of the previous row.
// Given an integer target, return true if target is in matrix or false otherwise.

// You must write a solution in O(log(m * n)) time complexity.

import java.util.Arrays;

public class sorted_matrix {
    public static void main(String[] args) {
        int[][] nums = {
            {4,5,6,7,8},
            {9,10,12,13,15},
            {16,17,18,19,20},
            {21,22,23,25,26}
        };

        int[] ans = binarySearch(nums, 29);
        System.out.println(Arrays.toString(ans));
    }
    static int[] binarySearch(int[][] nums , int target){
        if(nums == null || nums.length == 0){
            return new int[] {-1,-1};
        }
        int start = 0 ;
        int rows = nums.length ;
        int cols = nums[0].length;
        int end = rows * cols -1 ; 
        while(start <=end){
            int mid = start + (end-start)/2 ; 
            int x = mid/cols ; 
            int y = mid % cols ; 
            if(target == nums[x][y]){
                return new int[] {x,y};
            }
            else if ( target > nums[x][y]){
                start = mid + 1 ; 
            }else {
                end = mid - 1 ; 
            }
        }
        return new int[]{-1,-1};
    }
}
