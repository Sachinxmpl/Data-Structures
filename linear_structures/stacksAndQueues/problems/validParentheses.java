package linear_structures.stacksAndQueues.problems;
import java.util.* ; 

public class validParentheses{
    
}

class Solution {
    public boolean isValid(String s) {
        Stack<Character> sc = new Stack<Character>() ; 
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i) ; 
            if(ch == '(' || ch == '{' || ch == '['){
                sc.push(ch) ; 
            }
            else if(ch == ')'){
                if(sc.isEmpty() || sc.peek() != '('){
                    return false ; 
                }
                sc.pop() ; 
            }
            else if(ch == '}'){
                if(sc.isEmpty() || sc.peek() != '{'){
                    return false ; 
                }
                sc.pop() ; 
            }
            else if(ch == ']'){
                if( sc.isEmpty() || sc.peek() != '[' ){
                    return false ; 
                }
                sc.pop() ; 
            }
        }

        return sc.isEmpty() ; 
    }
}