package Chapter8.Q6;

public class Sonata extends Car {

    @Override
    public void start() {
        System.out.println("Sonata turn on the engine");
    }

    @Override
    public void drive() {
        System.out.println("Sonata is speeding up");
    }

    @Override
    public void stop() {
        System.out.println("Sonata is stopping");
    }

    @Override
    public void turnoff() {
        System.out.println("Sonata turn off the engine");
    }
    
}
