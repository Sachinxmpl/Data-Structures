//leetcode 496
//https://leetcode.com/problems/next-greater-element-i/


//?Time O(nums1.length * nums2.length)
//?Space O(nums1.length)

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length] ; 
        for(int i = 0 ; i < nums1.length ; i++){
            int nextGreater = helper(nums1[i] , nums2) ; 
            ans[i] = nextGreater ; 
        }

        return ans ; 
    }
    public int helper(int x , int[] nums){
        int ans = -1 ; 
        int index = -1 ;
        for(int i = 0 ;i < nums.length ; i++){
            if(nums[i] == x){
                index  = i ;
                break ; 
            }
        }

        for(int i = index ; i < nums.length ; i++){
            if(nums[i] > x){
                ans = nums[i] ; 
                break ; 
            }
        }

        return ans ; 
    }
}