package Chapter12.practice_p399;

public class Powder extends Matarial {
    @Override
    public void doPrinting() {
        System.out.println("Printing with powder...");
    }

    @Override
    public String toString() {
        return "The material is powder...";
    }
}
