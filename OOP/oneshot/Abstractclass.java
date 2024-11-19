package OOP.oneshot;

public class Abstractclass {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
    }
}


abstract class Animal{
    void eat(){
        System.out.println("Animal eats");
    }

    abstract void walk();
}

class Horse extends Animal{
    //it is compulsary to havce walk function abstract fxn
    void walk(){
        System.out.println("Walks");
    }
}

//abstract class 
//cannot create an instance of abstract class
//can have abstract/non-abstract methods 
//abstarct class can have constructor though