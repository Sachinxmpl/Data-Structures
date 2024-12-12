package OOP.part5.abstractDemo;



public class main {
    public static void main(String[] args) {
        Son son = new Son(30);
        son.career();
        
        Daughter shila = new Daughter(12);
        shila.partner("suman",23);
        shila.normalFucntion();

        // Parent p = new Parent() error abnstract class 

        //calling static methods of abstract class 
        Parent.hello();
        Son.hello();


    }   
}
