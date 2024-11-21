public class sum_of_digits {
    public static void main(String[] args) {
        int n = 16680 ; 
        System.out.println(findSum(n));
    }

    static int findSum(int n){
        if(n == 0 ){
            return 0 ; 
        }
        return (n % 10) + findSum(n/10);
    }

    static int findProduct(int n){
        if(n < 10){
            return n ; 
        }
        return (n % 10) * findProduct(n/10);
    }
}
