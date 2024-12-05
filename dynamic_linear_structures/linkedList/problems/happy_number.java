package dynamic_linear_structures.linkedList.problems;

public class happy_number {

}
// https://leetcode.com/problems/happy-number/description/

class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do {
            slow = findSquareODigits(slow);
            fast = findSquareODigits(findSquareODigits(fast));
        } while (fast != slow);
        if (slow == 1) {
            return true;
        }
        return false;
    }

    int findSquareODigits(int n) {
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem * rem;
            n = n / 10;
        }
        return sum;
    }
}