import java.util.*;

public class methods{
        public static void main(String[] args) {
                String name = "Sachin KHATRI" ; 
                System.out.println(name.toCharArray());
                System.out.println(name.toLowerCase());
                System.out.println(name);

                System.out.println(name.indexOf('a'));
                // System.out.println(name[0]); error 

                System.out.println("   sachin       ".strip());
                System.out.println(Arrays.toString("the name is john cena".split(" ")));
        }
}