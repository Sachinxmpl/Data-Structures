package OOP.part3;

public class staticAndFinalStuff {
    public static void main(String[] args) {
        Child c2 = new Child() ; 
        Child.hello(); 
    }
}


final class Random{
    void randomHello(){
        System.out.println("ths is hello fromr andom");
    }
}

//?Cannot extend the final class 
// class Random2 extends Random{

// }

class Parent{
    static void hello(){
        System.out.println("hello from parent");
    }
}

class Child extends Parent {
    //! error 
    // @Override
    // static void hello(){
    //     System.out.println("children");
    // }

    //!no error we do Child.hello()
    //?This is not overiding , this is hiding the static method of parent 
    static void hello(){
        System.out.println("children");
    }

}