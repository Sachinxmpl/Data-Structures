package OOP.part6.Comparing;

public class Student implements Comparable<Student>{
    int rollno ;
    float marks ; 

    public Student (int roll , float m){
        rollno = roll ; 
        marks = m ; 
    }

    @Override
    public int compareTo(Student other ){
        if(this.marks > other.marks){
            return 1; 
        }
        if(this.marks == other.marks){
            return 0 ; 
        }
        return -1 ; 
    }

    @Override
    public String toString(){
        return marks + "" ; 
    }
}
