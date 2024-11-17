import java.util.Arrays;

public class main {
        public static void main(String[] args) {
                        Student s = new Student(); 
                        Student[] arr = new Student[3] ; 
                        
                        System.out.println(Arrays.toString(arr));
                        System.out.println(s);
                        System.out.println(s.name);
                        System.out.println(s.age);
                        System.out.println(s.marks);
        }
}

class Student {
        int age ; 
        String name ; 
        float marks ; 


        Student(){
                this.name = "Sachin" ;
                this.age = 25 ; 
                this.marks = 4.4f ; 
        }
}