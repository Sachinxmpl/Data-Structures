public class nth_fibonacci_number {
        public static void main(String[] args) {
                System.out.println(" Nth fibonacci number is " + fibo(4));
                System.out.println("The sum of first n fibonacii number is "+ sum(5));
        }

        static int fibo(int n) {
                if (n == 0)
                        return 0;
                if (n == 1)
                        return 1;
                return fibo(n - 1) + fibo(n - 2);
        }

        static int sum(int n) {
                if (n <= 0)
                        return 0;

                return fibo(n-1) + sum(n - 1);
        }
}
