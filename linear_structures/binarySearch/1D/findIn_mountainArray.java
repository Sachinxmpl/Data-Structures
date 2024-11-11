public class findIn_mountainArray {
        public static void main(String[] args) {
                int[] mountainArr = { 1, 2, 3, 4, 5, 6, 7, 6, 4, 2, 1, 0 };
                int target = 1 ; 
                int peakElementIndex = findPeakElement(mountainArr);
                int ans = binarySearch(mountainArr , target , 0 , peakElementIndex) ; 
                if(ans == -1){
                    ans = binarySearch(mountainArr , target , peakElementIndex+1 , mountainArr.length-1) ; 
                }
              System.out.println("At index " + ans ); 
        }

        static int findPeakElement(int[] mountainArr){
                int start = 0 ; 
                int end = mountainArr.length - 1 ; 
                while(start < end){
                  int mid = start + (end-start)/2 ; 
                  if(mountainArr[mid] >mountainArr[mid+1]){
                      end = mid ; 
                  }else{
                      start = mid + 1 ; 
                  }
                }
  
                return start ; 
      }




        static int binarySearch(int[] mountainArr, int target, int start, int end) {
                boolean isIncreasing = mountainArr[end] > mountainArr[start];

                while (start <= end) {
                        int mid = start + (end - start) / 2;
                        if (mountainArr[mid] == target) {
                                return mid;
                        }
                        if (isIncreasing) {
                                if (target >mountainArr[mid]) {
                                        start = mid + 1;
                                } else {
                                        end = mid - 1;
                                }
                        } else {
                                if (target < mountainArr[mid]) {
                                        start = mid + 1;
                                } else {
                                        end = mid - 1;
                                }
                        }
                }
                return -1;
        }
}


//time complexity O(logn)
//space O(1)