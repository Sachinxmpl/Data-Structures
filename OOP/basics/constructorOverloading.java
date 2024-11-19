

public class constructorOverloading {
        public static void main(String[] args) {
                Student s1 = new Student(12, "sachin") ;
                Student s2 = new Student(s1) ; 

                System.out.println(s2.age);
        }
}



class Student{
        int age ;
        String name ; 
        
        Student(){

                //this is how you call constructor from other constructor
                this(123,"hari");
        }

        Student(int age , String name){
                this.age = age ; 
                this.name = name ; 
        }
        Student(Student other){
                this.name = other.name ; 
                this.age = other.age ; 
        }
}