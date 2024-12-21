package recursion.Arrays;

public class linear_search {
    public static void main(String[] args) {
        int[] nums = {23,5,7,23,78,6};
        System.out.println(Search(nums, 0, 6));
    }

    static int Search(int[] nums , int index , int target){
        if(index == nums.length){
            return -1;
        }
        if(nums[index] == target){
            return index;
        }
        return Search(nums, index+1, target);
    }
}

//time and spaze O(N)