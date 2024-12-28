package linear_structures.stacksAndQueues.problems;
import java.util.* ; 

public class minStepsValidParentheses2 {
    
}


class Solution {
    public int minInsertions(String s) {
        int insertions = 0 ; 
        Stack<Character> sc = new Stack<>() ; 
        for(int i = 0;i < s.length() ; i++){
            char ch = s.charAt(i) ; 
            if(ch == '('){
                sc.push(ch) ; 
            }else {
                if(i + 1 < s.length() && s.charAt(i + 1) == ')'){
                    if(sc.isEmpty()){
                        insertions++ ; 
                    }else{
                        sc.pop() ; 
                    }
                    i++ ; 
                }else{
                    if(sc.isEmpty()){
                        insertions +=2 ;
                    }else {
                        sc.pop() ; 
                        insertions++ ; 
                    }
                }
            }
        }

        while(!sc.isEmpty()){
            sc.pop() ; 
            insertions+=2; 
        }
        return insertions; 
    }
}