package Chapter8.Q6;

public class Grandeur extends Car {
    
    @Override
    public void start() {
        System.out.println("Grandeur turn on the engine");
    }

    @Override
    public void drive() {
        System.out.println("Grandeur is speeding up");
    }

    @Override
    public void stop() {
        System.out.println("Grandeur is stopping");
    }

    @Override
    public void turnoff() {
        System.out.println("Grandeur turn off the engine");
    }
    
}
