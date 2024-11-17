package maths.ques;

public class noOf_digits_in_base_b {
        public static void main(String[] args) {
                int ans = findNoOfDigitsInBaseB(15,2) ; 
                System.out.println(ans);
        }

        static int findNoOfDigitsInBaseB(int n , int b){
                int ans = (int)(Math.log10(n)/Math.log10(b)) + 1 ; 
                return ans ; 
        }
}



// Lets talk about 125 in decimal 
// log10(125) =  = 2.0096  so noOfDigits = (int)(2.9006) + 1

// 15 in binary (15 === 1111)
// log2(15) == 3.906 so noOfDigits = (int)(3.906) + 1 