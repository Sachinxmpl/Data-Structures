package recursion.strings;

public class palindromeString {
        public static void main(String[] args) {
                String str = "Madams";
                str = str.toLowerCase();
                System.out.println(Ispalindrome(str, 0, str.length() - 1));
        }

        static boolean Ispalindrome(String str, int s, int e) {
                if (s >= e) {
                        return true;
                }
                if (str.charAt(s) != str.charAt(e)) {
                        return false;
                }
                return Ispalindrome(str, s + 1, e - 1);
        }
}
