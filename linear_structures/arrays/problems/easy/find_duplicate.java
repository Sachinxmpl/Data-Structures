// Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

// There is only one repeated number in nums, return this repeated number.

// You must solve the problem without modifying the array nums and using only constant extra space.

 

// Example 1:

// Input: nums = [1,3,4,2,2]
// Output: 2
// Example 2:

// Input: nums = [3,1,3,4,2]
// Output: 3

package linear_structures.arrays.problems.easy;
import java.util.Arrays;

public class find_duplicate {
        public static void main(String[] args) {
                int[] nums = {3, 1, 3, 4, 2};
                System.out.println(findDuplicateGood(nums));
        }

        //? good solution 
        static int findDuplicateGood(int[] nums){
                int i = 0  ; 
                while(i < nums.length){
                        if(nums[i] != i+1){
                                int correctIndex = nums[i] -1 ; 
                                if(nums[i] != nums[correctIndex]){
                                        int temp = nums[i] ; 
                                        nums[i] = nums[correctIndex] ; 
                                        nums[correctIndex] = temp ; 
                                }else{
                                        return nums[i] ; 
                                }

                        }else{
                                i++ ; 
                        }
                }
                return -1 ; 
        }

        static int findDuplicate(int[] nums){
                //using cycle sort method 
                cycleSort(nums);
                System.out.println(Arrays.toString(nums));
                return nums[nums.length-1] ; 
        }

        static void cycleSort(int[] arr){
                int i = 0 ; 
                while(i < arr.length){
                        int correctIndex = arr[i] - 1 ; 
                        if(arr[i] != arr[correctIndex]){
                                //swap eleement at arr[i] to its correctIndex 
                                int temp = arr[i]  ; 
                                arr[i] = arr[correctIndex] ; 
                                arr[correctIndex] = temp ; 
                        }
                        else{
                                i++ ; 
                        }
                }
        }
}


