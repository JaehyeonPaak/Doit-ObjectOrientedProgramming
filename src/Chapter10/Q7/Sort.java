package Chapter10.Q7;

public interface Sort {
    void ascending(int[] arr);
    void descending(int[] arr);
    default void description() {
        System.out.println("Number Sorting Algorithm");
    };
}
