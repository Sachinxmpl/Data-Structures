public class reverse_number {
    public static void main(String[] args) {
        int n = 124374; 
        System.out.println(findReverse(n,0));
    }


    static int findReverse(int n , int rev ){
       if(n == 0){
        return rev ; 
       }

       return findReverse(n/10, rev*10 + n % 10);
       
    }



    // ugly approach
    // static int sum = 0 ; 
    // static void rev1(int n){
    //     if(n == 0){
    //         return ;
    //     }
    //     sum = sum * 10 + n % 10 ; 
    //     rev1(n/10);
    // }
    // public static void main(String[] args) {
    //     rev1(124234);
    //     System.out.println(sum);
    // }
}
