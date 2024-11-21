package maths.ques;

public class SieveOfEratosthenes {
      
    public static void main(String[] args) {
        int n = 40 ; 
        boolean[] nums = new boolean[n+1];
        seive(nums , n);
        for ( int i = 2 ; i <=n ; i++ ){
            if(nums[i] == false){
                System.out.print(i + " ");
            }
        }
    }

    static void seive(boolean[] primes , int n){
        for ( int i = 2 ; i <Math.sqrt(n) ; i++){
            if(primes[i] == false){
                for ( int j = i*i ; j <= n ; j=j+i){
                    primes[j] = true ; 
                }
            }
        }
    }
  
}

//Time complexity of function seive 
// O(nlog(logn))

// overall code 
// Time O(n + nlog(logn))
// auxilarry space O(n)

//Q Check for all prime numbers less than or equal to n 
// Better approach 
// we get 2 is prime numbers , do we need to check for multiples of 2 
// 4 6 8 10 12 14 .... are automatically no prime as divisible by 2 
 