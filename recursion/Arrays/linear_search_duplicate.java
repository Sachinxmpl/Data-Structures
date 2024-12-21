package recursion.Arrays;

import java.util.ArrayList;

public class linear_search_duplicate {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 5, 23, 23, 56, 23 };
        System.out.println(Search(nums, 23));
    }

    static ArrayList<Integer> Search(int[] nums, int target) {
        ArrayList<Integer> ans = new ArrayList<>();
        Helper(nums, target, 0, ans);
        return ans;
    }

    static void Helper(int[] nums, int target, int index, ArrayList<Integer> ans) {
        if (index == nums.length) {
            return;
        }
        if (nums[index] == target) {
            ans.add(index);
        }
        Helper(nums, target, index + 1, ans);
    }
    // Time complexity O(N)
    // Space complexity O(N+k) n for stack , k for arraylist
}
