package OOP.oneshot;


//constructor is special function automatically invoked during object creatiion
//no return 
public class Constructortypes {
    
}


class Student{
    private String  name ; 
    private int roll ; 
    static int noOfStudents = 0 ; 
    
    Student(){
        System.out.println("Default constructor called");
    }

    Student(String name, int roll){
        this.name = name ;
        this.roll = roll ; 
    }
}