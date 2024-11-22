package Data_Structures_and_algorithms.recursion.patternsANDsort;

import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1};
        sort(nums , 0 , 1 , 0);
        System.out.println(Arrays.toString(nums));
    }

    //recursive way 
    //time O(n2)
    //space O(n)
    static void sort(int[] nums , int i , int j , int min){
        if(i == nums.length -1){
            return;
        } 
        if(j == nums.length){
            int temp = nums[i] ; 
            nums[i] = nums[min] ; 
            nums[min] = temp ; 
            sort(nums , i+1 , i + 2 , i+1);
            return ; 
        }
        if(nums[j] < nums[min]){
            min = j ; 
        }
        
        sort(nums, i , j+1 , min);
      
    }

    //iterative way 
    static void sort(int[] nums){
        for ( int i = 0 ;i < nums.length -1 ; i++){
            int min = i; 
            for ( int j = i+ 1 ; j < nums.length ; j++){
                if(nums[j] < nums[min]){
                    min = j;
                }
            }

            int temp = nums[i] ; 
            nums[i] = nums[min];
            nums[min] = temp ; 

        }
    }
}
