package recursion.permutations;

public class permutation_count {
    public static void main(String[] args) {
        System.out.println(helper("","12"));
    }
    static int helper(String p , String up){
        if(up.isEmpty()){
            return 1 ;
        }
        int count = 0 ; 
        int digit = up.charAt(0) - '0';
        for ( int i = (digit-1)*3 ; i < (digit) * 3 ; i++){
            char ch = (char)(i + 'a');
            count = count + helper(p+ch, up.substring(1));
        }
        return count ; 
    }
}
