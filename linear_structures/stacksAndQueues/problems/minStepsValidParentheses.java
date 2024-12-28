package linear_structures.stacksAndQueues.problems;
import java.util.* ; 

public class minStepsValidParentheses {
    
}
class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> sc = new Stack() ; 
        int count = 0 ;
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i) ; 
            if(ch == '('){
                sc.push(ch) ; 
            }
            else if(ch == ')'){
                if(sc.isEmpty()){
                    count ++ ; 
                }else {
                    sc.pop() ; 
                }
            }
        }
        while(!sc.isEmpty()){
            count ++ ; 
            sc.pop();
        }
        return count ; 
    }
}