public class steps_reduceto_zeros {
    
}

class Solution {
        int numberOfSteps(int num) {
            int count = 0 ; 
            return helper(num , count);
        }
    
        int helper(int num , int count){
            if(num == 0){
                return count;
            }
            count ++ ; 
            if(num % 2 == 0){
                return helper(num /2 , count);
            }else{
                return helper(num-1 , count);
            }
        }
    };
