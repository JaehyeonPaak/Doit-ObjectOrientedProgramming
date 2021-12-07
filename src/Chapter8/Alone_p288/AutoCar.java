package Chapter8.Alone;

public class AutoCar extends Car {

    @Override
    public void run() {
        System.out.println("Car is going");
    }

    @Override
    public void refuel() {
        System.out.println("Fill up gasoline");
    }

    public void load() {
        System.out.println("Load the luggage up");
    }
    
}
