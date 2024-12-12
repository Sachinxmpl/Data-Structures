package OOP.part4;

import java.util.ArrayList;

//overriding some methods of top tier class Object
public class objectClass { 
    public static void main(String[] args) {
        // ArrayList<Integer> ans = new ArrayList<>();
        // ans.add(9);
        // System.out.println(ans.toString());

        Test te = new Test(34); 
        Test copy = te ; 
        Test te2 = new Test(34) ; 
        System.out.println(te.hashCode());
        System.out.println(te2.hashCode());
        System.out.println(copy.hashCode());


        //? == check weather two reference varailb points to same onbject 
        //? .equal() method compares two object based on how it is defined , may be val of variable 

        System.out.println(te == copy);
        System.out.println(te.equals(copy));

        System.out.println(te == te2);
        System.out.println(te.equals(te2));

        System.out.println("__________________________");
        System.out.println(te instanceof Object);
        System.out.println(te instanceof Test);

        System.out.println("___________________");
        System.out.println(te.getClass());
    }
}

class Test{
    private int num ; 
    final static int secret = 10 ; 
    public Test(int num ){
        this.num = num ; 
    }
    @Override 
    public boolean equals(Object obj) {
        return this.num == ((Test)obj).num;
     }

    //this Override the toString() method of object class 
    @Override
    public String toString(){
        return super.toString();
    }


    //hashCode gets random number of an object , its not address , But Math.random()
    @Override 
    public int hashCode(){
        return super.hashCode() ; 
    }
}