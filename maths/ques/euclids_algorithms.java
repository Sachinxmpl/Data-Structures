package maths.ques;

public class euclids_algorithms {
    public static void main(String[] args) {
        System.out.println(fincGCD(45, 60));
    }

    static int fincGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else if (a > b) {
            return fincGCD(b, a % b);
        }
        return fincGCD(a, b % a);

    }
}
