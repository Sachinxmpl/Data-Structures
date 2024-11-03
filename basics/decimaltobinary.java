import java.util.* ; 


public class decimaltobinary {

            
            public static int helper(int x){
                        int sum = 0 ; 
                        int power = 1;
                        while(x > 0){
                                    int rem = x % 2; 
                                    sum =  rem*power + sum  ; 
                                    power = power * 10 ; 
                                    x = x/2 ; 
                        }

                        return sum ; 
                     
                       
            }
            public static void main(String args[]){
                        Scanner sc = new Scanner(System.in) ; 
                        System.out.println("Enter the decimal number");
                        int n = sc.nextInt(); 
                        System.out.println("The binary equivalent number is " + helper(n));
                        sc.close() ; 
            }
}
