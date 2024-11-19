package OOP.oneshot;

public class shallowAndDeepCopy {
    public static void main(String[] args) {
        Student s = new Student("Sachin" , new int[]{12,3,4});
        Student copy = new Student(s) ; 

        for ( int i = 0 ;i < 3 ; i++){
            System.out.println(copy.marks[i]);
        }

        s.marks[0] = 1 ; 
        s.marks[1] = 2;

        for ( int i = 0 ;i < 3 ; i++){
            System.out.println(copy.marks[i]);
        }

        //changes made in marks of object s is also reflected in copy as only the reference varaible is copied which eventually points to same array
    }
}


class Student{
    private String name ; 
    public int[] marks ; 


    Student(String name ,int[] marks ){
        this.name = name ; 
        this.marks = marks ; 
    }

    //shallow copy constructor 
    // Student(Student s){
    //     this.name = s.name ; 
    //     this.marks = s.marks ; 
    // }

    //deep copy 
    Student(Student s){
        marks = new int[3] ; 
        this.name = s.name ; 
        for ( int i = 0 ; i < 3 ; i++){
            this.marks[i] = s.marks[i];
        }
    }
}