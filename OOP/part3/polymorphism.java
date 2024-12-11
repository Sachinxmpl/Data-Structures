package OOP.part3;

public class polymorphism {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circles circle = new Circles();
        Squares square = new Squares();

        //calss methods in individual class 
        square.area();
        circle .area() ; 
        shape.area() ; 
        
        System.out.println("______________________________");


        //! 
        Shapes obj = new Squares() ;
        //?which version of overriden method to be called is determined at runtime 
        obj.area(); // class ared of Square() not Shapes
        obj.testFunction();
        // obj.SampleFunction() ;  error as what can be acces depend on Shapes

        //?Since the type of reference varaible obj is Shapes 
        //?To what methods obj can access depends on Shapes
        //?Since area is overriden , so the overriden one is called 
    
        //! Static method can be inherited but cannot be overriden 
        Shapes ojb = new Squares() ; 
        ojb.teststaticfunction();
        

        //?Static method being inherited by Squares of class Shapes 
        Squares.teststaticfunction();
    }
}

class Shapes{
    void area(){
        System.out.println("I am in shape ");
    }

    //? Put final to make sure that the method cannot be overriden
    final void testFunction(){
        System.out.println("this is test function in shapes class");
    }


    static void teststaticfunction(){
        System.out.println("this is the test static function ");
    }
}
class Circles extends Shapes {
    @Override
    void area(){
        System.out.println("I am in cicle ");
    }
}
class Squares extends Shapes{
    @Override //annotation
    void area(){
        System.out.println("I am in square ");
    }

    void SampleFunction(){
        System.out.println("In squares");
    }
}


//Types of polymorphism 

//! 1 Compile time / static polymorphism 
// can be acheived by method overloading , 
// Also acheived bu operator overloading but java doesn't support operator overloading 

//This is called compile time , java determines which methods to call during compile time 



//! 2 Runtime /DYnamic polymorphism 
// Acheived via method overriding 

//Method overriding child class also has same method as parent class 
//CHild and parent have same function defination just different body 
//To check overriding use annotation @override




//! Static method  can be inherited but cannot be overriden 
//! oop3 ==> 