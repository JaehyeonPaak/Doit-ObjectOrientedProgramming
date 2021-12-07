package Chapter8.Alone_p288;

public class Bus extends Car {
    
    @Override
    public void run() {
        System.out.println("The bus is going");
    }

    @Override
    public void refuel() {
        System.out.println("Charge natural gas");
    }

    public void takePassenger() {
        System.out.println("Give a passenger a seat");
    }
}
