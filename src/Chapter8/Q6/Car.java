package Chapter8.Q6;

public abstract class Car {
    public abstract void start();
    public abstract void drive();
    public abstract void stop();
    public abstract void turnoff();
    //Add washCar() method ...
    public void washCar() {
        System.out.println("Wash car");
    }

    final public void run() {
        start();
        drive();
        stop();
        turnoff();
        washCar();
    }
}
