package Chapter10.Alone_p319;

public class CalculatorTest {
    public static void main(String[] args) {
        CompleteCalc calculator = new CompleteCalc();
        int num1 = 10;
        int num2 = 5;
        System.out.println(calculator.add(num1, num2));
        System.out.println(calculator.substract(num1, num2));
        System.out.println(calculator.times(num1, num2));
        System.out.println(calculator.divide(num1, num2));
        calculator.showInfo();

        System.out.println(calculator.square(num1));
    }
}
