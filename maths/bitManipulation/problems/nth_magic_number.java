// 1st magic number = 5 ^ 1 == 2 
// 2nd magic number 10 ==> 5^2 = 25
// 3rd magic number =  11 --> 5^2 + 5 == 30
// 5th magic number = 101 ===> 5^3 + 5 ==> 130
// 6th magic number = 110 ===> 5^3 + 5^2 == 150
// 7th magic number = 111 ==> 5^3 + 5^2 + 5 == 155


public class nth_magic_number {
        public static void main(String[] args) {
                System.out.println(helper(7));
        }

        static int helper(int n ){
                int base = 5 ; 
                int ans = 0 ; 
                while(n > 0){
                        int lastbit = (n & 1) ; 
                        ans = ans + lastbit * base ; ;
                       n =  n >> 1 ; 
                       base = base * 5 ; 
                }

                return ans ; 
        }
}

// complexity of code 
// loop is running no of digits in binary times 
// ie for 7 ==> 111 the loop runs 3 times 
// for 2 ==> 10 the loop runs 2 times 

// complexity is O(noofdigitsinbinary)


// we know no of digits of number a in base b is (int)(logb(a))+1
// in above code no of digits of number n in base 2 is (int)(log2(n))+1
// ignoring all constants 
// time complexity ==== O(logn)