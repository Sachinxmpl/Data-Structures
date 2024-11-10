
public class orderAgnostics_search {
            public static void main(String[] args) {
                        int[] arr = { 45 , 23, 5 , 1 , -18};
                        int target = -18;
                        int ans = BinarySearch(arr, target);
                        System.out.println("The index is " + ans);
            }

            static int BinarySearch(int[] arr, int target) {
                        
                        //cheack if ascending or descending sorted 
                        boolean isAscending = arr[0] <= arr[arr.length - 1] ; 


                        int start = 0;
                        int end = arr.length - 1;
                        while (start <= end) {
                                    // int mid = (start+end)/2 start+end might go out of integer range
                                    int mid = start + (end - start) / 2;

                                    if (target == arr[mid]) {
                                                return mid;
                                    }

                                    if(isAscending){
                                                if(target > arr[mid]){
                                                            start = mid +1 ; 
                                                }else{
                                                            end = mid -1 ; 
                                                }
                                    }
                                    else{
                                                if(target > arr[mid]){
                                                            end = mid -1 ; 
                                                }else{
                                                            start = mid +1 ; 
                                                }
                                    }
                        }

                        return -1;
            }
}
