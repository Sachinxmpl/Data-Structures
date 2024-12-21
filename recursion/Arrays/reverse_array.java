package recursion.Arrays;

import java.util.Arrays;

public class reverse_array {
        public static void main(String[] args) {
                int[] nums = { 1, 1, 2, 3, 4, 5, 6, 9, 7, 8, 9 };
                System.out.println(Arrays.toString(nums));
        }

        static void reverse(int[] nums) {
                int s = 0;
                int e = nums.length - 1;
                helper2(nums, s, e);
        }

        static void helper2(int[] nums, int s, int e) {
                if (s >= e) {
                        return;
                }
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                helper2(nums, s + 1, e - 1);
        }
}
