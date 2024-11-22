import java.util.*;

public class peak_element_mountainarray {
        public static void main(String[] args) {
                int[] nums = { 0, 2, 3, 4, 5, 6, 7, 8, 9, 2, 0 };
                System.out.println(BinarySearch(nums));
        }

        static int BinarySearch(int[] arr) {
                int start = 0;
                int end = arr.length - 1;

                while (start < end) {
                        int mid = start + (end - start) / 2;
                        if (arr[mid] > arr[mid + 1]) {
                                // if arr[mid] is greateer than arr[mid+1] we are in decreasing part of array
                                // mountain element may be mid itself
                                // more possible it lies in [start , end=mid]
                                end = mid;
                        } else {
                                // i am in increasing part of array
                                // mountain element lies in [start = mid+1 , end]
                                start = mid + 1;
                        }
                }

                // when start == end = mountain element loop breaks
                // return arr[end] || arr[start]
                return arr[start];
        }
}
