public class position_ofelement_infinitearray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9, 12, 13, 14, 16, 19, 20, 24, 26, 27, 29, 30, 31, 34, 36, 47}; 
        int target = 36; 
        System.out.println(findPosition(arr, target));
    }

    static int findPosition(int[] arr, int target) {
        int start = 0;
        int end = 1;

        // Expand the range exponentially
        while (true) {
            try {
                if (target <= arr[end]) {
                    break; // Target is within the current range
                }
                int newStart = end + 1;
                end = end + (end - start + 1) * 2;
                start = newStart;
            } catch (ArrayIndexOutOfBoundsException e) {
                // Set end to the last accessible index if out of bounds
                end -= (end - start + 1) / 2; // Reduce end by half
                break;
            }
        }

        // Perform binary search in the known range
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            try {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                end = mid - 1; // Adjust end if mid is out of bounds
            }
        }
        return -1; // Target not found
    }
}
