package Chapter10.Q7;

public interface Sort {
    int[] ascending(int[] arr);
    int[] descending(int[] arr);
    default void description() {
        System.out.println("Number Sorting Algorithm");
    };
}
