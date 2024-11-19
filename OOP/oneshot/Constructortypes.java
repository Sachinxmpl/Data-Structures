package OOP.oneshot;


//constructor is special function automatically invoked during object creatiion
//no return 
public class Constructortypes {
    public static void main(String[] args) {
        Student s1 = new Student("Sachin", 12);
        Student sachin = new Student(s1);
    }
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

    //copy constructor 
    Student(Student s){
        this.name = s.name ; 
        this.roll =  s.roll ;
    }
}