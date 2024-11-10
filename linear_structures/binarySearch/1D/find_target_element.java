import java.util.*;

public class find_target_element {
      public static void main(String[] args) {
            int[] arr = {  -18, 0 ,2, 4, 6, 9, 11, 12, 14, 20, 36, 48 };
            int target = -18;
            int ans = BinarySearch(arr, target);
            System.out.println("The index is " + ans);
      }

      static int BinarySearch(int[] arr, int target) {
           int start = 0 ; 
           int end = arr.length - 1 ; 
           while(start <=end){
                  // int mid = (start+end)/2   start+end might go out of integer range 
                  int mid = start + (end-start)/2 ;

                  if(target == arr[mid]){
                        return mid ; 
                  }
                  else if (target < arr[mid]){
                        end = mid-1 ; 
                  }
                  else {
                        start = mid + 1 ; 
                  }
           }

           return -1 ; 
      }
}

//best time complexity O(1)
// worst time complexity O(log n)