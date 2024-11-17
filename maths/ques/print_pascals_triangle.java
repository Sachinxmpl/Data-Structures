package maths.ques;
import java.util.* ; 

public class print_pascals_triangle {
        public static void main(String[] args) {
                Scanner in = new Scanner(System.in) ; 
                System.out.println("Enter the no of rows ");
                int n = in.nextInt() ; 
                in.close();
                printPascalTriangle(n) ; 
              
        }

        static void printPascalTriangle(int n ){
                for ( int i = 0 ; i < n ; i++){
                        for ( int j = 0 ; j <= i ; j++){
                                int ans = fact(i)/(fact(j)*fact(i-j));
                                System.out.print(ans + " ");
                        }
                        System.out.println();
                }
        }

        static int fact(int x){
                int ans = 1 ; 
                for ( int i = 1 ; i <= x ; i++){
                        ans = ans * i ; 
                }
                return ans ; 
        }
}
