

public class wrapper_class {
        public static void main(String[] args) {
                int a = 10 ; 
                int b = 20 ; 
                swap(a,b) ; 
                System.out.println("Value of A is : " + a);
                System.out.println("Value of B is : " + b);

                Integer c =  40 ; 
                Integer d = 50 ; 
                swap2(c , d) ;
                System.out.println("Value of C is : " + c);
                System.out.println("Value of D is : " + d); 
                //notice the value is still not swapped because Integer class is defined with final keyword 

                // num = 20 ; 
                final int num = 10 ; 
                // this will give compilation error because final keyword is used to define the variable and it cannot be changed after its definition.
        } 
        static void swap2(Integer a , Integer b){
                Integer temp = a ; 
                a  = b ; 
                b = temp ; 
        }
        static void swap(int a , int b){
                int temp = a ; 
                a = b ; 
                b = temp ; 
        }
}
