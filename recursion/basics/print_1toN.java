public class print_1toN {
        public static void main(String[] args) {
                printDescending(5);
                System.out.println("_____");
                printAscending(5);
        }

        static void printDescending(int n) {
                if (n == 0) {
                        return;
                }
                System.out.println(n + " ");

                printDescending(n - 1);
        }

        static void printAscending(int n) {
                if (n == 0) {
                        return;
                } 
                printAscending(n-1);
                System.out.println(n);
        }

}