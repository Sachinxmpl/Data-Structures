package recursion.patternsANDsort;

import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {
        int[] nums = { 5, 4, 3, 9, 0, 2, 1 };
        // sort(nums);
        sort(nums, 0, 0);
        System.out.println(Arrays.toString(nums));
    }

    static void sort(int[] nums, int i, int j) {

        if (i == nums.length - 1) {
            return;
        }

        if (j == nums.length - i - 1) {
            sort(nums, i + 1, 0);
            return;
        }

        // swap
        if (nums[j] > nums[j + 1]) {
            int temp = nums[j];
            nums[j] = nums[j + 1];
            nums[j + 1] = temp;
        }
        sort(nums, i, j + 1);

    }

    // iterative way
    static void sort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            boolean swap = false;
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swap = true;
                }
            }

            if (swap == false) {
                break;
            }
        }
    }
}
