package OOP.part7;

import java.util.*;

public class collectionFramework {
    public static void main(String[] args) {
        List<Integer> ans = new ArrayList<>();
        List<Integer> list = new LinkedList<>();

        list.add(12);
        list.add(13);

        List<Integer> v = new Vector<>();
        v.add(45);
        v.add(34);
        System.out.println(v);
    }
}


//! Difference between vector and arraylist is that vector is synchronized 
// vector ==> only one thread can access the vector object 

//Arraylist is faster as multiple threads can access it , vector only one thread access it at a time 

