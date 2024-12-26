public class recursiveInsertionSort {
    
}

class Solution {
    // Please change the array in-place
    public void insertionSort(int arr[]) {
       helper(arr , 0 , 0) ; 
    }
    public void helper(int[] arr , int i  , int j){
        if(i == arr.length){
            return ; 
        }
        if(j == 0){
            helper(arr , i + 1 , i + 1) ; 
            
        }else {
            if(arr[j-1] > arr[j]){
                int temp = arr[j-1] ; 
                arr[j-1] = arr[j] ; 
                arr[j] = temp ; 
            }
            helper(arr , i , j-1) ; 
        }
    }
}