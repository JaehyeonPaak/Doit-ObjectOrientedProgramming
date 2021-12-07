package Chapter8.Q6;

public class Genesis extends Car {
    
    @Override
    public void start() {
        System.out.println("Genesis turn on the engine");
    }

    @Override
    public void drive() {
        System.out.println("Genesis is speeding up");
    }

    @Override
    public void stop() {
        System.out.println("Genesis is stopping");
    }

    @Override
    public void turnoff() {
        System.out.println("Genesis turn off the engine");
    }
    
}
