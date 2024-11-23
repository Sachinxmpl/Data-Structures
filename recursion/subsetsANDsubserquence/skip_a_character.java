package Data_Structures_and_algorithms.recursion.subsetsANDsubserquence;

public class skip_a_character{
    public static void main(String[] args) {
        String str = "bacccaad";


        // System.out.println(helper(str));

        // StringBuilder result = new StringBuilder();
        // StringBuilder ans = helper(str, result, 0);
        // System.out.println(ans.toString());

        System.out.println(removeA(str, 0));
        skip("", "sachin khatri");

    }

    // recursive method 2 take a processes string and unprocessed string
    static void skip(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return ; 
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            skip(p, up.substring(1));
        }else{
            skip(p+ch, up.substring(1));
        }
    }

    //recurive method2 
    static String removeA(String str , int index){
        if(index == str.length()){
            return "";
        }
        char ch = str.charAt(index);
        if(ch == 'A' || ch == 'a'){
            return removeA(str, index+1);
        }else{
            return ch + removeA(str, index+1);
        }
    }

    //recurrsive method 1 
    static StringBuilder helper(String str , StringBuilder result , int s){
       if(s == str.length()){
        return result;
       }

       char ch = str.charAt(s);
       if(ch !='a' && ch !='A'){
        result.append(ch);
       }
       return helper(str, result, s+1);
    }



    //iterative way 
    static String helper (String str){
        StringBuilder ans = new StringBuilder();
        for ( int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            if(ch != 'A' && ch !='a'){
                ans.append(ch);
            }
        }
        return (ans.toString());
    }
}