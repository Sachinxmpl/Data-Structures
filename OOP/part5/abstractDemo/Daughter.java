package OOP.part5.abstractDemo;

public class Daughter  extends Parent{

    public Daughter(int age){
        super(age);
    }


    @Override
    void career(){
        System.out.println("I want to be a coder ");
    }

    @Override
    void partner(String name , int age){
        System.out.println("Name is " + name + "age is " + age );
    }
}
