package Chapter10.Alone_p319;

public class CompleteCalc extends Calculator {

    @Override
    public int times(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        if(num2 == 0) {
            return Calc.ERROR;
        }
        else {
            return num1 / num2;
        }
    }

    public void showInfo() {
        System.out.println("Calc interface is implemented");
    }

    @Override
    public int square(int num1) {
        return num1 * num1;
    }
    
}
