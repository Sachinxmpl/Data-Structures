package OOP.lecture2.staticExample;

public class Example{
    public static void main(String[] args) {
        Human h1 = new Human(12, "sachin",12312,false);
        Human h2 = new Human(123,"Rahul",123,true);
        System.out.println(Human.population);

        geeting();
    }

    //must be static to be used in main as main is static function 
    static void geeting(){
        System.out.println("hello greeting");
    }

    //cannot be accessed inside static method main . 
    //Instance of class Example must be crearted to use meeting()
    void meeting(){
        System.out.println("Meeting");
        geeting();// static  inside non-static is fine (logicallyu
    }
}

 class Human {
    int age ; 
    String name ; 
    int salary ; 
    boolean married;
    static long population ; 

    public Human(int age ,String name , int salary , boolean married){
        this.age = age ; 
        this.name = name ;
        this.salary = salary ; 
        this.married = married ; 
        Human.population += 1; 
    }


    static void Message(){
        System.out.println("Message from human being");
        // System.out.println(this.age); cannot use this inside static methods (obvious)
    }
}

// static varaible are not related to object but are the variable of class 
// public static void main , why is main() function static 
// main is inside a class (same name as file) . So to run any non static functions  you have to create an object 

//but not here main() being static runs without the object as it is the first function that gets called

//Lets go inside the static functions 
//They dont depend on instances(objects) and are part of class 
//So non-static varaibles/methods cannot be accessed inside the static method 
//Simply because non-static members required an instance  