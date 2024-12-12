package OOP.part5.interfaces;

public class Main {
    public static void main(String[] args) {
        Car1 car = new Car1();

        car.accelerate();
        car.start();
        car.stop();


        //? Lets try something funny 
        Engine bmw = new Car2() ; 
        bmw.accelerate();
        bmw.start();
        bmw.stop();
        // bmw.Player()   bmw is reference variable of type Engine so we cannot access methods of interface Media 

    }
}
