package Data_Structures_and_algorithms.recursion.Arrays;

public class find_sortedArray {
    public static void main(String[] args) {
        int [] nums = {1,2,2,3,4,9,5};
        System.out.println(helper(nums, 0));
    }

    static boolean helper(int[] nums , int index ){
        if(index == nums.length - 1){
            return true ; 
        }
        return (nums[index]<= nums[index+1]) && (helper(nums, index+1));
    }
}


// space complexity O(N)
// time complexity O(N)