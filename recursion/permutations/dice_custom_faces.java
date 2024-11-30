package recursion.permutations;

//you are given 1 dice with k faces . Numbers 1-K ; how many combinations can be made to get target t
public class dice_custom_faces {
    public static void main(String[] args) {
        helper("",8,8);
    }
    static void helper(String p , int target , int k ){
        if(target == 0){
            System.out.print(p + " ");
            return ; 
        }
        for ( int i = 1 ; i <= k && i<= target ; i++){
            helper(p+i, target-i, k);
        }
    }
}
