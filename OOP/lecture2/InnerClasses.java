package OOP.lecture2;

public class InnerClasses{
    //static class means the class is same or directlyt related to outer class 
    //All instances of outer class will have same innerclass test
    //But the static class Test can have muiltiple objects of its own
    static class Test{
        String name ; 

        public Test(String name){
            this.name = name ;
        }
    }
    public static void main(String[] args) {
        Test a = new Test("sachin");
        Test b = new Test("Khatri");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}


// static class A{

// }
//OUtside class cannot be static as it doesnot depend on any other class 


//Static varaibles doesn't depend on objects . So static varaibles are compiled during compile time whereas object are created in runtime 