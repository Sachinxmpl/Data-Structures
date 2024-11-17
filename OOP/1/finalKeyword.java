

public class finalKeyword {
        public static void main(String[] args) {
                final int a = 10 ; 
                // a = 20  error 
                //using final keyword with primitive datatype , the value of variable cannot be changed , it is constant

                Student sachin = new Student("Sachin K.C.");
                System.out.println(sachin.name);
                System.out.println(sachin.batch);


                final Student s1 = new Student("Harry");
                // this final mean s1 cannot point to another object 
                // when a non primitive is final , you cannot reassign it 
                // you can change the value though 

                s1.name = "changeDHane";
                System.out.println(s1.name);
        }

       
}


class Student{
        final int batch = 2080 ;
        String name ; 

        Student(String name){
                this.name = name ; 
        }
}
