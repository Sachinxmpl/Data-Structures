// You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

// You are given an integer array nums representing the data status of this set after the error.

// Find the number that occurs twice and the number that is missing and return them in the form of an array.

 

// Example 1:

// Input: nums = [1,2,2,4]
// Output: [2,3]
// Example 2:

// Input: nums = [1,1]
// Output: [1,2]



package linear_structures.arrays.problems.easy;
import java.util.*;
public class set_mismatch {
        //cyclesort
        public static void main(String[] args) {
                int[] nums = {5,2,4,1,2};
                int ans[] = findErrorNums(nums);
                System.out.println(Arrays.toString(ans));
        }
        
        static int[] findErrorNums(int[] nums) {
                cycleSort(nums);
                int[] ans = new int[2];
                for ( int i = 0 ; i < nums.length ; i++ ){
                    if(nums[i] != i+1){
                        ans[0] = nums[i];
                        ans[1] = i+1 ;
                    }
                }
                return ans ; 
            }
        
            static void cycleSort(int[] nums){
                int i = 0 ; 
                while(i < nums.length){
                    int correctIndex = nums[i] - 1 ; 
                    if(nums[i] != nums[correctIndex]){
                        int temp = nums[i] ; 
                        nums[i] = nums[correctIndex];
                        nums[correctIndex] = temp; 
                    }else{
                        i++ ; 
                    }
                }
            }
}
