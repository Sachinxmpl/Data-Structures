public class ceiling_ofa_number {
            public static void main(String[] args) {
                        int[] nums = {2,3,5,9,14,16,18} ; 
                        System.out.println(ceiling_ofa_number.ceilOfNumber(nums , 19)) ;
            }
            static int ceilOfNumber(int[] arr , int target){
                        int start = 0 ; 
                        int end = arr.length - 1 ;
                       if(target > arr[end]){
                                return -1 ; 
                       }
                        while(start <= end){
                                    int mid = start + (end-start)/2 ; 
                                    if(target > arr[mid]){
                                                start  = mid + 1 ; 
                                                
                                    }else if (target < arr[mid]){
                                                end = mid - 1 ;
                                                
                                    }else{
                                                return arr[mid] ; 
                                    }
                        }



                        return arr[start] ; 
            }
}

//time complexity is O(logN)
//space complexity is O(1)
