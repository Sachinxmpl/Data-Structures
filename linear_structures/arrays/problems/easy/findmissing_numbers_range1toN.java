// Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

// Example 1:

// Input: nums = [4,3,2,7,8,2,3,1]
// Output: [5,6]
// Example 2:

// Input: nums = [1,1]
// Output: [2]

import java.util.ArrayList;
import java.util.Arrays;

public class findmissing_numbers_range1toN {
        public static void main(String[] args) {
                int[] nums={4,3,2,7,8,2,3,1} ; 
                ArrayList<Integer> missingNumbers = findMissingNumbers(nums);
                System.out.println(missingNumbers) ; 
                System.out.println(Arrays.toString(nums)) ;
        }

        static ArrayList<Integer> findMissingNumbers(int[] nums) {
                cycleSort(nums) ; 
                ArrayList<Integer> ans = new ArrayList<Integer>();
                for ( int i = 0 ; i < nums.length ; i++){
                        if(i != nums[i]-1){
                                ans.add(i+1) ; 
                        }
                }
                return ans ; 
        }

        static void cycleSort(int[] nums){
                int i = 0 ; 
                while(i < nums.length){
                        int correctIndex = nums[i] - 1 ;
                        if(nums[i] != nums[correctIndex]){
                                //swap 
                                int temp = nums[i] ; 
                                nums[i] = nums[correctIndex] ; 
                                nums[correctIndex] = temp ; 
                        }else{
                                i++ ; 
                        }
                }

        }
}
