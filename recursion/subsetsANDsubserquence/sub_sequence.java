package recursion.subsetsANDsubserquence;
import java.util.* ; 

public class sub_sequence {
    public static void main(String[] args) {
        String str= "abc";  
        findSubset("", str);  
        ArrayList<String> ans = sequenceList("", str) ; 
        System.out.println(ans);
    }
    static void findSubset(String p , String up){
        if(up.isEmpty()){
             System.out.println(p);
             return;
        }
        char ch = up.charAt(0);

        findSubset(p+ch, up.substring(1));
        findSubset(p, up.substring(1));
    }



    //?Returning an arraylist 
    static ArrayList<String> sequenceList(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>() ; 
            list.add(p) ; 
            return list;
       }
       char ch = up.charAt(0);

       ArrayList<String> left = sequenceList(p+ch, up.substring(1));
       ArrayList<String> right = sequenceList(p, up.substring(1));

       left.addAll(right) ; 
       return left ; 
    }

}
