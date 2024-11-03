import java.util.* ; 

public class array{

            public static void helper(int marks[]){
                        Scanner sc = new Scanner(System.in) ; 
                        for ( int i = 0 ;i < marks.length ;    i++){
                                    marks[i] = sc.nextInt() ; 
                        }
                        sc.close() ; 
            }

            public static void printarray(int marks[]){
                        for ( int i = 0 ; i < marks.length ; i++){
                                    System.out.print(marks[i] + "  ") ; 
                        }
            }

            public static void main(String args[]){
                        int marks[]= new int[5] ; 
                        helper(marks) ; 
                        printarray(marks) ; 
                        
            }
}