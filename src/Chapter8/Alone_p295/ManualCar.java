package Chapter8.Alone_p295;

public class ManualCar extends Car {

    @Override
    public void drive() {
       System.out.println("People drive the car");
       System.out.println("People control the handle");
    }

    @Override
    public void wiper() {
       System.out.println("People adjust the wiper speed");
    }

    @Override
    public void stop() {
       System.out.println("People press the break to stop");
    }
    
}
