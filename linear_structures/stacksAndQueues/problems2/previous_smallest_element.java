import java.util.*;

public class previous_smallest_element {

}


//!time complexity O(n) for outer looop and O(n) for inner stack loop 
//space O(n) for both stack and ans 
class Solution {
    public int[] prevSmaller(int[] A) {
        int n = A.length;
        int[] ans = new int[n];
        Stack<Integer> sc = new Stack<>();

        for (int i = 0; i < n; i++) {
            int curr = A[i];
            while (!sc.isEmpty() && !(sc.peek() < curr)) {
                sc.pop();
            }
            if (sc.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = sc.peek();
            }

            sc.push(curr);
        }

        return ans;
    }
}
