import java.util.* ; 

public class first_and_last_positionof_element_sortedarray {
            public static void main(String[] args) {
                        int nums[] = {1,3,4,5,7,7,7,7,7,7,8,9,12} ; 
                        int target = 7 ; 
                        int [] ans = {-1 , -1} ; 
                        ans[0] = searchElement(nums , target , true) ; 
                        ans[1] = searchElement(nums , target , false) ; 
                        System.out.println(Arrays.toString(ans)) ; 
            }

            //timecomplexity O(logN)
// Space Complexity O(1)

            static int searchElement(int[] arr , int target , boolean findFirstOccurence){
                        int start = 0 ; 
                        int end = arr.length -1 ; 
                        int ans  = -1 ; 
                        while(start <=end){
                            int mid = start + (end-start)/2 ; 
                            if(target > arr[mid]){
                                start = mid + 1 ;
                            }
                            else if (target < arr[mid]){
                                end = mid - 1; 
                            }
                            else {
                                ans = mid ;
                                if(findFirstOccurence){
                                    end = mid - 1 ; 
                                }
                                else{
                                    start = mid + 1 ; 
                                }
                            }
                        }
                
                        return ans ; 
                    }
}
