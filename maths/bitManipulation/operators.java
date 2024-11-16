package maths.bitManipulation;

public class operators {
        public static void main(String[] args) {
                //bitwise and operator 
                int a = 5 ; 
                System.out.println(a&3);

                // bitwise or operator 
                System.out.println(5|3);  // 101 | 011 => 111

                //XOR (if and only if ) 
                System.out.println(5^3);

                //complement operator 
                System.out.println(~5);

                //left shift operator 
                System.out.println(10 << 1); 
                // 10 << 1 ===> 1010 << 1 ===> 10100 == 2 
                // a << 1 == 2a 
                // a << b = a * 2^b


                //right shift operator 
                // 10 >> 1 ==> 1010 >> 1 ==> 101 == 5

                System.out.println(10 >> 1);
                // a >> 1 == a/2 
                // a >> b == a/2^b
        }
}
