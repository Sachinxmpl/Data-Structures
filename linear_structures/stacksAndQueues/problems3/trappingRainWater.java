package linear_structures.stacksAndQueues.problems3;

public class trappingRainWater {
    
}
//!leetcode hard 42 
//https://leetcode.com/problems/trapping-rain-water/





//! Time complexity
// for creating leftmax O(n)
//for createing rightMax O(n)
//for performing height operation O(N)]
//total O(3N)

//! Space 
// leftMax and rightMax O(N + N) = O(2N)

class Solution {
    public int trap(int[] height) {
        int[] prefixMax = getPrefixMax(height) ; 
        int[] suffixMax = getSuffixMax(height) ; 
        int count = 0 ; 
        
        for(int i = 1 ;i < height.length ; i++){
            int currHeight = height[i] ; 
            int left = prefixMax[i] ; 
            int right = suffixMax[i] ; 
            int x = Math.min(left, right) - currHeight ; 
            if(x > 0){
                count = count + x ; 
            }
        }

        return count ; 
    }

    int[] getPrefixMax(int[] height){
        int[] temp = new int[height.length] ; 
        temp[0] = height[0] ;
        for(int i = 1 ; i < height.length ; i++){
            temp[i] = Math.max(temp[i-1] , height[i]) ; 
        }

        return temp ; 
    }

    int[] getSuffixMax(int[] height){
        int[] temp = new int[height.length] ;
        temp[height.length-1] = height[height.length-1] ; 
        for(int i = height.length  - 2 ; i >=0 ; i--){
            temp[i] = Math.max(temp[i+1] , height[i]) ; 
        }
        return temp ; 
    }
}