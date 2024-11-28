package recursion.mergeSort;

import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
        int[] nums = { 4, 5, 21, 6, 2, 4, 7, 5 };
        mergeSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    static void mergeSort(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;
        mergeSort(nums, start, mid);
        mergeSort(nums, mid + 1, end);

        merge(nums, start, mid, end);
    }

    static void merge(int[] nums, int start, int mid, int end) {
        int an = mid - start + 1;
        int bn = end - mid;

        int[] arr1 = new int[an];
        int[] arr2 = new int[bn];

        for (int i = 0; i < an; i++) {
            arr1[i] = nums[start + i];
        }
        for (int i = 0; i < bn; i++) {
            arr2[i] = nums[mid + 1 + i];
        }

        int x = 0;
        int y = 0;
        int z = start;

        while (x < an && y < bn) {
            if (arr1[x] < arr2[y]) {
                nums[z] = arr1[x];
                z++;
                x++;
            } else {
                nums[z] = arr2[y];
                z++;
                y++;
            }
        }
        while (x < an) {
            nums[z] = arr1[x];
            z++;
            x++;
        }
        while (y < bn) {
            nums[z] = arr2[y];
            z++;
            y++;
        }
    }
}
