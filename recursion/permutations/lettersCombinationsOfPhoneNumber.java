package recursion.permutations;

public class lettersCombinationsOfPhoneNumber {
    public static void main(String[] args) {
        helper("" , "12");
    }
    static void helper(String p , String up){
        if(up.isEmpty()){
            System.out.print(p + " ");
            return ; 
        }
        int digit = up.charAt(0) - '0';
        for ( int i = (digit-1)*3 ; i < digit*3 ; i++){
            char ch = (char)(i+'a');
            helper(p+ch, up.substring(1));
        }
    }

    
}
