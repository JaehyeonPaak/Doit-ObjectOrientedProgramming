package Chapter8.Q5;

public class Avante extends Car {
    
    @Override
    public void start() {
        System.out.println("Avante turn on the engine");
    }

    @Override
    public void drive() {
        System.out.println("Avante is speeding up");
    }

    @Override
    public void stop() {
        System.out.println("Avante is stopping");
    }

    @Override
    public void turnoff() {
        System.out.println("Avante turn off the engine");
    }
    
}
