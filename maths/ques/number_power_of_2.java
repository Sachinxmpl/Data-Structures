package maths.ques;

public class number_power_of_2 {
        public static void main(String[] args) {
                int n = 0 ; 
                if(isPowerOfTwo(n)){
                        System.out.println("Yes");
                }else{
                        System.out.println("No");
                }

                System.out.println(isPowerOfTwo2(0));
        }


        // method 1 
        // time complexity o(noOfDigitsInBInary)
        // O(logn)  after ignoring all constants
        static boolean isPowerOfTwo(int n ){
                int noOfDigitsInBinary = (int)(Math.log10(n)/Math.log10(2)) + 1 ; 
                int setBitCount = 0 ; 
                for ( int i = 1 ; i <= noOfDigitsInBinary ; i++){
                        if( (n & ( 1 << (i-1))) !=0){
                                setBitCount++ ;
                        }
                }
                if(setBitCount == 1){
                        return true ; 
                }
                return false ; 
        }



        // method 2 
        // we know 8 = 7 +1 
        // ie 10000 = 111 + 1 
        // so 8 & 7 is always zero 
        // n ans & n-1 is always zero is n is power of 2 

        static boolean isPowerOfTwo2(int n ){
                if(n == 0){
                        return false ; 
                }
                return (n & (n-1)) == 0 ; 
        }



}
