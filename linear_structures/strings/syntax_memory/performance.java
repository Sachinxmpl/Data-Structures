package linear_structures.strings.syntax_memory;

public class performance {
        public static void main(String[] args) {

                
                // String series = "" ; 
                // for ( int i = 0 ; i < 26 ; i++){
                //         char ch = (char)(i + 'a');
                //         series += ch ;
                // }
                // System.out.println(series);

                //? What is the problem in above code --> strings are immutable 
                // series = "" ; 
                // i = 0 series = "" + 'a' = "a" ;
                // i = 1 series = "a" + 'b' = "ab" ; 
                // i = 2 series = "ab" + 'b' = "abc" ; 
                // i =3 seroes = "abc" + 'd' = "abcd"
                // ..... at last 
                // series = "abcdefghizklmnopqrstuvwxyz"

                // here it is creating many deference object , wastage of memory 
                // series only point to last object all other object "" , "a"  , "ab" , ..... , "abcdefghizklmnopqrstuvwxy" will have no reference variable 

                //O(n2)


                //? How can we solve this problem , what is we create a datatype that is mutable , ie its not creating new object but update the existing object 
                //!StringBuilder 


                StringBuilder builder = new StringBuilder() ; 
                for ( int i= 0 ; i < 26 ; i++){
                        char ch = (char)(i+'a');
                        builder.append(ch) ; 
                }
                System.out.println(builder.toString());
                // here same object is being modified 
                //O(n)
        }
}
