public class find_noOf_setbits {
        public static void main(String[] args) {
                int ans = noOfSetBits(10);
                System.out.println(ans);
        }
        

        // mehtod 1 couting set bits 
        // time complexity 0(no of digits in binary)
        // time complexity o(logn) ignoring all constants 
        static int noOfSetBits(int n ){
                int count = 0 ; 
                while(n > 0 ){
                        if((n & 1) == 1){
                                count ++ ; 
                        }
                        n = n >> 1 ; 
                }

                return count ; 
        }


        //method 2 

        static int noOfSetBits2(int n ){
                int count = 0 ;
                while(n > 0){
                        count ++ ;
                        n = n & (n-1) ;
                } 
                return count ; 
        }
}
