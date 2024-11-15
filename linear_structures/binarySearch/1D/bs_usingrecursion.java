public class bs_usingrecursion {
        public static void main(String[] args) {
                int arr[] = {2, 4, 6, 8,9,10,13,16,18,19,20};
                int target = 1 ;
                int ans = BinarySearch(arr , target , 0 , arr.length-1);
                System.out.println(ans);
        }

        static int BinarySearch(int[] arr , int target , int start , int end){
                int mid = start + (end-start)/2 ; 
                if(start > end){
                        return -1 ; 
                }
                if(target == arr[mid]){
                        return mid ; 
                }

                else if(target > arr[mid]){
                        return BinarySearch(arr, target, mid+1, end);
                } 
                
                        return BinarySearch(arr, target, start, mid-1);
                
                
        }
}
