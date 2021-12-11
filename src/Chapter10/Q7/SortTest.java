package Chapter10.Q7;

import java.io.IOException;

public class SortTest {
    public static void main(String[] args) throws IOException {
        System.out.println("Choose the sorting methods below and type ...");
        System.out.println("B : Bubble sort");
        System.out.println("H : Head sort");
        System.out.println("Q : Quick sort");

        int ch = System.in.read();
        Sort sort = null;

        if(ch == 'B' || ch == 'b') {
            sort = new BubbleSort();
        }
        else if(ch == 'H' || ch == 'h') {
            sort = new HeadSort();
        }
        else if(ch == 'Q' || ch == 'q') {
            sort = new QuickSort();
        }
        else {
            System.out.println("There is no corresponding type ...");
        }

        int[] arr = {4, 2, 1, 5, 7, 9, 8, 6, 3, 0};
        
        sort.description();
        sort.ascending(arr);
        sort.descending(arr);
    }
}
