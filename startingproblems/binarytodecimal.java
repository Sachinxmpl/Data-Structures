import java.util.* ; 

public class binarytodecimal {

            public static int  binarytodecimal(int n){   
                        int result = 0 ; 
                        int power =1 ; 
                        while ( n !=0){
                                    int rem = n % 10 ;
                                    result = result  + rem * power ; 
                                    power = power * 2 ; 
                                    n = n /10 ;
                        }
                        
                        return  result; 

            }
            public static void main(String args[]){
                        Scanner sc = new Scanner(System.in) ; 
                        System.out.println("Enter the number in binary") ;
                        int s = sc.nextInt();
                        System.out.println("The decimal number is " + binarytodecimal(s));
                        sc.close() ; 
            }
}
