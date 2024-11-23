package Data_Structures_and_algorithms.recursion.permutations;

public class permutation_string {
    public static void main(String[] args) {
        permuations("","abc");
    }

    static void permuations(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return ; 
        }
        char ch = up.charAt(0);
        for ( int i = 0 ; i < p.length()+1 ; i++){
              String f = p.substring(0,i);
              String l = p.substring(i,p.length());
              permuations(f+ch+l, up.substring(1));
        }
    }
}
