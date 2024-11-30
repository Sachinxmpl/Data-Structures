package recursion.permutations;

public class NoOf_dicerolls_target_sum{
    public static void main(String[] args) {
        helper("",6);
    }

    static void helper(String p,int target ){
        if(target == 0){
            System.out.print(p + " ");
            return ; 
        }
        for ( int i = 1; i <= target && i <=6 ; i++){
            helper(p+i, target-i);
        }
    }
}
