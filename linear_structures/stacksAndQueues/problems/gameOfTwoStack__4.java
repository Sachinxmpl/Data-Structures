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

            int[] a = new int[n];
            int[] b = new int[m];
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }
            for (int j = 0; j < m; j++) {
                b[j] = sc.nextInt();
            }

            System.out.println(gamer(a, b, x));
        }
        sc.close();
    }

    static int gamer(int[] a, int[] b, int sum) {
        return gamer(a, b, sum, 0, 0);
    }

    static int gamer(int[] a, int[] b, int sum, int currSum, int count) {
        if (currSum > sum) {
            return count;
        }
        if (a.length == 0 || b.length == 0) {
            return count;
        }

        int ans1 = gamer(Arrays.copyOfRange(a, 1, a.length), b, sum, currSum + a[0], count + 1);
        int ans2 = gamer(a, Arrays.copyOfRange(b, 1, b.length), sum, currSum + b[0], count + 1);

        return Math.max(ans1, ans2) - 1 ;
    }

}
