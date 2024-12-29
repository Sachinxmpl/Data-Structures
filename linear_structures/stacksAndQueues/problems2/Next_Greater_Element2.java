
//? given arr = [4,12,5,3,1,2,5,3,1,2,4,6] return array of next greater element for each index. if no  next greater -1 
//? ans is [12,-1,5,3,12,-1,5,3,12,-1,4]

//?Monotonic stack approach 

//start  from back of array 
//use stack 

import java.util.Arrays;
import java.util.Stack;


//!Time complexity 
//O(N) for i  = n - 1 ; i >= 0 ; i --
// for while looop stack  in worst stack we do stack.pop() for n times 
//time O(N) + O(N)

//space O(n)
public class Next_Greater_Element2 {
    public static void main(String[] args) {
        int[] nums = {4,12,5,3,1,2,5,3,1,2,4,6} ; 
        Stack<Integer> stack = new Stack<>();

        int[] ans = new int[nums.length] ;

        int n = nums.length ; 
        int i = n - 1; 
        while(i >= 0 ){
            int current = nums[i] ;

            //remove the elements froms stack that are smaller thatn current 
            while(!stack.isEmpty() && !(stack.peek() > current)){
                stack.pop() ; 
            }
            if(stack.isEmpty()){
                ans[i] = - 1 ;
            }else {
                ans[i] = stack.peek() ;
            }

            stack.push(current) ;

            i-- ; 
        }

        System.out.println(Arrays.toString(ans)) ; 
    }
}
