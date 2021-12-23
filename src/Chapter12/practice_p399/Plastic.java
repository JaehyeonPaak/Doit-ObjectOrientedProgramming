package Chapter12.practice_p399;

public class Plastic extends Matarial {
    @Override
    public void doPrinting() {
        System.out.println("Printing with plastic...");
    }

    @Override
    public String toString() {
        return "The material is plastic...";
    }
}
