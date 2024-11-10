public class floor_ofa_number {
            public static void main(String[] args) {
                        int[] nums= {2,3,5,9,14,16,18} ; 
                        System.out.println(FloorOfANumber (nums , 13)) ;
            }

            static int  FloorOfANumber (int[] arr , int target){
                        int start = 0 ; 
                        int end = arr.length - 1; 
                        while(start <= end){
                                    int mid = start + (end-start)/2 ; 
                                    if(arr[mid] > target){
                                                end = mid -1  ; 
                                    }
                                    else if(arr[mid] < target){
                                                start = mid + 1 ; 
                                    }
                                    else{
                                                return arr[mid] ; 
                                    }
                        }
                        return arr[end] ; 
            }
}
