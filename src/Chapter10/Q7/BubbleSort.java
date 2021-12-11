package Chapter10.Q7;

public class BubbleSort implements Sort {

    @Override
    public int[] ascending(int[] arr) {
       System.out.println("Ascending Array Via Bubble Sort");
       for(int i=0; i<arr.length-1; i++) {
           if(arr[i] > arr[i+1]) {
               int temp;
               temp = arr[i+1];
               arr[i+1] = arr[i];
               arr[i] = temp;
           }
       }
       return arr;
    }

    @Override
    public int[] descending(int[] arr) {
        System.out.println("Descending Array Via Bubble Sort");
        return arr;
    }
    
}
