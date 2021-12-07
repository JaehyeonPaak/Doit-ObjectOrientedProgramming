package Chapter8.Alone_p295;

public abstract class Car {
    public void startCar() {
        System.out.println("Turn on the engine");
    }
    
    public void turnOff() {
        System.out.println("Turn off the engine");
    }

    public abstract void drive();
    public abstract void wiper();
    public abstract void stop();

    // Template method ...
    final public void run() {
        startCar();
        drive();
        wiper();
        stop();
        turnOff();
    }
}
