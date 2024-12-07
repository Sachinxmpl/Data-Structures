package OOP.part5.abstractDemo;

public abstract class Parent {
    int age  ; 
    final int era = 2000;

    public Parent(int age){
        this.age = age ; 
    }

    static void hello(){
        System.out.println("This is an static method in abstract class ");
    }

    void normalFucntion(){
        System.out.println("This is a normal function");
    }

    abstract void career();
    abstract void partner(String name , int age);
}


//WE cannot create an object of abstract class 
// SO we cannot directly call the constructor of such classes 
//Yet we can define the constructor so we can use via super() in child 

//Abstract class can definetely contain normal fuctions , they can also be overriden 


//? We cannot create abstract contructor (makes no sense)
//? Wec annot create abstract static methods ==> makes no sense as static methods cannot be overriden

//?But we can create static methods in abstract classes 
//? we can call them directly via class (no need of object)


//! We cannot have final abstract class 
// as abstract class needs to be extended 
//we can do have a final variable inside the abstract class 



//!Does abstract class solve the problem of multiple inheritance 
//! No 

//We still cannot extends two abstract class 
//WHy ? abstract class can have normal functions 
//Two abstract class might have same functions and hence cause confusion in multiple inheritance 