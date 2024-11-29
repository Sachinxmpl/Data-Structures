package recursion.subsetsANDsubserquence;


public class subsets_duplicates_string {
    public static void main(String[] args) {
        helper("", "abbbdc", ' ');
    }

    static void helper(String p , String up , char prev){
        if(up.isEmpty()){
            System.out.print(p + " ");
            return ; 
        }
        char ch = up.charAt(0);
        if(ch == prev){
            helper(p, up.substring(1), ch);
        }else{
            helper(p,up.substring(1),ch);
            helper(p+ch, up.substring(1), ch);
        }
    }
   

}
