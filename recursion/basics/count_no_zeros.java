public class count_no_zeros {

    public static void main(String[] args) {
        int n = 3004000;
        System.out.println(countZeros(n,0));
    }

    static int countZeros(int n ,int count ){
        if(n == 0){
            return count;
        }
        int rem = n % 10 ; 
        if( rem == 0){
            count ++ ; 
        }
        return countZeros(n/10, count);
    }

    // static int count = 0 ; 
    // static void helper(int n ){
    //     if(n == 0){
    //         count ++ ; 
    //         return ; 
    //     }
    //     if(n < 10){
    //         return ; 
    //     }
    //     int rem = n % 10 ; 
    //     if(rem == 0){
    //         count ++ ; 
    //     }
    //     helper(n/10);
    // }
    // public static void main(String[] args) {
    //     helper(4700400);
    //     System.out.println(count);
    // }
}
