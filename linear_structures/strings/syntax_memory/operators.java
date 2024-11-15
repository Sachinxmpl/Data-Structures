package linear_structures.strings.syntax_memory;
import java.util.*;

public class operators {
        public static void main(String[] args) {
                //onstring operator + is overloaded to concatenate 

                System.out.println('a'+'b'); // converted to ASCII code and added 67+68
                System.out.println("a"+"b");  // concatenated
                System.out.println('a'+3); // 97 + 3 

                System.out.println("a"+1); 
                //integer will be converted to Integer that will call toString()
                //it will be same as ("a"+"1");

                System.out.println("Kunal"+ new ArrayList<>());
                System.out.println("Kunal" + new Integer(45));

               // System.out.println(new ArrayList<>()+ new Integer(45));// error 
               // + plus operator only with primitives and strings
        }
}
