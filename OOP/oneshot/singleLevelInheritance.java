package OOP.oneshot;

public class singleLevelInheritance {
    public static void main(String[] args) {
        Fish shark = new Fish(); 
        shark.eat();
    }
}


class Animal{
    String color ; 

    void eat(){
        System.out.println("Eats");
    }
}

class Fish extends Animal{
    int fins ; 

    void swim(){
        System.out.println("I can swim");
    }

}