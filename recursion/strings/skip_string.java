package recursion.strings;

public class skip_string {
    public static void main(String[] args) {
        String str = "Apple is eaten by Sapple eater";
        skip("",str);

        String ans = skip(str);
        System.out.println(ans);
    }
    
    static String skip(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
        if(up.startsWith("Apple") || up.startsWith("apple")){
            return skip( up.substring("Apple".length()));
        }else{
            return ch + skip( up.substring(1));
        }
    }

    //skip string apple 
    static void skip(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return ; 
        }
        char ch = up.charAt(0);
        if(up.startsWith("Apple") || up.startsWith("apple")){
            skip(p, up.substring("Apple".length()));
        }else{
            skip(p+ch, up.substring(1));
        }

    }
}
