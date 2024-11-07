import java.util.* ; 

public class callbyvalue {

            public static void swap(int a , int b){  //parameters or formal parameters 
                        int temp ; 
                        temp = a ; 
                        a = b ; 
                        b = temp ; 
                        System.out.println("Inside the swap function : " + a + " " + b);

            }
            public static void main(String args[]){
                        Scanner sc = new Scanner(System.in) ; 
                        System.out.println("Enter two number ") ; 
                        int x = sc.nextInt() ; 
                        int y = sc.nextInt();
                        swap(x , y ) ;  // actual parameters or arguments 
                        System.out.println("Outside the swap function " +x  + " " + y ) ;  
                        sc.close() ; 
            }
}
