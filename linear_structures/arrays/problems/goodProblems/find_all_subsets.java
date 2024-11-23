package Data_Structures_and_algorithms.linear_structures.arrays.problems.goodProblems;

import java.util.*;

//you have an array [1,2,3] find its all subsets

public class find_all_subsets {
    public static void main(String[] args) {
        int[] nums  = {1,2,3};
        List<List<Integer>> ans = subset(nums);
        for (List<Integer> i : ans){
            System.out.println(i);
        }
    }

    static List<List<Integer>> subset(int[] nums) {
        List<List<Integer>> outer = new ArrayList<>();

        // initally in outer i have empty arraylist
        outer.add(new ArrayList<>());

        for (int num : nums) {
            int size = outer.size();
            for (int i = 0; i < size; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);

            }
        }
        return outer;
    }
}

//Time complexity O(N * 2^n)
//Space complexity O(N)