import java.util.* ; 

public class syntaxarray {

            public static void changearray ( int [] marks ) {
                        marks[0] = 10 ; 
            }

            public static void main(String[] args) {
                        int[] numbers; // declaration of aray , numbers is getting defined in stack
                        numbers = new int[5]; // here actaully object is being created in heap memory

                        int marks[] = {12,3,234,423};
                        System.out.println(marks[3]);

                        //for each loop 
                        for ( int  ans : marks ){
                                    System.out.print(ans + " ");
                        }


                       



                        //Array of objects 
                        String[] str  = new String[5] ; 
                        

                        changearray(marks) ; 

                        System.out.println(Arrays.toString(marks)) ;

            }
}
