import java.util.Arrays;

public class selection_sort {
        public static void main(String[] args) {
                 int[] nums = {-23  , 5 ,2 , 2, 0 , -2 , 343 , 2441 , 9};
                 selectionSort2(nums);
                System.out.println(Arrays.toString(nums));
        }

        static void selectionSort(int[] arr){
                int n = arr.length ; 
                for ( int i = 0 ;i < n-1 ; i++){
                        int min = i ; 
                        boolean isOtherMin = false ; 
                        for ( int j = i+1 ; j < n ; j++){
                                if(arr[j] < arr[min]){
                                        min = j ; 
                                        isOtherMin = true ; 
                                }
                        }
                        //swap 
                        if(isOtherMin){
                                int temp = arr[i] ; 
                                arr[i] = arr[min] ; 
                                arr[min] = temp ; 
                        }
                }
        }

        static void selectionSort2(int[] arr){
               for ( int i = 0 ; i < arr.length - 1 ; i++){
                        int last = arr.length - i - 1 ; 
                        int maxIndex = last ;  // assume 
                        
                        // get the maxIndex in range 0 to maxinde x
                        for ( int j = 0 ; j < last ; j++){
                                if (arr[j] > arr[maxIndex]){
                                        maxIndex = j ; 
                                }
                        }

                        //swap 
                        int temp = arr[last] ; 
                        arr[last] = arr[maxIndex] ; 
                        arr[maxIndex] = temp ; 
               }
        }
}


//time complexity ==> O(n2)\

// first iteration i = 0 
// consider minimum element min = i = 0 ; 
// search if any other element in range i+1 to last 
// if any other element is less than min min = j 
// by swapping take the minimum element at i = 0 

// 2nd iteration i = 1 ; 
// consider min = i = 1 
// search for minimumin range i+1 = 2 to last 
// if yes swap 


//? Stability 