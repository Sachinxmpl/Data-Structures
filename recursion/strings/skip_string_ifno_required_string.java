package Data_Structures_and_algorithms.recursion.strings;

public class skip_string_ifno_required_string {
    public static void main(String[] args) {
        String str = "Hi apples is appdf";
        System.out.println(skip(str));
    }

    static String skip(String str){
        if(str.isEmpty()){
            return "";
        }

        if(str.startsWith("app") && !str.startsWith("apple")){
            return skip(str.substring("app".length()));
        }else{
            return str.charAt(0) + skip(str.substring(1));
        }
    }
}

// space complexity O(m) m is length of string 
// time complexity is O(m2)  sustring methods also take O(m) time 
