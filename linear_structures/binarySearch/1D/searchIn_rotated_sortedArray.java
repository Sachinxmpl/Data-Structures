
public class searchIn_rotated_sortedArray {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,0,1,2};
        int target = 5 ; 
        int pivot = findPivot(arr);
        System.out.println(pivot + " "+  arr[pivot]);
        int ans = BinarySearch(arr,target , 0 , pivot);
        if(ans == -1){
            ans = BinarySearch(arr, target, pivot+1, arr.length-1);
        }
        System.out.println(ans);
    }

    static int findPivot(int[] arr){
        int start = 0 ; 
        int end  = arr.length -1 ; 
        while(start <= end){
            int mid = start + (end - start)/2 ; 
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid ; 
            } if (mid > start && arr[mid] < arr[mid-1]){
                return mid-1 ; 
            }if (arr[start] >= arr[mid]){
                end =  mid -1 ; 
            } if (arr[start] < arr[mid]){
                start = mid ; 
            }
        }
        return -1 ; 
    }


    static int BinarySearch(int[] arr, int target , int start , int end) {
        while (start <= end) {
              // int mid = (start+end)/2 start+end might go out of integer range
              int mid = start + (end - start) / 2;

              if (target == arr[mid]) {
                    return mid;
              } else if (target < arr[mid]) {
                    end = mid - 1;
              } else {
                    start = mid + 1;
              }
        }

        return -1;
  }
}



//Suppose the initail sorted array was [0,1,2,3,4,5,6,7]
//After 5 rotations the array becomes arr =  [3,4,5,6,7,0,1,2]
//Now we have to find in that roated sorted array 

//1 Approach 1 
// Find the pivot element (maximum element) which is 7 is above arr 
// Binary search in lowerhalf and biary seach in upper half simple 

// How to find the pivot 