package OOP.part5.interfaces;

public class Car2 implements Engine, Brake, Media {

    @Override
    public void brake() {
        System.out.println("Nornam car brake");
    }

    @Override
    public void start() {
        System.out.println("Start like a normal car");
    }

    @Override
    public void stop() {
        System.out.println("Stop like a normal car");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerate like a normal car");
    }

    @Override
    public void Player() {
        System.out.println("payer");
    }

}
