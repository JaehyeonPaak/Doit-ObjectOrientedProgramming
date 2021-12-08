package Chapter8.Alone_p295;

public class AICar extends Car {

    @Override
    public void drive() {
        System.out.println("Auto driving activated");
        System.out.println("AICar changes the direction by itself");
    }

    @Override
    public void wiper() {
        System.out.println("Speed is changed accordingly");
    }

    @Override
    public void stop() {
        System.out.println("Stop automatically");
    }
    
}
