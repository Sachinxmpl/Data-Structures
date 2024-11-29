package recursion.permutations;

import java.util.ArrayList;

public class permutation_string {
    public static void main(String[] args) {
        permuations("","abc");

        ArrayList<String> ans = new ArrayList<String>();
        helper2("", "abcd", ans);
        System.out.println(ans.toString());
    }

    static void permuations(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return ; 
        }
        char ch = up.charAt(0);
        for ( int i = 0 ; i <= p.length() ; i++){
              String f = p.substring(0,i);
              String l = p.substring(i,p.length());
              permuations(f+ch+l, up.substring(1));
        }
    }


    static void helper2(String p , String up , ArrayList<String> list){
        if(up.isEmpty()){
            list.add(p);
            return ; 
        }
        char ch = up.charAt(0);
        for ( int i = 0 ; i <= p.length() ; i++){
            String f = p.substring(0,i);
            String l = p.substring(i, p.length());
            helper2(f+ch+l, up.substring(1), list);
        }
    }


    static int permuationsCount(String p , String up){
        if(up.isEmpty()){
            return 1; 
        }
        int count = 0 ; 
        char ch = up.charAt(0);
        for ( int i = 0 ; i <= p.length() ; i++){
              String f = p.substring(0,i);
              String l = p.substring(i,p.length());
              count = count + permuationsCount(f+ch+l, up.substring(1));
        }
        return count;
    }
}
