public class sum_of_naturalnumbers {
        public static void main(String[] args) {
                System.out.println(findSum(10));
        }

        static int findSum(int n ){
                if(n == 1){
                        return n ; 
                }
                return n + findSum(n-1) ; 
        }
}
