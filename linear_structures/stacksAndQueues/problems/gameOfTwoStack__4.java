package linear_structures.stacksAndQueues.problems;

import java.util.*;

//hackerrank 
//https://www.hackerrank.com/challenges/game-of-two-stacks/problem

public class gameOfTwoStack__4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int x = sc.nextInt();

            List<Integer> l1 = new ArrayList<>();
            List<Integer> l2 = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                int temp = sc.nextInt();
                l1.add(temp) ; 
            }
            for (int j = 0; j < m; j++) {
                int temp = sc.nextInt() ; 
                l2.add(temp) ; 
            }

            System.out.println(twoStacks(x  , l1 , l2));
        }
        sc.close();
    }

    public static int twoStacks(int maxSum, List<Integer> a, List<Integer> b) {
        return helper(a, b, maxSum, 0, 0);
    }

    static int helper(List<Integer> a, List<Integer> b, int maxSum, int currSum, int count) {
        if (currSum > maxSum) {
            return count - 1;
        }
        if (a.isEmpty() && b.isEmpty()) {
            return count;
        }
        if (a.isEmpty()) {
            return helper(a, b.subList(1, b.size()), maxSum, currSum + b.get(0), count + 1);
        }
        if (b.isEmpty()) {
            return helper(a.subList(1, a.size()), b, maxSum, currSum + a.get(0), count + 1);
        }
        List<Integer> newList1 = a.subList(1, a.size());
        List<Integer> newList2 = b.subList(1, b.size());
        int left = helper(newList1, b, maxSum, currSum + a.get(0), count + 1);
        int right = helper(a, newList2, maxSum, currSum + b.get(0), count + 1);
        return Math.max(left, right);
    }

}
