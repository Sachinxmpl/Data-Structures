package linear_structures.stacksAndQueues.problems;

import java.util.Scanner;

public class gameOfStacks__5 {
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

            System.out.println(gamer(a, b, x, 0, 0, 0));
        }
        sc.close();
    }

    static int gamer(int[] a, int[] b, int x, int i, int j, int currSum) {
        // Base case: if the current sum exceeds x
        if (currSum > x) {
            return 0; // No more elements can be added
        }

        // If both stacks are exhausted, return 0 (no more elements to pick)
        if (i >= a.length && j >= b.length) {
            return 0;
        }

        // Recursive options
        int takeFromA = 0, takeFromB = 0;

        // Option 1: Take the next element from stack A (if possible)
        if (i < a.length) {
            takeFromA = 1 + gamer(a, b, x, i + 1, j, currSum + a[i]);
        }

        // Option 2: Take the next element from stack B (if possible)
        if (j < b.length) {
            takeFromB = 1 + gamer(a, b, x, i, j + 1, currSum + b[j]);
        }

        // Return the maximum score from both options
        return Math.max(takeFromA, takeFromB);
    }
}
