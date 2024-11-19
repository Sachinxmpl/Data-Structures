package OOP.oneshot;

public class methodOverriding {
    public static void main(String[] args) {
        B obj = new B();
        obj.hello();
    }
}
class A {
    void hello(){
        System.out.println("Class A says hello");
    }
}

class B extends A{
    void hello(){
        System.out.println("Class B says hello");
    }
}