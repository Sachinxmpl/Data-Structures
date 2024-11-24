package OOP.lecture2;

public class StaticBlock {
    static int a = 4 ;
    static int b ; 


    //static block
    static {
        System.out.println("I am in static block");
        b = a + 5 ; 
    }


    public static void main(String[] args) {
        StaticBlock obj= new StaticBlock();
        System.out.println(StaticBlock.a + "  " + StaticBlock.b);

        StaticBlock.b += 3; 
        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " +  StaticBlock.b);
    }
}


//As soon as class is loaded static elements are loaded/run first 
//Static block generally used to initialize static varaibles 
//Static bloack runs only once when the class is loaded fist time 