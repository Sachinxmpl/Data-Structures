package linear_structures.arrays.problems.easy;

import java.util.ArrayList;
import java.util.List;

public class find_allduplicates {
      public static void main(String[] args) {
            int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
            List<Integer> ans = findDuplicates(nums);
            System.out.println(ans);
      }

      static List<Integer> findDuplicates(int[] nums) {
            List<Integer> result = new ArrayList<Integer>();

            int i = 0;
            while (i < nums.length) {
                  int correctIndex = nums[i] - 1;
                  if (nums[i] != nums[correctIndex]) {
                        int temp = nums[i];
                        nums[i] = nums[correctIndex];
                        nums[correctIndex] = temp;
                  } else {
                        i++;
                  }
            }

            for (int j = 0; j < nums.length; j++) {
                  if (nums[j] != j + 1) {
                        result.add(nums[j]);
                  }
            }

            return result;
      }
}
