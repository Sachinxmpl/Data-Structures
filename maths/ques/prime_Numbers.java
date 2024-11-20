package maths.ques;

public class prime_Numbers{
    public static void main(String[] args) {
        //Find all prime numbers less than equal to n 
        int n = 24;
        for ( int i = 1 ; i <= n  ; i++){
            System.out.println(i + " " + isPrime(i));
        }
    }



   
    static boolean isPrime(int n ){
        if(n <= 1){
            return false ; 
        }
        for ( int i = 2 ; i <= Math.sqrt(n) ; i++){
            if( n % i == 0){
                return false ; 
            }
        } return true;
    }

}



//complexity for isPrime function only 
 // time complexity O(sqrtN)
    // space complexity O(1)


// overall program complexity 
// time O(n*sqrtn)
