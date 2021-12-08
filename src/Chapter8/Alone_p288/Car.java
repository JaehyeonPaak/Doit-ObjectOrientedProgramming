package Chapter8.Alone_p288;

public abstract class Car {
    public abstract void run();
    public abstract void refuel();
    public void stop() {
        System.out.println("The car is stopping");
    }
}
