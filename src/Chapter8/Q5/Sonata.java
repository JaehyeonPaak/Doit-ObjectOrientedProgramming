package Chapter8.Q5;

public class Sonata extends Car {

    @Override
    public void start() {
        System.out.println("Sonata turn on the engine");
    }

    @Override
    public void drive() {
        System.out.println(" is speeding up");
    }

    @Override
    public void stop() {
        System.out.println(" is stopping");
    }

    @Override
    public void turnoff() {
        System.out.println(" turn off the engine");
    }
    
}
