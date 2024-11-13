import java.util.Arrays;
// we have numbers in range [0,N] and one is missing from that range. Find the missing number.   
// in total we have N elements 


//solution 1 ========> we sum of natural number method 
//soution 2 ==> belwo 

public class findmissing_inrange0N {
        public static void main(String[] args) {
                int[] arr = {0 , 6,7,2,3,5,1} ; 
                int ans = findMissingNumberInRangeZeroToN(arr) ; 
                System.out.println(ans + " is missing number") ;
                System.out.println(Arrays.toString(arr));
        }

        static int findMissingNumberInRangeZeroToN(int[] arr){
                cycleSort(arr) ; 
                int ans = -1 ;
                for (int i = 0 ; i < arr.length ; i++){
                        if(arr[i] == arr.length){
                                ans =  i ; 
                        }
                }
                return ans ; 

        }

        static void cycleSort(int[] arr){
                int i = 0 ;
                int length = arr.length ; 
                while(i< length){
                        int correctIndex = arr[i] ; 
                        if(arr[i] !=length && arr[i] !=arr[correctIndex]){
                                int temp = arr[i] ; 
                                arr[i] = arr[correctIndex] ; 
                                arr[correctIndex] = temp ; 
                        }else{
                                i++ ; 
                        }
                }
        }
}
