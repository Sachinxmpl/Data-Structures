package non_linear_dataStructures.hashMap.implementation;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        HashMap<String , Integer>  hm = new HashMap<>() ;
        hm.put("china" , 150) ; 
        hm.put("nepal" , 5) ; 
        hm.put("china" , 1000) ;  
        hm.put("india" , 200)  ; 

        System.out.println(hm.remove("india"));

        ArrayList<String> sets = hm.keyset() ; 
        for ( String key : sets){
            System.out.println(key + " : " +  hm.get(key));
        }
    }
}
