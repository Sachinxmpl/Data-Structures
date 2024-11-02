import java.util.* ; 

public class switchcase {
            public static void main(String[] args){
                        Scanner sc = new Scanner(System.in) ; 
                        System.out.println("Enter a number ");
                        int n  = sc.nextInt()  ; 
                        switch(n){
                                    case 1 : 
                                                System.out.println("Number");
                                                break;
                                    case 2 : 
                                               System.out.println("Letter") ; 
                                               break; 
                                    default : 
                                                System.out.println("this is default ");
                        }

            }
}
