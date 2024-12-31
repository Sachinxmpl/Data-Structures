import java.util.* ; 

public class nest_greater_element2leetcode {
    
}
//leetcode problem 503
//https://leetcode.com/problems/next-greater-element-ii/description/



//time O(n2)  space O(n) not optimized 
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] ans = new int[nums.length] ; 
        Arrays.fill(ans, -1);
        for(int i = 0 ;i < nums.length ; i++){
            for(int j = i + 1 ; j <= i + nums.length -1 ; j++){
                int index = j % nums.length ; 
                if(nums[index] > nums[i]){
                    ans[i] = nums[index] ; 
                    break ; 
                }
            }
        }
        return ans ; 
    }
}


//optimized
//?outer loop runs 2N time and inner stack loop runns at most N times to time O(2N + N)
//?space O(n) for both stack and ans 

class Solution2 {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length ; 
        int[] ans = new int[n] ;
        Stack<Integer> sc = new Stack<>() ;  
        for(int i = 2 * n -1 ; i >= 0 ; i--){
            int curr = nums[i % n] ; 
            while(!sc.isEmpty() && !(sc.peek() >  curr)){
                sc.pop() ; 
            }
            if(i < n){
                if(sc.isEmpty()){
                    ans[i] = -1 ; 
                }else {
                    ans[i] = sc.peek() ; 
                }
            }
            sc.add(curr) ; 
        }

        return ans ; 
    }
}