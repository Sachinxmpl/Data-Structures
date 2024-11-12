
import java.util.Arrays;

public class bubble_Sort {
        public static void main(String[] args) {
                int[] nums = { 5, 4, 3, 2, 1, 0 };
                optimizedBubblesort(nums);
                System.out.println(Arrays.toString(nums));
        }

        static void optimizedBubblesort(int[] nums) {
                int n = nums.length;
                for (int i = 0; i < n - 1; i++) {
                        boolean swap = false;
                        for (int j = 0; j < n - i - 1; j++) {
                                if (nums[j] > nums[j + 1]) {
                                        int temp = nums[j];
                                        nums[j] = nums[j + 1];
                                        nums[j + 1] = temp;
                                        swap = true;
                                }
                        }

                        if (!swap) {
                                break;
                        }
                }
        }

        static void BubbleSort(int[] nums) {
                int n = nums.length;
                for (int i = 0; i < n - 1; i++) {

                        for (int j = 0; j < n - i - 1; j++) {
                                if (nums[j] > nums[j + 1]) {
                                        int temp = nums[j];
                                        nums[j] = nums[j + 1];
                                        nums[j + 1] = temp;

                                }
                        }
                }
        }
}

//?  for not optimized
// best case time complexity ==> O(n)
// worst case time complexity ==> 0(n2)

//? for optimized bubble sort
// best case time complexity ==> O(1)
// worst case ==> O{n2}

//? space complexity
// O(1) ==> inplace sorting algorithm

// 5 4 3 2 1

// sort in ascending order
// 1st iteration i = 0
// j = 0 ------> 4 5 3 2 1
// j = 1 ------> 4 3 5 2 1
// j = 2 ------> 4 3 2 5 1
// j = 3 ------> 4 3 2 1 5

// 2nd iteration i = 1
// j = 0 ------>3 4 2 1 5
// j = 1 ------>3 2 4 1 5
// j==2 ------> 3 2 1 4 5

// 3rd iteration i = 2
// j = 0 ------> 2 3 1 4 5
// j = 1 ------> 2 1 3 4 5

// 4th iteration i =3
// j = 0 -------> 1 2 3 4 5

// total comparision == (N-1) + (N-2) + (N-3) + ........ + 1


//? Stable sorting algoritim 
// Order of equal numbers also reamains same 
