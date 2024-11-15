package linear_structures.strings.basics;

public class search_character {
            public static void main(String[] args) {
                        String name = "Sachin";
                        char target = 'n';
                        System.out.println(linearSearch(name, target));
            }

            static char linearSearch(String str, char ch) {
                        if (str.length() == 0) {
                                    return '!';
                        }
                        for (int i = 0; i < str.length(); ++i) {
                                    if (ch == str.charAt(i)) {
                                                return ch;
                                    }
                        }
                        return '!';
            }
}