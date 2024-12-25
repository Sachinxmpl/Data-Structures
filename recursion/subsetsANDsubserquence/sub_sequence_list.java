package recursion.subsetsANDsubserquence;

import java.util.ArrayList;

public class sub_sequence_list {
    public static void main(String[] args) {
        String str = "abcd";
        ArrayList<String> result = subSeq("",str);
        System.out.println(result);

        //method 2
        ArrayList<String> ans = new ArrayList<>();
        subSeq("",str,ans);
        System.out.println(ans.toString());
    }


    //method2
    static void subSeq(String p , String up , ArrayList<String> ans){
        if(up.isEmpty()){
            if(p ==""){
                return;
            }
            ans.add(p);
            return ; 
        }

        char ch = up.charAt(0);
        subSeq(p, up.substring(1),ans);
        subSeq(p+ch, up.substring(1),ans);
    }

    static ArrayList<String> subSeq(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> store = new ArrayList<>();
            store.add(p);
            return store ; 
        }
        
        char ch = up.charAt(0);

        ArrayList<String> left = subSeq(p+ch, up.substring(1));
        ArrayList<String> right = subSeq(p, up.substring(1));

         left.addAll(right);
         return left;
    }
}
 