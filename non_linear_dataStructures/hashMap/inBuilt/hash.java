package Data_Structures_and_algorithms.non_linear_dataStructures.hashMap.inBuilt;

import java.util.*;

public class hash {
  public static void main(String[] args) {
    HashMap<String , Integer> hm = new HashMap<>() ; 

    //insert O(1)
    hm.put("Sachin", 400) ; 
    hm.put("Karan" , 500) ; 
    hm.put("kunal" , 700)  ; 
    hm.put("random" , 800) ; 

    //get O(1)
    Integer marks = hm.get("Sachin") ; 
    System.out.println(marks);

    //ConstainsKey O(1)
    System.out.println(hm.containsKey("Rabin"));
    System.out.println(hm.containsKey("Sachin"));

    //Remove O(1)
    Integer removed = hm.remove("random") ; 
    System.out.println(removed);

    //isEmpty() O(1)
    // hm.clear();
    // System.out.println(hm.isEmpty());


    System.out.println("__________________");

    //?Iteration on hashMap 
    //keySet() method in hashMap returns all keys which is stored in Set data structure
    Set<String> keys = hm.keySet() ; 
    for(String key : keys){
        System.out.println(hm.get(key));
    }
    System.out.println(keys);


    
  }
}
