package linear_structures.strings.syntax_memory;

public class comparision {
        public static void main(String[] args) {
                String a = "Sachin" ; 
                String b = "Sachin" ; 

                // == checks if reference variable points to same object 
                System.out.println(a == b) ; // true Stringpool 


                //?How to create difference string object of same value  , use new keyword

                String c = new String("Kunal");
                String d = new String("Kunal");
                System.out.println(c == d); // false as both point to differenct objects 

                System.out.println(c.equals(d)); // true as check for value only 

        }
}
