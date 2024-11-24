package OOP.part4;

import java.util.ArrayList;

//overriding some methods of top tier class Object
public class objectClass {
   
    
    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(9);
        System.out.println(ans.toString());
    }
}

class Test{
    @Override
    public String toString(){
        return super.toString();
    }
}