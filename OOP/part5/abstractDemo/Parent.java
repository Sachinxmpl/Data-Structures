package OOP.part5.abstractDemo;

public abstract class Parent {
    int age  ; 
    final int era = 2000;

    public Parent(int age){
        this.age = age ; 
    }

    static void hello(){
        System.out.println("This is an static method in abstract class parent");
    }
    void normalFucntion(){
        System.out.println("This is a normal function");
    }

    abstract void career();
    abstract void partner(String name , int age);
}

//! If class contains abstract method then the class should also be made abstract 

//We cannot create an object of abstract class 
//So we cannot directly call the constructor of such classes 
//Yet we can define the constructor so we can use via super() in child 

//Abstract class can definetely contain normal fuctions , they can also be overriden 


//? We cannot create abstract contructor (makes no sense)
//? We cannot create abstract static methods ==> makes no sense as static methods cannot be overriden

//?But we can create static methods in abstract classes 
//? We can call them directly via class (no need of object)


//! We cannot have final abstract class 
//As abstract class needs to be extended 
//we can do have a final variable inside the abstract class 



//!Does abstract class solve the problem of multiple inheritance ?
//! No 
//We still cannot extends two abstract class 
//Why ? abstract class can have normal methods 
//Two abstract class might have same methods and hence cause confusion in multiple inheritance 