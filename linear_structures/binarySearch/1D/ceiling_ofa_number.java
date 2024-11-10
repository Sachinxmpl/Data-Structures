public class ceiling_ofa_number {
            public static void main(String[] args) {
                        int[] nums = {2,3,5,9,14,16,18} ; 
                        System.out.println(ceiling_ofa_number.ceilOfNumber(nums , 15)) ;
            }
            static int ceilOfNumber(int[] arr , int target){
                        int start = 0 ; 
                        int end = arr.length - 1 ;
                        int ans = -1 ; 
                        while(start <= end){
                                    int mid = start + (end-start)/2 ; 
                                    if(target > arr[mid]){
                                                start  = mid + 1 ; 
                                                ans  = arr[mid+1] ;

                                    }else if (target < arr[mid]){
                                                end = mid - 1 ;
                                                ans = arr[mid] ; 
                                    }else{
                                                return arr[mid] ; 
                                    }
                        }

                        return ans ; 
            }
}
