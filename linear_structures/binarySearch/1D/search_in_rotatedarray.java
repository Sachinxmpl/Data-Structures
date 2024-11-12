public class search_in_rotatedarray {
        public static void main(String[] args) {
                int[] nums = {3,4,5,6,0,1,2} ; 
                int target = 3 ; 
                
        }

       static int searchElement(int[] arr , int target){
                int start =  0 ; 
                int end = arr .length -1 ; 

                while(start < end){
                        int mid = start + (end-start)/2 ; 

                        if(arr[mid] == target){
                                return mid ;
                        }

                        if(arr[mid])
                }
                return -1 ; 
       }
}
