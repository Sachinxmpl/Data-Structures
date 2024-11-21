

public class factorial_number {
    public static void main(String[] args) {
        System.out.println(fact(0));
    }
    static int fact(int n){
        if(n == 0 || n ==1){
            return 1;
        }
        return n * fact(n-1);
    }

    //time complexity O(N)
    //space complexity O(N)
}
