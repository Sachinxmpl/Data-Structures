package Data_Structures_and_algorithms.recursion.subsetsANDsubserquence;

public class sub_sequence {
    public static void main(String[] args) {
        String str= "abc";  
        findSubset("", str);  
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

}
