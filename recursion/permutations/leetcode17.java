import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<String>();
        if (digits.equals("")) {  // Corrected string comparison
            return ans;
        }
        helper("", digits, ans);
        return ans;
    }

    static void helper(String p, String up, List<String> ans) {
        if (up.isEmpty()) {
            ans.add(p);
            return;
        }
        int digit = up.charAt(0) - '0';
        if (digit == 7) {
            for (int i = 15; i <= 18; i++) {
                char ch = (char)(i + 'a');
                helper(p + ch, up.substring(1) , ans);
            }
        } else if (digit == 9) {
            for (int i = 19; i <= 21; i++) {
                char ch = (char) (i + 'a');
                helper(p + ch, up.substring(1) , ans);
            }
        } else if (digit == 8) {
            for (int i = 22; i <= 25; i++) {
                char ch = (char)(i + 'a');
                helper(p + ch, up.substring(1) , ans);
            }
        }

        else {
            for (int i = (digit - 2) * 3; i <= (digit * 3 - 4); i++) {
                char ch = (char)(i + 'a');
                helper(p + ch, up.substring(1), ans);
            }
        }
    }
}