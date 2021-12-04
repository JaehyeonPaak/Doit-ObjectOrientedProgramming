package Chapter7.Q3;

public class SumOfEven {
    public static void main(String[] args) {
        int[] array = new int[5]; 
        int size = 0;
        int sum = 0;
        for(int i=1; i<=10; i++) {
            if(i%2 == 0 && size<=4) {
                array[size] = i;
                size++;
            }
        }
        for(int i: array) {
            sum += i;
        }
        System.out.println(sum);
    }
}
