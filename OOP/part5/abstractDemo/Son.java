package OOP.part5.abstractDemo;

public class Son extends Parent{

    public Son(int age){
        super(age); 
    }

    @Override
    void career(){
        System.out.println("I am going to be an engineer" );
    }

    @Override
    void partner(String name , int age){
        System.out.println("My name is " + name + age);
    }
}
