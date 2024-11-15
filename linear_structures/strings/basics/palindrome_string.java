package linear_structures.strings.basics;

public class palindrome_string {
        public static void main(String[] args) {
                String str = "Madam" ; 
                if(checkPalindrome(str)){
                        System.out.println("String is a palindrome");
                }else{
                        System.out.println("String is not a palindrome");
                }
        }

        static boolean checkPalindrome(String str){
                str = str.toLowerCase() ; 
                int x = 0 ; 
                int y = str.length() - 1 ; 
                while(x <= y){
                        if(str.charAt(x) !=  str.charAt(y)){
                                return false ; 
                        }
                        x++ ; 
                        y-- ; 
                }
                return true ; 
        }
}
