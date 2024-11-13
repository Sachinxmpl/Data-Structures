import java.util.Arrays;

public class cycle_sort {
        public static void main(String[] args) {
                int[] nums= { 3,5,2,1,4} ; 
                cycleSort(nums) ;
                System.out.println(Arrays.toString(nums));
        }

        static void cycleSort(int[] arr){
                int i = 0 ; 
                while(i < arr.length){
                        int correctIndex = arr[i] - 1 ; 
                        if(arr[i] != arr[correctIndex]){
                                //swap eleement at arr[i] to its correctIndex 
                                int temp = arr[i]  ; 
                                arr[i] = arr[correctIndex] ; 
                                arr[correctIndex] = temp ; 
                        }
                        else{
                                i++ ; 
                        }
                }
        }
}

// timecomplexity O(n) 

// when given no's from range 1 to N ==> use cyclic sort 
 //1st iteration i = 0 
//   3 5 2 1 4 

// arr[i] = arr[0] = 3 
// correctindex for 3 = arr[i] -1 ie (3-1) = 2 
// check is(arr[i] === arr[correctIndex]) if yes i++ yes swap 
// (arr[i] 3  != arr[curectIndex 2 ])  swap 


// i= 1 
// already sorted 
